/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10functions;

/**
 *
 * @author martin lema
 */
public class WS10functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("================== " + " \n"
                + "| functions |" + "\n"
                + "======================= " + "\n"
                + "| student Martín Lema | " + "\n"
                + "| University of the Armed Forces Espe | " + "\n"
                + "| geospatial engineering career | " + "\n"
                + "===================================");

        int dividend =30;
        int divisor= 15;
        float quotient = 0;
        int x = 0;
        int y = 0;

        quotient = divideTwoNumbers(dividend, divisor);

        System.out.println("Quotient of 5 and 10 is -> " + quotient); //0.5 or ?

        y = f(8);
        System.out.println("8^2 -> " + y);

        y = f(-8);
        System.out.println("-8^2 -> " + y); //9

        x = 120;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

    }

    public static float divideTwoNumbers(int dividend, int divisor) {

        float quotient = 0.0F;
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}
