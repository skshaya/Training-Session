/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jumpingfrog;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Shaya
 */
public class JumpingFrog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int seconds;
        int distance;
        String option;
        int remaining;
        try {
            Scanner scanner = new Scanner(System.in);
        System.out.println("Select one from Distance or Time");
        option=scanner.next();
        if(option.equals("Distance")){
            System.out.println("Enter a Distance: ");
            distance=scanner.nextInt();
            remaining=distance%9;
            if(remaining==0){
                System.out.println("Waiting Time of the frog is "+(distance/9)*8+"seconds");
            }
            else if(remaining<=5){
                System.out.println("Waiting Time of the frog is "+((distance/9)*8+1)+"seconds");
            }
            else if(remaining<=8){
                System.out.println("Waiting Time of the frog is "+((distance/9)*8+3)+"seconds");
            }
           
        }
        else if(option.equals("Time")){
            System.out.println("Enter a Time: ");
            seconds=scanner.nextInt();
            remaining=seconds%8;
             if(remaining==0){
                System.out.println("Waiting Time of the frog is "+(seconds/8)*9+"m");
            }
            else if(remaining<=1){
                System.out.println("Waiting Time of the frog is "+((seconds/8)*9+5)+"m");
            }
            else if(remaining<=3){
                System.out.println("Waiting Time of the frog is "+((seconds/8)*9+8)+"m");
            }
             else if(remaining<=7){
                System.out.println("Waiting Time of the frog is "+((seconds/8)*9+9)+"m");
            }
        }
        else{
            System.out.println("Invalid arguments...");
    }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage() +" Only can use Integer for Time & Distance");
            
        }
    }
    
}
