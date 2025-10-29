package com.csc205.project2.shapes;


/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: OpenAI GPT-5
 * Generation Date: 2025-09-29
 *
 * Original Prompt:
 * "Step 2: Create Five Concrete Shape Classes [...] RectangularPrism - Properties: length, width, height"
 *
 * Formula Verification:
 * - Volume = l * w * h (Source: Wolfram MathWorld)
 * - Surface Area = 2(lw + lh + wh) (Source: Wolfram MathWorld)
 */

public class RectangularPrism extends Shape3D {

    private double length;
    private double width;
    private double height;

    public RectangularPrism(String color, double length, double width, double height) {
        super("Rectanguilar Prism", color);
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
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height must be positive");
        }
        this.height = height;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    protected double calculateVolume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format(
                "Retangular Prism [Color: %s, Radius: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(), length, width, height, getSurfaceArea(), getVolume()
        );
    }
}