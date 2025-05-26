public class Citizen {
    private String name;
    private String citizenNumber;
    private int age;

    public Citizen(String name, String citizenNumber, int age){
        this.name =name;
        this.citizenNumber= citizenNumber;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

class CitizenImp{
    public static void main(String[] args) {
        Citizen citizen1 = 
        new  Citizen("Nirish","N374MN2432N",20);
        
    }
}
