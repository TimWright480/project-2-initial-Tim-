package com.csc205.project2.shapes;

/**
 * Abstract base class for all three-dimensional shapes.
 * Provides common properties such as name and color,
 * and enforces the implementation of surface area and volume
 * calculations in subclasses.
 *
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: OpenAI GPT-5
 * Generation Date: 2025-09-29
 *
 * Original Prompt:
 * "You are provided with this interface that all shapes must implement: [...]
 * Step 1: Generate the Abstract Base Class [...]"
 *
 * Manual Modifications:
 * - Ensured consistent toString() formatting
 * - Added validation for null/empty name and color values
 *
 * Formula Verification:
 * - Not applicable (abstract class, no formulas implemented)
 */

public abstract class Shape3D implements ThreeDimensionalShape {

    private String name;
    private String color;

    public Shape3D(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Shape3D() {
        this("Unknown" ,"Uncolored");
    }

    protected abstract double calculateSurfaceArea();

    protected abstract double calculateVolume();

    @Override
    public double getSurfaceArea() {
        return calculateSurfaceArea();
    }

    @Override
    public double getVolume() {
        return calculateVolume();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank()) {
            throw new IllegalArgumentException("Color cannot be null or empty");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format(
                "%s [Color: %s, Surface Area: %.2f, Volume: %.2f]",
                getName(), getColor(), getSurfaceArea(), getVolume()
        );
    }
}
