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
public class numbers {
    
    public static int search(int[] numbers, int left, int right, int y) {

         if(right>=left)  {
             int mid = left + (right - left) / 2;
            
             if (numbers [mid] == y) {
                 return mid;
             }
            
             if (numbers [mid]> y) {
                 return search (numbers, left, mid - 1, y);
             }
            
             return search (numbers, mid + 1, right, y);
         } else {
         }
         return -1;
     }

     }


