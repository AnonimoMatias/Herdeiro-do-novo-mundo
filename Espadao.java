public class Espadao extends Weapon {
    private String skillName = "Ábobora Voadora";

    public Espadao(String id, String name, int StackMax, boolean consumables, int damageBase, int damageVariance,
            int hitChance, int criticalChance, boolean hasSkill, int upgrade, String skillName) {
        super(id, name, StackMax, consumables, damageBase, damageVariance, hitChance, criticalChance, hasSkill,
                upgrade);
        this.skillName = skillName;
    }


    public void getinformencion() {
        IO.println(getName());
        IO.println(getStackMax());
    }


    @Override
    public boolean haveskill() {
        return true;
    }


    @Override
    public int usar() {
       return ataque();
    }
}