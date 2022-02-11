import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find Addition ");

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        float result = a + b;

        System.out.println("The Result is: " + result);
        sc.close();
    }
}
