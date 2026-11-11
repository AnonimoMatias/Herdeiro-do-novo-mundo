public abstract class Item{
    private final String id;
    private final String name;
    private final int StackMax;
    private boolean  consumables;

    public Item (String id, String name, int StackMax, boolean consumables) {
        this.id = id;
        this.name = name;
        this.StackMax = StackMax;
        this.consumables = consumables;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getStackMax() {
        return StackMax;
    }

    public boolean isConsumables() {
        return consumables;
    }

    public abstract int usar();   

}