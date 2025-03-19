package GFG.maths;

import java.util.Scanner;

public class CelciusToFahren {

    public static void main(String args [] ){
        Scanner sc= new Scanner(System.in);
        double C;
        System.out.println("Enter the Celcius : ");
        C= sc.nextDouble();

        findFahrenheit(C);

    }

    public static void findFahrenheit(double C){

        double F= ((9.0 * C) / 5.0) + 32;

        System.out.println(F);
    }
    
}
