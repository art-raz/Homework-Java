package com.company;

public class Rectangle extends Shape{
    protected double width;
    protected double lenght;

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
    public double getArea(){
        return this.lenght*this.width;
    }
    public double getPerimeter(){
        return (this.lenght+this.width)*2;
    }
}
