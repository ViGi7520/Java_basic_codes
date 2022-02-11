import java.util.Scanner;

public class GCD_of_2_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find GCD ");

        int n1 = sc.nextInt(), n2 = sc.nextInt();    // find GCD between n1 and n2
        int gcd = 1;             // initially set to gcd

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }

            System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
            sc.close();
        }

    }
}