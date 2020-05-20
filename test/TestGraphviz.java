/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Binay K
 */package javaapplication44;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TestGraphviz {
    
       public static void main(String[] args) throws IOException, InterruptedException {
     PrintWriter writer = null;
        try {
            writer = new PrintWriter("grapha.dot");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestGraphviz.class.getName()).log(Level.SEVERE, null, ex);
        }
                writer.println("digraph program5");
                writer.println("{");
                writer.println("a -> b -> c->f;");
                writer.println("b -> a -> e;");
                writer.println("}");
         
        writer.close();
        
        try {
        Process p = Runtime.getRuntime()
                .exec("rundll32 url.dll,FileProtocolHandler grapha.dot");
        p.waitFor();
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }

System.out.println("Done.");
}
}
       
