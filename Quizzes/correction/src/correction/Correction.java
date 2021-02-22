/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correction;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class Correction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==========================================================================================" + " \n"
                + "|CANDIDATES |" + "\n"
                + "======================= " + "\n"
                + "| student: Martín Lema | " + "\n"
                + "|University: University of the Armed Forces Espe | " + "\n"
                + "|career: geospatial engineering career | " + "\n"
                + "==================================================================================================");
        float[] percentageOfcandidates;
        int numberOCandidates = 0;
        String[] candidates = {"1.Andres Arauz", "2.Guillermo Lasso", "3.Yaku Perez", "4.Xavier Hervas", "5.Pedro Freire"};

        Scanner sc = new Scanner(System.in);

        System.out.println("please number of de candidate:------------------>");
        numberOCandidates = sc.nextInt();

        candidates = new String[numberOCandidates];
        percentageOfcandidates = new float[numberOCandidates];

        for (int cnt = 0; cnt < numberOCandidates; cnt++) {
            sc.nextLine();
            System.out.println("please name of de candidate:" + cnt);
            candidates[cnt] = sc.nextLine();
            System.out.println("please enter" + candidates[cnt] +  " %:----------->");
            percentageOfcandidates[cnt] = sc.nextFloat();
        }
        for (int cnt = 0; cnt < numberOCandidates; cnt++) {
            System.out.println(candidates[cnt] + "------> \t" + percentageOfcandidates[cnt]);
        }
    }
}


        