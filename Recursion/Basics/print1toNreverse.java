import java.util.Scanner;

public class print1toNreverse {
    void rev(int n, int i){
            if(n<i){
                return;

            }
            System.out.println(n);
            rev(n-1,i);
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
             System.out.println("enter the num ");
             int n = sc.nextInt();
                  print1toNreverse s = new print1toNreverse();
                  s.rev(n,1);
    }
    
}
