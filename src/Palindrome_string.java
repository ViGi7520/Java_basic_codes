import java.util.Scanner;

public class Palindrome_string {
    public static void main(String[] args) {

        System.out.println("Enter a String:- ");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String rev = "";

        System.out.println("Original String- " +str);

        int len = str.length();

        for(int i=len-1; i>=0; i--){
            rev= rev + str.charAt(i);
        }
        //System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("This is Palindrome String- "+str);
        }
        else{
            System.out.println("This is not a Palindrome String- "+str);
        }
    }
}
