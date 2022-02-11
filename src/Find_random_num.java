import java.util.Random;
import java.util.Scanner;

public class Find_random_num {
    public static void main(String[] args) {

        System.out.print("Find Random num between 0 to ");
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();

        Random rand=new Random();
        int rand_int = rand.nextInt(end);

        System.out.println(rand_int);
        sc.close();
    }
}
