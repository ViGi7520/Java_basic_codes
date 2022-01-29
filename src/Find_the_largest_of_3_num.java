import java.util.Scanner;

public class Find_the_largest_of_3_num {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number:-");
        int a = sc.nextInt();

        System.out.print("Enter Second number:-");
        int b = sc.nextInt();

        System.out.print("Enter Third number:-");
        int c = sc.nextInt();

        //System.out.println(a+" "+b+" "+c);

        if(a>b && a>c){
            System.out.println("First number \""+a+"\" is the largest number");
        }
        else if(b>a && b>c){
            System.out.println("Second number \""+b+"\" is the largest number");
        }
        else{
            System.out.println("Third number \""+c+"\" is the largest number ");
        }
        sc.close();
    }
}
