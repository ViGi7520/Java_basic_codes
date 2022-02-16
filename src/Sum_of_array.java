import java.util.Scanner;


public class Sum_of_array {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a= new int[5];
        System.out.println("Enter 5 numbers in array: ");
        for(int i=0; i<a.length; i++){
            a[i] = input.nextInt();
        }

        int sum = 0;
        for(int i=0;i<5;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of array= "+sum);
    }
}
