/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import javax.swing.JOptionPane;
/**
 *
 * @author engen
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String leitura = JOptionPane.showInputDialog("qual é o seu nome? ; ");
        JOptionPane.showMessageDialog(null, leitura);
    }
    
}
