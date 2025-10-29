package com.csc205.project2.shapes;

public class Cylinder extends Shape3D {

    private double radius;
    private double height;

    public Cylinder(String color, double radius, double height) {
        super("Cylinder", color);
        setRadius(radius);
        setHeight(height);
    }

    public Cylinder() {
        this("Uncolored", 1.0, 1.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative");
        }
        this.height = height;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (height + radius);
    }

    @Override
    protected double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format(
                "Cylinder [Color: %s, Radius: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(), radius, height, getSurfaceArea(), getVolume()
        );
    }
}