package com.cc.java;

public class C_Triangle extends B_Shape{

    private double baseline;
    private double height;

    public C_Triangle(double baseline, double height) {
        this.baseline = baseline;
        this.height = height;
    }

    public double area() {
        
        return ((this.baseline*this.height)/2)
        ;
    }
    
}

