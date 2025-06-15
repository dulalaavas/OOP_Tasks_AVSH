class MyAnimal {
    public MyAnimal(){
        System.out.println("Animal constructor non paramerterized");
    }
    public MyAnimal(int age){
        System.out.println("Animal constructor paramerterized");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public void walk(){
        System.out.println("Animals can walk.");
    }
}

class Human extends MyAnimal{
    public void talk(){
        System.out.println("Humans can talk.");
    }
    // when parent and child have same method, the method from child is called
    public void walk(){
        // super refers to the attributes and methods of immediate parent
        super.walk();
        System.out.println("Human Walks.");
    }
}

class Snake extends MyAnimal{
    public void hiss(){
        System.out.println("Snake hisses");
    }
    public void walk(){
        System.out.println("Snake crawls");
    }
}

class Cobra extends Snake{
    public void isDangerous(){
        System.out.println("Cobras are dangerous");
    }
}

class Bird extends MyAnimal{
    public void eat(){
        System.out.println("Birds can eat");
    }
    public void fly(){
        System.out.println("Birds can fly");
    }
}

class Ostrich extends Bird{
    public void fly(){
        System.out.println("Ostrich can fly");
    }
    
}

public class InheritanceExample{
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.talk();
        human1.eat();
        human1.walk();
    }
}