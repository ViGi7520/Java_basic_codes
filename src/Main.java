import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean input = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("This is combinations of various mathematical terms");
        System.out.println("Our Operations as follows:-");
        System.out.println("1:- Swapping Number");
        System.out.println("2:- Reverse Number");
        System.out.println("3:- Palindrome Number");
        System.out.println("4:- Count Number in Digit");
        System.out.println("5:- Count Even & Odd Number in Digit");
        System.out.println("6:- Find the Largest of 3 numbers");
        System.out.println("7:- Sum of Digits in Number");
        System.out.println("8:- Factorial of a Number");
        System.out.println("9:- Random Number");

        System.out.print("Choose operation by entering the number:- ");
        int operation = sc.nextInt();

        switch (operation) {
            case 1 -> {
                System.out.println("Swapping of Number selected");
                Swapping_numbers();
            }
            case 2 -> {
                System.out.println("Reverse of Number Selected");
                Reverse_number();
            }
            case 3 -> {
                System.out.println("Palindrome of Number Selected");
                Palindrome_number();
            }
            case 4 -> {
                System.out.println("Count Number in Digit Selected");
                Count_number_in_digit();
            }
            case 5 -> {
                System.out.println("Count Even & Odd Number in Digit");
                Count_even_odd_number_in_digit();
            }
            case 6 -> {
                System.out.println("Find the Largest of 3 Numbers");
                Find_largest_of_3numbers();
            }
            case 7 -> {
                System.out.println("Sum of Digits in Number");
                Sum_of_digits_in_number();
            }
            case 8 -> {
                System.out.println("Factorial of a Number");
                Factorial_num();
            }
            case 9 -> {
                System.out.println("Random Number");
                Find_random_num();
            }
            default -> System.out.println("Invalid input");
        }
        System.out.println("\n Program exited...");
        }
    public static void Swapping_numbers() {

        Scanner num = new Scanner(System.in);

        System.out.print("Enter two numbers...");
        int a = num.nextInt();
        int b = num.nextInt();

        System.out.println("Before swapping number.. " +a+ " " +b);

        // using third variable method
        /*
        int c = a;
        a = b;
        b = c;

         */

        // using + & - method
        /*
        a = a+b;
        b = a-b;
        a = a-b;

         */

        // using * & / method
        a = a*b;
        b = a/b;
        a = a/b;

        System.out.println("After swapping number.. " +a+ " " +b);
        num.close();
    }
    public static void Reverse_number() {
        System.out.print("Enter a number:-");

        Scanner sc = new Scanner(System.in);
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
    public static void Palindrome_number() {

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
            System.out.println(org+ " -This is a Palindrome number");
        }
        else
        {
            System.out.println(org+ " -This is not a Palindrome number");
        }
        sc.close();
    }
    public static void Count_number_in_digit() {

        System.out.print("Enter a Number:- ");
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
    public static void Count_even_odd_number_in_digit() {

             System.out.print("Enter a Number:- ");
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
             sc.close();

         }
    public static void Find_largest_of_3numbers() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number:-");
        int a = sc.nextInt();

        System.out.print("Enter Second number:-");
        int b = sc.nextInt();

        System.out.print("Enter Third number:-");
        int c = sc.nextInt();

        //System.out.println(a+" "+b+" "+c);

        if(a>b && a>c){
            System.out.println("\nFirst number \""+a+"\" is the largest number");
        }
        else if(b>a && b>c){
            System.out.println("\nSecond number \""+b+"\" is the largest number");
        }
        else{
            System.out.println("\nThird number \""+c+"\" is the largest number ");
        }
        sc.close();
    }
    public static void Sum_of_digits_in_number() {

        System.out.print("Enter a number:- ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while(num!=0){
            sum = sum + num%10;         //note- '%' gives last number of the digit
            num = num/10;               //note- '/' removes last number of the digit

        }
        System.out.println("Sum of Digit in a Number- "+sum);
        sc.close();

    }
    public static void Factorial_num() {

        System.out.print("Enter a number:- ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        long factorial = 1;

        for (int i=1;i<=num;i++){
            factorial=factorial * i;
        }
        System.out.println("Factorial of "+num+" is: "+factorial);
    }
    public static void Find_random_num() {

        System.out.print("Find Random num between 0 to ");
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();

        Random rand=new Random();
        int rand_int = rand.nextInt(end);

        System.out.println(rand_int);
    }

}
