package Easy;

import java.util.Scanner;

// FibonacciSeries
public class fibo {
       static int fib (int n){
            if(n<=1){
                return n;
            }
            int last = fib(n-1);
            int slast = fib(n-2);
            return last+slast;

       }
        public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
                   System.out.println("enter the number till u want  FibonacciSeries");
                   int n = sc.nextInt();
                      System.out.println("The series of " +n+" is "+ fib(n));
                            
        }

    
}
