//May19

public class Constructor {
    int num;

    Constructor() {
        System.out.println("Non Parameterized Constructor");
    }
    Constructor(int a) {
        num=a;
    }

    Constructor(int a, int b) {
        int sum=num+b;
        this.num=num;
    }

    Constructor(String val) {
        System.out.println("New parameterized with "+val);
    }

    Constructor(Constructor obj) {
        System.out.println("Copy Constructor");
        num=obj.num;
    }
    
    void setNum(int num) {
        this.num=num;
    }

    public static void main(String[] args) {
    }
}

class UsingConstructor{
    public static void main(String[] args) {
        Constructor obj1= new Constructor();
        Constructor obj2= new Constructor(1);
        Constructor obj3= new Constructor(12, 2);
        Constructor obj4= new Constructor("Hello");
        Constructor obj5= new Constructor(obj2);
    }
}