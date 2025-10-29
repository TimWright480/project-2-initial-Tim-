package com.csc205.project2.shapes;


/**
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: OpenAI GPT-5
 * Generation Date: 2025-09-29
 *
 * Original Prompt:
 * "Step 2: Create Five Concrete Shape Classes [...] Sphere - Properties: radius"
 *
 * Manual Modifications:
 * - Verified formulas with trusted sources
 *
 * Formula Verification:
 * - Volume = (4/3) * π * r^3 (Source: Wolfram MathWorld)
 * - Surface Area = 4 * π * r^2 (Source: Wolfram MathWorld)
 */

public class Sphere extends Shape3D {

    private double radius;

    public Sphere(String color, double radius) {
        super("Sphere",color);
        setRadius(radius);
    }

    public Sphere() {
        this("Uncolored", 1.0);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        if(radius < 0){
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    protected double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    protected double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format(
                "Sphere [Color: %s, Radius: %.2f, Surface Area: %.2f, Volume: %.2f]",
                getColor(), radius, getSurfaceArea(), getVolume()
        );
    }
}