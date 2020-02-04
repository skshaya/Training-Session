/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberPrinting;

/**
 *
 * @author Shaya
 */
public class NumperPrinting {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int a,b,c;
        
        for (a = 1; a < 10; a++) {
            System.out.print("" + a + " |");

            for (b = 1; b < 10; b++) {
                // System.out.println("");
                c = b * a;
                System.out.print("  " + c + "");
            }
            System.out.println("");
        }
    }
    
}
