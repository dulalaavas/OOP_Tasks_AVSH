public class apr28{
    static int add(int a, int b){
        return a+b;
    }
    static void mul(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String[] args){
        int sum = add(5,6);
        System.out.println(sum);
        mul(5,6);

    }
}