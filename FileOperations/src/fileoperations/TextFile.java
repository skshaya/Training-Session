/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileoperations;

import java.io.FileWriter; 
import java.io.IOException; 
/**
 *
 * @author Shaya
 */
public class TextFile {
    public static void main(String[] args) throws IOException 
    { 
       
        String text = "Sample Text ";
  
    
        FileWriter fw=new FileWriter("output.txt"); 
  
      
        for (int i = 0; i < text.length(); i++) 
            fw.write(text.charAt(i)); 
  
        System.out.println("TextFile is created"); 
       
        fw.close(); 
    } 
}
