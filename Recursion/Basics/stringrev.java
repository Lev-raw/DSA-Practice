import java.util.Scanner;

public class stringrev {
    static boolean check(String s,int i,int x){
               if(x>=i/2){
                return true;}
                  if(s.charAt(x)!=s.charAt(i-x-1)){
                   return false;
                  }
                
              return   check( s, i, x+1);
               


    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
               System.out.println("enter the plaindrome");
                  String st = sc.next();
                 System.out.println( check(st,st.length(),0));
                         

    }
    
}
