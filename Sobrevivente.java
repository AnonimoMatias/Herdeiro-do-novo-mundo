public abstract class Sobrevivente {
    private final String id;
    private int HealthPoints = 100;
    protected int posX;
    protected int posY;

    public Sobrevivente(String id, int posX, int posY, int HealthPoints) {
        this.id = id;
        this.posX = posX;
        this.posY = posY;
        setHealthPoints(HealthPoints);
    }

    public int getHealthPoints() {
        return HealthPoints;
    }

    public String getId() {
        return id;
    }

    public void setHealthPoints(int HealthPoints) {
        if (HealthPoints > 100) {
            this.HealthPoints = 100;
        } else if (HealthPoints <= 0) {
            if (HealthPoints > 0) {
                this.HealthPoints = 0;
                gameOver();
            }
        } else {
            this.HealthPoints = HealthPoints;
        }
    }

    public void usar(PocaoCura cura) {
        setHealthPoints(getHealthPoints() + cura.usar());
    }

    protected void moverPosicao(int dx, int dy) {
        this.posX = this.posX + dx;
        this.posY = this.posY + dy;
    }

    protected void gameOver() {
        IO.println(id + ": fim de jogo!");
    }

    public abstract void patrulhar();

    public abstract void attack();

    public abstract void dodge();
}