/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21.functions.pairs;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class WS21FunctionsPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "|WS21FunctionsPairs|" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        System.out.println("======== OPTIONS MENU =========");
        System.out.println("___________________________________");
          System.out.println("=======2.consumption of light from a refrigerator =========");
        System.out.println("======== 8.FAHRENHEIT DEGREE CALCULATOR=========");
        System.out.println("======== 5.weight =========");

        System.out.println("Enter your menu option --> ");
        option = input.nextInt();

        switch (option) {

            case 2:
      int consumption_in_kilowatts = 0,
cost_per_kilowatt,payment;
       
          System.out.println("Enter the consumption value in kilowatts:");
        consumption_in_kilowatts =input.nextInt();
         System.out.print ("Enter the cost value per kilowatt:");
         cost_per_kilowatt=input.nextInt();
         payment =(consumption_in_kilowatts)*(cost_per_kilowatt);
         System.out.println ("Payment value:" +payment);
         break;
            case 8:
                int degreesC;
                int degreesF;
                System.out.println("Enter degrees Centigrade:");
                degreesC = input.nextInt();
                degreesF = 32 + (9 * degreesC) / 5;
                System.out.println(degreesC + " ºC = " + degreesF + " ºF");
                break;
            case 5:
                int weight;
                System.out.print("Enter the weight");

                weight = input.nextInt();

                if (375 > weight) {
                    System.out.println("You are a vegetable");
                } else {
                    if (weight < 921) {
                        System.out.println("it's a meat");
                    } else {
                        System.out.println("It's a chicken");
                        break;                       

                    }
                }
        }
    }
}
