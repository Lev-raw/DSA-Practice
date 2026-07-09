import java.util.Scanner;

public class backtrack1ton {
    void list( int n){
        if(n<1){
            return;

        }
        list(n-1);
    System.out.println(n);
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         System.out.println("enter the no");
            int n = sc.nextInt();
               backtrack1ton s = new backtrack1ton();
               s.list(n);
    }
    
}
