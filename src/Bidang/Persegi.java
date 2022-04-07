/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidang;

/**
 *
 * @author ASUS
 */
public class Persegi implements MenghitungBidang {
    private double length, width;
    
    public Persegi(double Length, double Width){
        length = Length;
        width = Width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    @Override
    public double circumference() {
        return 2 * (length + width);
    }

    @Override
    public double area() {
        return length * width;
    }
    
}
