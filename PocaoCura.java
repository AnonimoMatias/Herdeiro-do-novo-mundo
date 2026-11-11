public class PocaoCura extends consumables{
    private final int cura = 25;

    public PocaoCura ( String id, String name, int StackMax, boolean consumables, String efeito, int cura) {
        super(id, name, StackMax, consumables, efeito);
        this.cura = cura;
    }

    @Override 
    public boolean usar(Sobrevivente alvo) {
        int vida = alvo.getHealthPoints();
        if (vida <= 0 || vida >= 100) {
            return false;
        }
        alvo.setHealthPoints(vida + cura);
        return true;
    }

    public void getinformencion(){
       IO.println(getname); 
       IO.println(getStackMax); 
       IO.println(getconsumables);
    }
    
}