import java.util.Scanner;

public class printnamentimes {
       void printname(int i ,int n){
        
           if(i>n){
            return;
}
    System.out.println("chinmay");
           printname(i+1,n);
       }


       
    public static void main(String[] args) {
          
          Scanner sc = new Scanner(System.in);
                System.out.println("enter the number of times");
               int n = sc.nextInt();
                  printnamentimes s = new printnamentimes();
                  s.printname(1,n);

    
       
    }
    
}
