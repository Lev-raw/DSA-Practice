import java.util.Scanner;

public class print1toN {

        static void num(int i , int n){
                if(i>n){
                    return;
                }
               System.out.println(i);
               num(i+1, n);
        }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
               System.out.println("enter the number");
               int n = sn.nextInt();
               num(1,n);

    }
    
}
