import java.util.Scanner;

public class Sum_of_digits_in_number {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while(num!=0){
            sum = sum + num%10;         //note- '%' gives last number of the digit
            num = num/10;               //note- '/' removes last number of the digit

        }
        System.out.println("Sum of Digit in a Number- "+sum);

    }
}
