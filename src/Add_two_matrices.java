import java.util.Scanner;

public class Add_two_matrices {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of ROWS & COLUMNS of MATRIX");
        int m = in.nextInt();
        int n = in.nextInt();
        
        int[][] mat1 = new int[m][n];
        int[][] mat2 = new int[m][n]; 
        int sum[][] = new int[m][n];
        int sub[][] = new int[m][n];
        
        System.out.println("Enter the elements of first matrix");
        for (int c=0; c<m; c++)
        for (int d=0; d<n; d++)
        mat1[c][d]= in.nextInt();
    
        System.out.println("Enter the elements of second matrix");
        for (int c=0; c<m; c++)
        for (int d=0; d<n; d++)
        mat2[c][d]= in.nextInt();
        
        //Addition
        for (int c=0; c<m; c++)
        for (int d=0; d<n; d++)
        sum [c][d] = mat1[c][d] + mat2[c][d];
        System.out.println("Sum of entered matrices");
        for (int c=0; c<m; c++){
            for (int d=0; d<n; d++)
            System.out.print(sum[c][d] +"\t");
            System.out.println();
        }
       
       
        //Subtraction
        for (int c=0; c<m; c++)
        for (int d=0; d<n; d++)
        sub [c][d] = mat1[c][d] - mat2[c][d];
        
        System.out.println("Sub of entered matrices");
        
        for (int c=0; c<m; c++){
            for (int d=0; d<n; d++)
            System.out.print(sub[c][d] +"\t");
            System.out.println();
        }
        in.close();     //scanner closed
    }
}
