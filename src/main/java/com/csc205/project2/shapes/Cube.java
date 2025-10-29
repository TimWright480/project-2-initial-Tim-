package com.csc205.project2.shapes;

public class Cube extends Shape3D {

    private double sideLength;

    public Cube(String color, double sideLength) {
        super("Cube", color);
        setSideLength(sideLength);
    }

    public Cube() {
        this("Uncolored", 1.0);
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        if (sideLength < 0) { // ✅ allow 0
            throw new IllegalArgumentException("Side length cannot be negative");
        }
        this.sideLength = sideLength;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    protected double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Cube [Color: %s, Side Length: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(), sideLength, getSurfaceArea(), getVolume()
        );
    }
}