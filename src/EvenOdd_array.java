import java.util.Scanner;

public class EvenOdd_array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
/*
        System.out.println("Even");
        for(int i=0; i<a.length;i++){
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("Odd");
        for(int i=0; i<a.length;i++){
            if (a[i]%2!=0)
                System.out.println(a[i]);
        }
  */
        System.out.println("Even");
        for(int value:a){
            if(value%2==0)
                System.out.println(value);
        }
        System.out.println("Odd");
        for(int value:a){
            if(value%2!=0)
                System.out.println(value);
        }

        input.close();
    }
}
