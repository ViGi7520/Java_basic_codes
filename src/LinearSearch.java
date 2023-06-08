import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a= {10,20,30,40,50};

        System.out.println("Enter a number to search: ");
        Scanner sc= new Scanner(System.in);
        int search= sc.nextInt();

        boolean found=false;

        for (int j : a)
            if (j == search) {
                System.out.println("Element Found");
                found = true;
            }
        if(!found) {
            System.out.println("Element not Found");
        }
        sc.close();
    }
}
