import java.util.Scanner;

public class Palindrome_number {
    public static void main() {

        System.out.print("Enter a number:- ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int org = num;
        int rev = 0;

        while(num!=0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }

        if(org==rev)
        {
            System.out.println(org+ " -This is a palindrome number");
        }
        else
        {
            System.out.println(org+ " -This is not a palindrome number");
        }
        sc.close();
    }
}
