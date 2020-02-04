/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starpatternprinting;

import java.util.Scanner;

/**
 *
 * @author Shaya
 */
public class StarPatternPrinting {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int a,b,c,rows;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows that you want: ");
        rows = scanner.nextInt();

        for (a = 1; a <= rows; a++) {
            for (b = rows - 1; b >= a; b--) {
                System.out.print(" ");

            }
            for (c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        //System.out.println("");
        for (a = rows - 1; a >= 1; a--) {
            for (b = rows - 1; b >= a; b--) {
                System.out.print(" ");
            }
            for (c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
