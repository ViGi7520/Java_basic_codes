import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Original number- "+num);

        int rev = 0;

        while(num!=0){
            rev = rev*10 + num%10;      //note- '%' gives last number of the digit
            num = num/10;               //note- '/' removes last number of the digit

        }
        System.out.println("Reverse number- "+rev);
        sc.close();

    }
}
