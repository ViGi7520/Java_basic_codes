// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Check_array_equal {
    public static void main(String[] args) {
       /* int a1[]={1,2,3,4,5};
        int a2[]={1,2,3,4,5};*/

        //a1
        Scanner input = new Scanner(System.in);
        int[] a1 = new int[5];
        System.out.println("Enter 5 numbers in array 1: ");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = input.nextInt();
        }

        //a2
        Scanner input1 = new Scanner(System.in);
        int[] a2 = new int[5];
        System.out.println("Enter 5 numbers in array 2: ");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = input1.nextInt();
        }

        boolean status= Arrays.equals(a1,a2);

        if(status){
            System.out.println("Arrays are Equal");
        }
        else
        {
            System.out.println("Arrays are not Equal");
        }

        input.close();
        input1.close();
    }
}
