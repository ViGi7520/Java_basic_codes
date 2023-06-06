import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
// copy from
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
// to

        for (int i = 0; i < a.length; i++) {  //print elements from array
            System.out.println(a[i]);
        }
        input.close();
    }
}