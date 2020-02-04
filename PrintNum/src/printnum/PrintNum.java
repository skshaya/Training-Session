/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnum;

import java.util.Scanner;
/**
 *
 * @author Shaya
 */
public class PrintNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
  {
    int n, r = 0;

    System.out.println("Enter an integer to reverse");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    while(n != 0)
    {
      r = r * 10;
      r = r + n%10;
      n = n/10;
    }

    System.out.println("Reverse of the number is " + r);
  }
    
}
