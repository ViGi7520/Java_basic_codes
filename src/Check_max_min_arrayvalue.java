import java.util.Scanner;

public class Check_max_min_arrayvalue {
    public static void main(String[] args) {
        //int a[]={1,2,3,4,5};

        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter 5 numbers in array: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        //max
        int max=a[0];
        for (int j : a) {
            if (j > max)
                max = j;

        }
        System.out.println("Maximum value in an array: "+max);

        int min=a[0];
        for (int j : a) {
            if (j < min)
                min = j;

        }
        System.out.println("Minimum value in an array: "+min);
        input.close();
       
    }
}
