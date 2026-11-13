import java.util.Random;

public abstract class Weapon extends Item {
    private int damageBase;
    private int damageVariance;
    private int hitChance;
    private int criticalChance;
    protected int upgrade;
    private static final Random random = new Random();
    private static final double MIN_MULT = 0.75; // 25% a menos
    private static final double MAX_MULT = 2.25; // 225%
    private static final double criticalMulti = 2.5; // 15 -> 37

    public Weapon(String id, String name, int StackMax, int damageBase, int damageVariance, int hitChance,
            int criticalChance, int upgrade) {
        super(id, name, StackMax);
        this.damageBase = damageBase;
        this.damageVariance = damageVariance;
        this.hitChance = hitChance;
        this.criticalChance = criticalChance;
        this.upgrade = upgrade;
    }

    public int getcriticalChanceTotal(int bonusitem) {
        int total = criticalChance + bonusitem;
        return Math.max(0, Math.min(100, total));
    }

    public int ataque() {
        int min;
        int max;
        int n = (int) (Math.random() * 2);
        if (n == 0) {
            min = (int) (damageBase * MIN_MULT);
            this.damageVariance = min;
            return 0;
        }
        if (n == 1) {
            max = (int) (damageBase * MAX_MULT);
            this.damageVariance = max;
            return 1;
        }
        if (random.nextInt(100) >= hitChance) {
            return 0;
        }

        if (random.nextInt(100) > getcriticalChanceTotal(criticalChance)) {
            return (int) (damageVariance * criticalMulti);

        }

        return damageVariance;
    }

    public abstract boolean haveskill();

    @Override

    public void getinformencion() {
        IO.println(getName());
        IO.println(getStackMax());
    }
}