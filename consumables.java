public abstract class  consumables extends item{
    private String efeito;

    public consumables ( String id, String name, int StackMax, boolean consumables, String efeito){
        super(id, name, StackMax, consumables);
        this.efeito = efeito;
    }

    public abstract boolean usar(Sobrevivente alvo);

    public void getinformencion(){
       IO.println(getname); 
       IO.println(getStackMax); 
       IO.println(getconsumables);
    }
    
} 