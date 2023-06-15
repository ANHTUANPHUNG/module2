package Kethua;

import java.util.PrimitiveIterator;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height= height;

    }

    public double getHeight() {
        return height;
    }

    public double CylinderArea(double radius, double height){
        return Math.PI*radius*radius*height;
    }
}
