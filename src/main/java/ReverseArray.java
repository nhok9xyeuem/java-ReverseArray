import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int [] array=new int[20];
        initializationArray(array);
        reverseArray(array);
        displayArray(array);
    }

    private static void displayArray(int[] array) {
        for (int value:array){
            System.out.println(value);
        }
    }

    private static void initializationArray(int[] array) {
        Scanner input=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            System.out.println("Enter the value : " +i );
            int value=input.nextInt();
            array[i]=value;
        }

    }

    private static void reverseArray(int[] array) {
        for (int i= 0 ; i<array.length/2;i++){
            int reverse = array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=reverse;
        }
    }
}
