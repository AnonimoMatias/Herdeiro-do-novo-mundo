public abstract class Consumables extends Item{
    private String efeito;
    protected boolean  consumables;
    private boolean  crafitables;

    public Consumables ( String id, String name, int StackMax, boolean consumables, boolean crafitables, String efeito){
        super(id, name, StackMax);
        this.consumables = consumables;
        this.crafitables = crafitables;
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }

    public boolean isConsumables() {
        return consumables;
    }

    public boolean isCrafitables() {
        return crafitables;
    }

    public void getinformencion(){
       IO.println(getName()); 
       IO.println(getStackMax());
    }
    
} 