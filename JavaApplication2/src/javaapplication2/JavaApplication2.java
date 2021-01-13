/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Omotayo
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double xa, ya, xb, yb, acos;
        xa = readDouble("xa is = ");
        ya = readDouble("ya is = ");
        xb = readDouble("xb is = ");
        yb = readDouble("yb is = ");
        acos= max(xa, ya, xb, yb);
        System.out.println("The angle is "+acos);
    }
    public static double readDouble (String s) {
        Scanner input = new Scanner (System.in);
        System.out.println(s);
        return Double.parseDouble(input.next());
    }
    public static double max(double a, double b, double c, double d) {
        double sum, bottom, bottom1, bottom2, acos1, result;
        sum = a*b+c*d;
        bottom1 = len(a, b);
        bottom2 = len(c, d);
        bottom = bottom1*bottom2;
        acos1 = Math.acos(sum/bottom);
        result = Math.toDegrees(acos1);
        return result;
    }
    public static double len(double u, double r) {
        return Math.sqrt(u*u+r*r);   
    }
}
