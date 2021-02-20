/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.arrays;
/**
 *
 * @author martin lema
 */
public class HWArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
          System.out.println("****************************************** " + " \n"
                + "| cellPhone |" + "\n"
                + "======================= " + "\n"
                + "| student:Martín Lema | " + "\n"
                + "| University of the Armed Forces Espe | " + "\n"
                + "| geospatial engineering career | " + "\n"
                + "************************************************");
        
        // TODO code application logic here
    String [] mainCellphone = {"Ericsson","Nokia_3320", "Nokia_1100", "Samsung_Fashion_R210","Motorola_Razr","Sony_Ericsson_W_series","Motorola_C115"};
     String [] current = {"Smartphone ", "Phablet ", "Basic Phone", "Feature Phone"};
         System.out.println("old cell phone names");
         for (String cellPhone: mainCellphone) {
              System.out.println("Names of old cell phones----->" +cellPhone);
         }

         System.out.println("*****************************************************************");
         System.out.println("modern cell phones");
         for(String cellPhone: current) {
          System.out.println("names of all modern cell phones ->" +cellPhone);
         }
     }

}