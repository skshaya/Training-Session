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
public class MemberOuter {
    private int data=100;  
 class Inner{  
  void msg(){System.out.println("value is "+data);}  
 }  
 public static void main(String args[]){  
  MemberOuter obj=new MemberOuter();  
  MemberOuter.Inner in=obj.new Inner();  
  in.msg();  
 }  
}
