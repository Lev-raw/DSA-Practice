// reverse an array using two pointer via recursion

import java.util.Scanner;

/**
 * reversearray
 */
public class reversearray {
      void rev2pointer(int arr[],int r,int l){
              if(r>=l){
                return;
              }
                int temp = arr[r];
                arr[r]=arr[l];
                arr[l]=temp;
                rev2pointer(arr,r+1, l-1);
      }
      void  revsinglepionter(int arr[],int n,int i){
               if(i>n/2){
                return;
               }
               int temp = arr[i];
               arr[i]= arr[n-i-1];
               arr[n-i-1]= temp;
               revsinglepionter(arr, n, i+1);

      }

            public static void main(String[] args) {
                       Scanner sc =new Scanner(System.in);
                            System.out.println( "enter the size of array");
                                
                                 int n = sc.nextInt();
                                     int arr[]= new int[n];
                                      System.out.println("enter the "+n+" element");
                                        for(int i =0;i<n;i++){
                                            arr[i]= sc.nextInt();

                                        }
                                    //     reversearray rev = new reversearray();
                                    //     rev.rev2pointer(arr,0,n-1);
                                    //    System.out.println("reversed");
                                    //    for(int x: arr){
                                    //     System.out.println(x+" ");
                                    //    }  
                                      reversearray x = new reversearray();
                                      x.revsinglepionter(arr,n,0);
                                      System.out.println("new rev");
                                      for(int y: arr){
                                        System.out.println(y+" ");
                                      }
                                      sc.close();
            }
}
       
     

