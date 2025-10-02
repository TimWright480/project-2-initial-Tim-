package com.csc205.project2.shapes;

/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: OpenAI GPT-5
 * Generation Date: 2025-09-29
 *
 * Original Prompt:
 * "Step 2: Create Five Concrete Shape Classes [...] Cube - Properties: sideLength"
 *
 * Formula Verification:
 * - Volume = a^3 (Source: Wolfram MathWorld)
 * - Surface Area = 6 * a^2 (Source: Wolfram MathWorld)
 */

public class Cube extends Shape3D {

    private double sideLength;

    public Cube(String color, double sideLength) {
        super("Cube", color);
        setSideLength(sideLength);
    }

    public Cube() {
        this("Uncolored",1.0);
    }
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sidelength) {
        if (sidelength <= 0) {
            throw new IllegalArgumentException("Side length must be positive");
        }
        this.sideLength = sidelength;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }

    @Override
    protected double calculateVolume () {
        return Math.pow(sideLength, 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Cube [Color: %s, Side Length: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(),sideLength, getSurfaceArea(), getVolume()
        );
    }
}
