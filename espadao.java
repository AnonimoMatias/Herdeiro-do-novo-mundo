public class espadao extends Weapon {
    private String skillName = "Ábobora Voadora";

    public espadao(String id, String name, int StackMax, boolean consumables, int damageBase, int damageVariance,
            int hitChance, int criticalChance, boolean hasSkill, int upgrade, String skillName) {
        super(id, name, StackMax, consumables, damageBase, damageVariance, hitChance, criticalChance, hasSkill,
                upgrade);
        this.skillName = skillName;
    }

    @Override

    public boolean hasSkill() {
        return true;
    }

    public void usar() {
    }

    public void getinformencion() {
        IO.println(getname);
        IO.println(getStackMax);
    }
}