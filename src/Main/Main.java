/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Bidang.Persegi;
import Ruang.Balok;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI gui = new GUI();
        
        gui.count.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    String length = gui.getFvaluel();
                    String width = gui.getFvaluew();
                    String height = gui.getFvalueh();
                    
                    double l = Integer.parseInt(length);
                    double w = Integer.parseInt(width);
                    double h = Integer.parseInt(height);
                    
                    Persegi square = new Persegi(l, w);
                    Balok cuboid = new Balok(l, w, h);
                    
                    String sqrcircum = String.valueOf(square.circumference());
                    String sqrarea = String.valueOf(square.area());
                    String cuboidsurfarea = String.valueOf(cuboid.surfacearea());
                    String cuboidvol = String.valueOf(cuboid.volume());
                    
                    gui.sctext.setText("Square Circumference : " + sqrcircum);
                    gui.satext.setText("Square Area                  : " + sqrarea);
                    gui.csatext.setText("Cuboid Surface Area   : " + cuboidsurfarea);
                    gui.cvtext.setText("Cuboid Volume             : " + cuboidvol);
                    
                }catch(Exception exc){
                    JOptionPane.showMessageDialog(null, exc.getMessage());
                }
            }
        });
        
        gui.reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                gui.fvaluel.setText("");
                gui.fvaluew.setText("");
                gui.fvalueh.setText("");
                
                gui.sctext.setText("");
                gui.satext.setText("");
                gui.csatext.setText("");
                gui.cvtext.setText("");
            }
        });
    }
    
}
