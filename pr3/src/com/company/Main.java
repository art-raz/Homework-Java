package com.company;

public class Main {
    public static void main (String[] args) {
        Circle c1 = new Circle("red",true,2.2);
        Rectangle r2 = new Rectangle("red",true,2.2,3.45);
        double t = c1.getArea();
        System.out.println(t);
        System.out.println(c1.getPerimeter());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
    }
}
