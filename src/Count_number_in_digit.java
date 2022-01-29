import java.util.Scanner;

public class Count_number_in_digit {
    public static void main() {

        System.out.println("Enter a Number:- ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        while(num>0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Number of digits:- " +count);
        sc.close();
    }
}
