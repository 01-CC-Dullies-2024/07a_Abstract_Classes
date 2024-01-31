package com.cc.java;

public class C_Rectangle extends B_Shape{


    // private double heights, width; "Dafür wird man erschossen!"
    private double heights;
    private double width;

    public C_Rectangle(double height, double width) {
        this.heights = height;
        this.width = width;
    }

    public double area() {
        return (this.heights*this.width);
    }
    
}

