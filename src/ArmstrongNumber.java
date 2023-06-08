import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select  operation:-\n 1- Get Armstrong number list \n 2- Check Armstrong number ");
        

        int op = sc.nextInt();          // operation selection

        if (op == 1) {
            System.out.println("Get Armstrong number list selected");
            int num;
            System.out.print("Enter the limit: ");
            num = sc.nextInt();         // reads the limit from the user
            // num=999999999;

            System.out.println("Armstrong Number up to " + num + " are: ");

            for (int i = 0; i <= num; i++)

                if (isArmstrong(i)) // function calling

                    System.out.print(i + ", "); // prints the armstrong numbers

            sc.close();
        }

        if (op == 2) {
            System.out.println("2- Check Armstrong number selected");
            int num;
            System.out.print("Enter the number: "); 
            
            num = sc.nextInt();
            
            //checking by function calling 
            if (isArmstrong(num)) {
                System.out.print(num + " is Armstrong number");
            } else {
                System.out.print(num + " is Not Armstrong number");
            }
            sc.close();
        }
    }


    static boolean isArmstrong(int n) // function to check if the number is Armstrong or not

    {
        int temp, digits = 0, last = 0, sum = 0;

        temp = n; // assigning n into a temp variable

        while (temp > 0) // loop execute until the condition becomes false
        {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {

            last = temp % 10; // determines the last digit from the number

            sum += (Math.pow(last, digits)); // calculates the power of a number up to digit times and add the resultant
                                             // to the sum variable

            temp = temp / 10; // removes the last digit

        }
        if (n == sum) // compares the sum with n

            return true; // returns if sum and n are equal

        else
            return false; // returns false if sum and n are not equal

    }



}