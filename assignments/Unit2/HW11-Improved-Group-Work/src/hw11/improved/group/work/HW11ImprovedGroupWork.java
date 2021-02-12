/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.improved.group.work;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class HW11ImprovedGroupWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "|HW1ImprovedGroupProject |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option = 0;

        do {
            System.out.println("Hello dear user please can choose an option");
            System.out.println("1.-Calculate the flow rate by speed and time");
            System.out.println("2.-Calculate the rotational displacement of a "
                    + "landslide using : Width of the break surface, length of"
                    + " the break surface and depth of the break surface by "
                    + "perpendicularity to the original topography "
                    + "of the terrain.");
            System.out.println("0.- Exit");

            System.out.println("Enter your menu option-->");
            option = (int) input.nextFloat();

            switch (option) {
                case 1:
                    System.out.println("Enter the value of the calculated speed (m^3/hr)-->");

                    float Flow;
                    float Speed = input.nextFloat();

                    System.out.println("Enter the calculated time (min)--> ");

                    float Time = input.nextFloat();
                    Flow = Speed / Time;
                    calculateFlowRate(Flow, Time, Speed);
                    break;

                case 2:

                    System.out.println("Enter the value of the length of the tear surface (Wr or Ar)-->");
                    float Width = input.nextFloat();

                    System.out.println(" Enter the value of the length of the tear surface (Lr)--> ");
                    float Length = input.nextFloat();

                    System.out.println("Enter the depth value of the tear surface by"
                            + "perpendicularity to the original topography "
                            + "of the terrain(Dr or Pr)--> ");
                    float Depth = input.nextFloat();

                    float pi;
                    pi = (float) 3.1415926535897932;

                    CalculateRotationalElValorDisplacement(pi, Width, Length, Depth);

                    break;

                case 0:
                    System.out.println("+++++thank you very much dear user see you soon++++++++++++++");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option\n\n");
                    break;

            }
        } while (option != 0);
    }
    private static void CalculateRotationalElValorDisplacement(float pi, float Width, float Length, float Depth) {
        float V = (((pi) * (Width * Length * Depth)) / (6));

        System.out.println("The rotational displacement is --> " + V);
    }

    private static void calculateFlowRate(float flow, float time, float speed) {
        System.out.println(" The Flow is whit speed -> " + flow + " and "
                + " time -> " + time + " is ->" + speed);
    }

}

