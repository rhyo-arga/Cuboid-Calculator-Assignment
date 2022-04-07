/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class GUI extends JFrame{
    JLabel title = new JLabel("Cuboid Claculator");
    
    JLabel lvaluel = new JLabel("Length : ");
    JTextField fvaluel = new JTextField();
    
    JLabel lvaluew = new JLabel("Width : ");
    JTextField fvaluew = new JTextField();
    
    JLabel lvalueh = new JLabel("Height : ");
    JTextField fvalueh = new JTextField();
    
    JLabel result = new JLabel("Result : ");
    
    JButton count = new JButton("Count");
    JButton reset = new JButton("Reset");
    
    JLabel sctext = new JLabel("");
    
    JLabel satext = new JLabel("");
    
    JLabel csatext = new JLabel("");
    
    JLabel cvtext = new JLabel("");
    
    public GUI(){
        setTitle("Cuboid Calculator");
        setSize(360,500);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(title);
        add(lvaluel);
        add(fvaluel);
        add(lvaluew);
        add(fvaluew);
        add(lvalueh);
        add(fvalueh);
        add(result);
        add(count);
        add(reset);
        add(sctext);
        add(satext);
        add(csatext);
        add(cvtext);
        
        title.setBounds(125, 15, 150, 30);
        lvaluel.setBounds(15, 70, 100, 30);
        fvaluel.setBounds(110, 70, 150, 30);
        lvaluew.setBounds(15, 115, 100, 30);
        fvaluew.setBounds(110, 115, 150, 30);
        lvalueh.setBounds(15, 160, 100, 30);
        fvalueh.setBounds(110, 160, 150, 30);
        result.setBounds(150, 200, 100, 30);
        sctext.setBounds(15, 250, 250, 30);
        satext.setBounds(15, 280, 250, 30);
        csatext.setBounds(15, 310, 250, 30);
        cvtext.setBounds(15, 340, 250, 30);
        count.setBounds(50, 400, 100, 30);
        reset.setBounds(200, 400, 100, 30);
    }

    public String getFvaluel() {
        return fvaluel.getText();
    }

    public String getFvaluew() {
        return fvaluew.getText();
    }

    public String getFvalueh() {
        return fvalueh.getText();
    }
}
