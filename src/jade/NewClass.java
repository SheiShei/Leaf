/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.misc.VM;

/**
 *
 * @author Shei
 */
public class NewClass {
    public static void main(String[]args) throws IOException{
        String str=null;
        File file = new File("C:\\Users\\Shei\\Documents\\NetBeansProjects\\J.E.Y.D\\out.txt");
        FileInputStream fstream = null;
        try {
                fstream = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        while ((str = br.readLine()) != null)   {
            JOptionPane.showMessageDialog(null,"try");
        }
    }
}
