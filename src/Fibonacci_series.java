import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int num1=0, num2=1, sum;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter how many fibonacci series numbers= ");
        int a = sc.nextInt();  //how many number we want?

        System.out.println(num1+"\n"+num2);
        for(int i=2; i<a; i++){
            sum=num1+num2;
            System.out.println(+sum);
            num1=num2;
            num2=sum;
        }
    }
}
