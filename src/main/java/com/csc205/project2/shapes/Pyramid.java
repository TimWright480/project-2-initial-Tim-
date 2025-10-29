package com.csc205.project2.shapes;

public class Pyramid extends Shape3D {

    private double baseLength;
    private double height;

    public Pyramid(String color, double baseLength, double height) {
        super("Pyramid", color);
        setBaseLength(baseLength);
        setHeight(height);
    }

    public Pyramid() {
        this("Uncolored", 1.0, 1.0);
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        if (baseLength < 0) {
            throw new IllegalArgumentException("Base length cannot be negative");
        }
        this.baseLength = baseLength;
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
        double slantHeight = Math.sqrt(Math.pow(baseLength / 2.0, 2) + Math.pow(height, 2));
        return Math.pow(baseLength, 2) + 2 * baseLength * slantHeight;
    }

    @Override
    protected double calculateVolume() {
        return (1.0 / 3.0) * Math.pow(baseLength, 2) * height;
    }

    @Override
    public String toString() {
        return String.format(
                "Pyramid [Color: %s, Base Length: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(), baseLength, height, getSurfaceArea(), getVolume()
        );
    }
}