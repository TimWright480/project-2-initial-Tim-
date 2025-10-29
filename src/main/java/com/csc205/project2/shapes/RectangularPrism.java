package com.csc205.project2.shapes;

public class RectangularPrism extends Shape3D {

    private double length;
    private double width;
    private double height;

    public RectangularPrism(String color, double length, double width, double height) {
        super("Rectangular Prism", color);
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public RectangularPrism() {
        this("Uncolored", 1.0, 1.0, 1.0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length cannot be negative");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width cannot be negative");
        }
        this.width = width;
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
        return 2 * (length * width + length * height + width * height);
    }

    @Override
    protected double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format(
                "Rectangular Prism [Color: %s, Length: %.2f, Width: %.2f, Height: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(), length, width, height, getSurfaceArea(), getVolume()
        );
    }
}