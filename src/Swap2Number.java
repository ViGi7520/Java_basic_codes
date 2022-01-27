import java.util.Scanner;

public class Swap2Number {
    public static void main(String[] args) {

        Scanner num= new Scanner(System.in);

        System.out.println("Enter two numbers...");
        int a = num.nextInt();
        int b = num.nextInt();

        System.out.println("before swapping number.. " +a+ " " +b);

        // using third variable method
        /*
        int c = a;
        a = b;
        b = c;

         */

        // 2nd method
        /*
        a = a+b;
        b = a-b;
        a = a-b;

         */

        // 3rd method
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("after swapping number.. " +a+ " " +b);
    }
}
