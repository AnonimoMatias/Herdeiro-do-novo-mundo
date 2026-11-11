import java.util.Random;

public abstract class Weapon extends Item{
    private int damageBase;
    private int damageVariance;
    private int hitChance;
    private int criticalChance;
    private boolean hasSkill;
    protected int upgrade;
    private static final Random random = new Random();
    private static final double minMult = 0.75;   // 25% a menos
    private static final double maxMult = 2.25;   // 225%
    private static final double criticalMulti = 2.5;   // 15 -> 37
    
    public Weapon ( String id, String name, int StackMax, boolean consumables, int damageBase, int damageVariance, int hitChance,  int criticalChance, boolean hasSkill, int upgrade) {
        super(id, name, StackMax, consumables);
        this.damageBase = damageBase;
        this.damageVariance = damageVariance;
        this.hitChance = hitChance;
        this.criticalChance = criticalChance;
        this.hasSkill = hasSkill;
        this.upgrade = upgrade;
    }

    public int getcriticalChanceTotal (int bonusitem){
        int total = criticalChance + bonusitem;
        return Math.max(0, Math.min(100, total));
    }

    public int ataque(int damageBase, int damageVariance){
        if (random.nextInt(100) >= hitChance) {
            return 0;
        }

        if (random.nextInt(100) > getcriticalChanceTotal(criticalbonusitem)) {
            return (int) (damageBase * criticalMult);
            
        }

        int min = (int) (damageBase * MIN_MULT);
        int max = (int) (damageBase * MAX_MULT);
        return min + random.nextInt(max - min + 1);
    }
    public boolean haveskill(){
        return false;
    }

    @Override
    public usar(){}

    public void getinformencion(){
       IO.println(getname); 
       IO.println(getStackMax); 
    }
}