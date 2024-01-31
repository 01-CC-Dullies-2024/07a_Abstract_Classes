package com.cc.java;

public class C_Circle extends B_Shape{

    private double radius;

    public C_Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        // return ((this.radius*this.radius)*Math.PI);
        return Math.PI * Math.pow(this.radius,2);
    }
    
}

