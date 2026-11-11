public abstract class Consumables extends Item{
    private String efeito;

    public Consumables ( String id, String name, int StackMax, boolean consumables, String efeito){
        super(id, name, StackMax, consumables);
        this.efeito = efeito;
    }

    public void getinformencion(){
       IO.println(getName()); 
       IO.println(getStackMax()); 
       IO.println(isConsumables());
    }
    
} 