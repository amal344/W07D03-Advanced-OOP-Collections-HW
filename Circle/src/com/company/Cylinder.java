package com.company;

public class Cylinder extends Circle {
    private double height=1.0;
    public Cylinder(double radius, String type) {
        super(radius, type);
    }

    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return height*getArea();
    }
}
