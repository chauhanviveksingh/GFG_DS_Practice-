package GFG.maths;

import java.util.Scanner;

public class findingFahrenToCelcius {

    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        double F;
        System.out.println("Enter the temperature in Fahrenheit :");
        F=sc.nextDouble();

        findCelcius(F);

    }

    public static void findCelcius(double F){
        double C=(5.0 * (F - 32) / 9) ;

        System.out.println(C);
    }
    
}
