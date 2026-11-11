public class PocaoCura extends Consumables{
    private int cura = 25;

    public PocaoCura ( String id, String name, int StackMax, boolean consumables, String efeito, int cura) {
        super(id, name, StackMax, consumables, efeito);
        this.cura = cura;
    }

    public void getinformencion(){
       IO.println(getName()); 
       IO.println(getStackMax()); 
       IO.println(isConsumables());
    }


    @Override
    public int usar() {
        return cura;
    }

  
    
}