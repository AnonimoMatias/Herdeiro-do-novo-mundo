public abstract class Item{
    private final String id;
    private final String name;
    private final int StackMax;
    private booleam consumables;

    public Item (String id, String name, int StackMax, boolean consumables) {
        this.id = id;
        this.name = name;
        this.StackMax = StackMax;
        this.consumables = consumables;
    }

    public abstract usar();

    public abstract void getnome();

    public abstract void getStackMax();

    public abstract void getconsumables();

}