public abstract class Item {
    private final String id;
    private final String name;
    private final int StackMax;

    public Item(String id, String name, int StackMax) {
        if (StackMax <= 0) {
            throw new IllegalArgumentException("stackMax deve ser maior que 0");
        }
        this.id = id;
        this.name = name;
        this.StackMax = StackMax;
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

    public abstract int usar();

    public abstract void getinformencion();
}