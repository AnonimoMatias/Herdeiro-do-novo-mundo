public class Crafitables extends Item {
    private boolean consumables;
    private boolean crafitables;

    public Crafitables(String id, String name, int StackMax, boolean crafitables, boolean consumables) {
        super(id, name, StackMax);
        this.crafitables = crafitables;
        this.consumables = consumables;
    }

    public boolean isConsumables() {
        return consumables;
    }

    public boolean isCrafitables() {
        return crafitables;
    }

    public void getinformencion() {
        IO.println(getName());
        IO.println(getStackMax());
    }

    @Override
    public int usar() {
        return 0;
    }

}
