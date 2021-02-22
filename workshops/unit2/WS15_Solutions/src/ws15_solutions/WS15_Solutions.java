/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws15_solutions;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class WS15_Solutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalOfcellPhones = 0;
        String[] CellPhones;
        float[] price;

        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please Enter the amount of players you want to record -> ");
        totalOfcellPhones = scanner.nextInt();

        CellPhones = new String[totalOfcellPhones];
        price = new float[totalOfcellPhones];

        for (int i = 0; i < totalOfcellPhones; i++) {
            scanner.nextLine();
            System.out.print(" Please Enter the name of Cell Phones  " + i + " -> ");
            CellPhones[i] = scanner.nextLine();
            System.out.print(" Please enter " + CellPhones[i] + " price ->");
            price[i] = scanner.nextFloat();
        }

        System.out.println(" Player    ->  \t     goal average ");

        for (int i = 0; i < totalOfcellPhones; i++) {
            System.out.println(CellPhones[i] + " ->  \t " + price[i]);
        }

    }

}
