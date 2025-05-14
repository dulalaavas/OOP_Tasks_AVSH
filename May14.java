import java.util.ArrayList;
import java.util.Arrays;
public class May14 {
    static void printList(ArrayList<String> list) {
        
    }
    public static void main(String[] args) {
        // ArrayList<datatype> variableName = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>(); //here integer is a wrapper class of int data type

        String[] stringArray={"Max","Kev"};
        ArrayList<String> list1 = 
        new ArrayList<>(Arrays.asList(stringArray));
        list.add(7);
        list.add(5);
        list.set(0,8);
        list.remove(1);
        list1.remove("Max");
        System.out.println(list.contains(1));
        System.out.println(list.indexOf(8));
        list.clear();
    }
}