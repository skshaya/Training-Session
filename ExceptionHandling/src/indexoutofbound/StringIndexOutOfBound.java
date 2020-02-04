/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indexoutofbound;

/**
 *
 * @author Shaya
 */
public class StringIndexOutOfBound {
    public static void main(String args[]) 
    { 
        try { 
            String a = "This is like an Apple "; // length is 22 
            char c = a.charAt(24); // accessing 25th element 
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException"); 
        } 
    } 
        
    }
