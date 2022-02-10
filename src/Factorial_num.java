import java.util.Scanner;

public class Factorial_num {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        long factorial = 1;

        for (int i=1;i<=num;i++){
            factorial=factorial * i;
        }
        System.out.println("Factorial of a "+num+" is: "+factorial);
    }
}
