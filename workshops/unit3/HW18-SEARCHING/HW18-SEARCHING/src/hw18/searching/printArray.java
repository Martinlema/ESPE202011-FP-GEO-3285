/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18.searching;

/**
 *
 * @author martin lema
 */
class printArray {
        public static void print(int[] integersnumbers) {
        int n = integersnumbers.length;
        for (int i = 0; i < n; i++) {
            System.out.print(integersnumbers[i] + " , ");
        }
        System.out.println("----------------------------------");
    }

}

 