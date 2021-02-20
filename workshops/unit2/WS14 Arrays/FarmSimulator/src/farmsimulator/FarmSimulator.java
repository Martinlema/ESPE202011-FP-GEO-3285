/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Scanner;

/**
 *
 * @author martin lema
 */
public class FarmSimulator {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int[] studentsByClassroom;
        String[] CLASSROOMS = {"OCTAVO ", "NOVENO", "TERCERO"};
        float[] weightByNotebook = { 1.20F, 2.4F, 3.2F, 4.1F, 6.3F, 7.5F};
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the NAME OF THE CLASSROOMS-> ");
        n = input.nextInt();

        studentsByClassroom = new int[n];
        //chickens = new String[20];
        //weightsByCoop = new float[n];

//        studentsByClassroom[1] = 27;
//        studentsByClassroom[2] = 29;
//        studentsByClassroom[3] = 33;
//        studentsByClassroom[4] = 39;
//        studentsByClassroom[5] = 48;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of students by classroom " + (i + 1) + " -> ");
            studentsByClassroom[i] = input.nextInt();
        }

        for (int students : studentsByClassroom) {
            System.out.println("students by classroom " +students );
        }

        for (int i = 0; i < n; i++) {
            System.out.println("students by classroom " + (i + 1) + " -> " + studentsByClassroom[i]);
        }

        for (String CLASSROOM :CLASSROOMS ) {
            System.out.println("CLASSROOM NAME -> " + CLASSROOM);
        }
        
        for (int i = 0; i < weightByNotebook.length ; i++) {
            System.out.println("WEIGHT OF BOOKS " + (i + 1) + " -> " + weightByNotebook[i]);
        }

    }

}