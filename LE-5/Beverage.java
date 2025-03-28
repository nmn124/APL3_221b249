abstract class Beverage{
    private void pour(int qty){
        System.out.println("add "+ qty +" ml of beverage");
    }
    
    protected abstract void add_Condiment();
    
    protected void stir() {}   //hook
    
    private void serve(){
        System.out.println("serve through waiter");
    }
    
    public final void templateMethod(int qty){
        pour(qty);
        add_Condiment();
        stir();
        serve();
    }
}