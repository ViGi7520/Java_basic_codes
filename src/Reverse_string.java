import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = sc.next();
        String rev = "";

        System.out.println("Original String- " +str);

        int len = str.length();

        for (int i=len-1; i>=0; i--){
            rev= rev + str.charAt(i);
        }
        System.out.println("Reversed String- " +rev);
    }
}
