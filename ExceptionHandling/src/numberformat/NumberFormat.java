/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberformat;

/**
 *
 * @author Shaya
 */
public class NumberFormat {
    public static void main(String[] args) {
        try { 
            // "akki" is not a number 
            int num = Integer.parseInt ("akki") ; 
  
            System.out.println(num); 
        } catch(NumberFormatException e) { 
            System.out.println("Number format exception"); 
        } 
    } 
} 