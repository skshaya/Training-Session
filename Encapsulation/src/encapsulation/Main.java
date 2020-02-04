/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Shaya
 */

class Sample {
   public void display() {
      System.out.println("Sample class");
   }
}
class AnonymousDemo {
   public void createClass() {
     
      Sample p1 = new Sample() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      p1.display();
   }
}
public class Main {
     public static void main(String[] args) {
       AnonymousDemo an = new AnonymousDemo();
       an.createClass();
   }
}
