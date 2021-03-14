/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

/**
 *
 * @author martin lema
 */
public class BasicTax {
    public static float cumputeIva(float basePrince,float percentageValue){
        float iva;
        iva=basePrince * percentageValue /100;
        return iva;
    
    
    }
    
}
