// import java.util.Scanner;

public class Check_duplicate_in_array {
    public static void main(String[] args) {

        boolean status = false;

        
        String[] a ={"java","C","C++","python","html"};       //no duplicate

        // String[] a ={"java","C","C++","python","java"};       //Duplicate

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].equals(a[j])){
                    System.out.println("!! Duplicate found !! ** " +a[i]+" **");
                    status = true;
                }
            }
        }
            if (!status){
                System.out.println("No duplicate found");
            }
    }
}
