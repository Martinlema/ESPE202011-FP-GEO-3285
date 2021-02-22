/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadidates_with_votes_percentage;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class Cadidates_with_votes_percentage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int Opt = 1;
        float Sum = 0, Cont1 = 0, Cont2 = 0, Cont3 = 0, Cont4 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive integer:");
        //No=sc.nextInt ();

        System.out.println("CANDIDATES");
        System.out.println("1.- Andres Arauz");
        System.out.println("2.- Guillermo Lasso");
        System.out.println("3.- yaku perez");
        System.out.println("Select candidate ...!");

        while (Opt != 0) {

            Opt = sc.nextInt();

            switch (Opt) {
                case 1:
                    Cont1++;
                    System.out.println("Candidate 1 got the:" + Cont1 / Sum * 100 + "%with" +Cont1+ "votes.");
                    break;

                case 2:
                    Cont2++;
                    System.out.println("Candidate 2 got the:" + Cont2/Sum*100+ "%with" +Cont2+ "votes.");
                    break;

                case 3:
                    Cont3++;
                    System.out.println("Candidate 3 got the:" +Cont3/Sum*100 + "%with" +Cont3+ "votes.");
                        System.out.println("Total votes counted:" + Sum);
                    Sum = Cont1 + Cont2 + Cont3 + Cont4;
                    System.out.println("Total votes counted:" + Sum);
                    break;
            }

        }

    }

}