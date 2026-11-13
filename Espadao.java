public class Espadao extends Weapon {
    private String skillName = "Ábobora Voadora";

    public Espadao(String id, String name, int StackMax, int damageBase, int damageVariance, int hitChance, int criticalChance, boolean hasSkill, int upgrade, String skillName) {
        super(id, name, StackMax, damageBase, damageVariance, hitChance, criticalChance, upgrade);
        this.skillName = skillName;
    }


    public void getinformencion() {
        IO.println(getName());
        IO.println(getStackMax());
    }


    @Override
    public boolean haveskill() {
       if (skillName != null && !skillName.isBlank()) {
        return true;
        } else {
        return false;
        }
    }

    public int usar() {
       return ataque();
    }
}