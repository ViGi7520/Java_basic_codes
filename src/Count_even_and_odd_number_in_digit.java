import java.util.Scanner;

public class Count_even_and_odd_number_in_digit
{

    public static void main(String[] args)
    {

        System.out.println("Enter a Number:- ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count_even = 0;
        int count_odd = 0;

        while (num > 0) {
            int rem = num % 10;  //note- '%' gives last number of the digit

                if (rem % 2 == 0)
                 {
                    count_even++;
                 }
                 else
                 {
                    count_odd++;
                 }
                 num=num/10;          //note- '/' removes last number of the digit
            }
            System.out.println("Number of Even digits:- " + count_even);
            System.out.println("Number of Odd digits:- " +count_odd);

    }

}



