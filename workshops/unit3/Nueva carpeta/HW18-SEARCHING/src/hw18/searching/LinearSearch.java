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
class LinearSearch {
    
    public static int search (int integersnumbers[], int x) {
        
        int n = integersnumbers.length;
        for (int i = 0; i < n; i++) {
            if (integersnumbers[i] == x) {
                return i;
            }
        }
        return -1;
        
        
        
    }
    
}