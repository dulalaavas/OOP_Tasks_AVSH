import java.util.Arrays;
import java.util.Scanner;

public class May13{
    static int[] arrayMethod(){
        int[] array1=new int [5];
        return array1;
    }

    static int lengthArray(int[] arr){
        return arr.length;
    }
    static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int[] newArray = arrayMethod();
        int length=lengthArray(newArray);
        printArray(newArray);
        int[][] twoDArray=new int[3][2];

        int rowLength=twoDArray.length;
        int columnLength=twoDArray[0].length;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<columnLength;j++){
                twoDArray[i][j]=sc.nextInt();
            }
        }

        for(int[] row:twoDArray){
            for(int value:row){
                System.out.print(value);
            }
            System.out.println("hi?");
        }        
    }
}