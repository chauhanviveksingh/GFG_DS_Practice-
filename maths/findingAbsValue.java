package GFG.maths;

import java.util.Scanner;

public class findingAbsValue {
    public static void main(String args []) {
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter your number : ");
        n=sc.nextInt();

        findAbs(n);
  }
    public static void findAbs(int n){
            if ( n < 0){
                n= (-1) * n;
            }
  System.out.println(n);        
    }
    
}
