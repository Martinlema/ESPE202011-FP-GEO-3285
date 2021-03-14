/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author martin lema
 */
public class BasicOperation {
    //addition,subtraction,division,multiplication
    public static float  addTwoNumbers(float addend1 ,float addend2){
        float sum=0;
        sum=addend1 + addend2;
        return sum;
    }
        public static float  subtractTwoNumbers(float minuend ,float subtrahend){
        float subtraction=0;
        subtraction=(minuend)-(subtrahend);
        return subtraction;
    }
          public static float  multiplicationTwoNumbers(float multiplying ,float multiplier){
        float  multiplication=0;
         multiplication=(multiplying)*(multiplier);
        return  multiplication;
} 
          public static float  divisionTwoNumbers(float dividend ,float divider){
        float division=0;
        division=(dividend)/(divider);
        return division;
} 
}