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
public class IndexOutOfBound {
    public static void main(String[] args) {
        try {
            String arr[]={"Abi","6","Kegalle"};
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()+ "Check array");
            e.printStackTrace();
        }
        
    }
    
   
    
}
