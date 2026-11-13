public class PocaoCura extends Consumables{
    private int cura = 25;

    public PocaoCura ( String id, String name, int StackMax, boolean consumables, boolean crafitables, String efeito, int cura) {
        super(id, name, StackMax, consumables, crafitables, efeito);
        this.cura = cura;
    }

    public void getinformencion(){
       IO.println(getName()); 
       IO.println(getStackMax()); 
       if (consumables) {
        IO.println(isConsumables());
       }
    }

    @Override
    public int usar() {
        return cura;
    }

  
    
}