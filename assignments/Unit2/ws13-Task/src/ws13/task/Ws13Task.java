/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;



/**
 *
 * @author martin lema
 */
public class Ws13Task {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "|Task |" + "\n"
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
        System.out.println("======== 2. Circle =========");
        System.out.println("======== 5. Pentagon =========");
        System.out.println("======== 6. Diamond =========");
        System.out.println("======== 7.speed calculator =========");
        System.out.println("======== 8.FAHRENHEIT DEGREE CALCULATOR=========");
        System.out.println("======== 9.AVERAGE CALCULATOR=========");
        System.out.println("======== 10.exit =========");
        System.out.println("___________________________________");

        System.out.println("Enter your menu option --> ");
        option = input.nextInt();

        switch (option) {
            
            case 2:
                int  radius ;
                 System.out.print("enter the radius of the circle:");
                 radius =input.nextInt();

                double Result =3.1416*(radius*radius);

                System.out.print("The area of the circle is:" + Result);
                break;

            case 5:
                float areapentagon = 0;
                int perimeter;
                System.out.println("Enter the perimeter");
                perimeter = input.nextInt();
                System.out.println("Enter apothem");
                int apothem = input.nextInt();
                areapentagon = (perimeter * apothem)/ 2;
                System.out.println("THE AREA OF THE PENTAGON IS----> " + areapentagon);
                break;
            case 6:
                float arearombo;
                System.out.println("Enter the MajorDiagonal");
                int Diagonal_Ma = input.nextInt();
                System.out.println("Enter the Minor Diagonal");
                int Diagonal_Me = input.nextInt();
                arearombo = (Diagonal_Ma * Diagonal_Me) / 2;
                System.out.println("THE AREA OF THE ROMBO IS:" + arearombo);
                break;
            case 7:
                double speed;
                System.out.println("Enter speed in Km / h:");
                speed = input.nextDouble();
                System.out.println(speed + "Km / h ->" + speed * 1000 / 3600 + "m / s");
                break;
            case 8:
                int degreesC;
                int degreesF;
                System.out.println("Enter degrees Centigrade:");
              degreesC = input.nextInt();
               degreesF = 32 + (9 * degreesC )/5;
                System.out.println(degreesC + " ºC = " + degreesF + " ºF");
                break;
            case 9:
                int note1;
                int note2;
                int examgrade;
                double average=0.00000F;
          System.out.println("enter note1");
                note1 = input.nextInt();
                System.out.println("enter note2");
                note2 = input.nextInt();
                System.out.println("enter examgrade");
                examgrade = input.nextInt();
                average = (note1 + note2+ examgrade)/3;
                System.out.println("the average is------>" + average);
                break;
            case 10:
                System.out.println("Good Bye my friend");
                System.exit(10);
                break;
            default:
                System.out.println("Invalid option\n\n\n");
                break;

        }

    }
    while (option != 10);

    }

