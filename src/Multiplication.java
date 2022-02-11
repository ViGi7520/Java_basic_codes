import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find Multiplication ");

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float result = a * b;

        System.out.println("The result is: " + result);
        sc.close();

    }
}
