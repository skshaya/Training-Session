/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmatic;

/**
 *
 * @author Shaya
 */
public class ArithmaticException {

    public static void main(String[] args) {

     try { 
            int a = 30, b = 0; 
            int c = a/b;  // cannot divide by zero 
            System.out.println ("Result = " + c); 
        } 
        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 

    }

}
