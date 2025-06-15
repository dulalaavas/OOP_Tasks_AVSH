// process of hiding implemntation details and showing only functionality to the usrs is called abstraction
// 1. Abstract Class: 0 % to 100% abstraction
// 2. Interface: 100% abstraction
// use abstract keyword to create an abstract class and methods

abstract class Furniture {
// you can not create an object -- cannot be instantiated
    void greet() {
        System.out.println("Hello");
    }
    public Furniture() {
        System.out.println("Furniture called");
    }
    abstract void printName();
}
class Closet extends Furniture {
    public Closet() {
        System.out.println("Closet called");
    }

    @Override
    void printName() {
        System.out.println("Closet");
    }

}
// interface does not support constructor
interface Furniture1 {
    void printLength();

    // final attribuites -- constant
    // abstract methods only
}
interface Box {
    void printVolume();
}
class MyColoset implements Furniture1,Box {

    @Override
    public void printLength() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printLength'");
    }

    @Override
    public void printVolume() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printVolume'");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        // Furniture furniture = new Furniture(); -- error because you can not make an object of an abstract class
        Closet cloest = new Closet();
        cloest.greet();
        cloest.printName();
    }
}