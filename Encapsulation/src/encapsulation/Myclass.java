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
class InnerClass {
   int num;
   

   private class Inner {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   

   void display_Inner() {
      Inner inner = new Inner();
      inner.print();
   }
}
   
public class Myclass {

   public static void main(String args[]) {
 
      InnerClass outer = new InnerClass();
      
      outer.display_Inner();
   }
}