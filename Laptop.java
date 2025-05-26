public class Laptop {
    private String color;
    String model;
    private double price;
    public void setModel(String model) {
        
    }
    public void openApp(){
        System.out.println(model + "opened app.");
    }
    public void closeApp(){
        System.out.println(model + "closed app.");
    }

    public Laptop(){
        System.out.println("Constructor called");
    }
    public Laptop(String model){
        System.out.println("Constructor with model"+model);
    }
    public Laptop(double price){
        System.out.println("Constructor price: "+price);
    }
    public Laptop(String model,double price, String color){
        this.color=color; 
        this.price=price;
        this.model=model;
        System.out.println("All values set by constructor.");
    }
}
class LaptopDriver{
    public static void main(String[] args) {
        int a;
        Laptop acer = new Laptop();
        Laptop hp = new Laptop("hp");
        Laptop dell = new Laptop(20000);
        Laptop asus = new Laptop("asus",2000000,"black");
    }
}