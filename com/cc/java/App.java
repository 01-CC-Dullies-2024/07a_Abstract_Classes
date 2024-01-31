package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        C_Rectangle c_rectangle = new C_Rectangle (10.0, 10.0);
        C_Circle c_circle = new C_Circle (5.0);
        C_Triangle c_triangle = new C_Triangle(10.0,  10.0);

       output("--- Flächen: Rechteck ---"+ c_rectangle.area());
       output("--- Flächen: Kreis ---"+ c_circle.area());
       output("--- Flächen: Dreieck ---"+ c_triangle.area());

       output("--- Differenzen: ---");
       output("--- Differenzen: r-t: "+ areaDiff(c_rectangle, c_triangle));
       output("--- Differenzen: r-t: "+ areaDiff(c_rectangle, c_circle));
       output("--- Differenzen: c-t: "+ areaDiff(c_circle, c_rectangle));
       output("--- Differenzen: c-t: "+ areaDiff(c_circle, c_triangle));
       output("--- Differenzen: c-t: "+ areaDiff(c_triangle, c_triangle));



    }

    private static double areaDiff(B_Shape s1, B_Shape s2){
        return s1.area()- s2.area();
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }


}

