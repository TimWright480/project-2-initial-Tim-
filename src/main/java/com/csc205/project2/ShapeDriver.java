package com.csc205.project2;


/**
 * Demonstrates the functionality of 3D shape classes.
 *
 * AI GENERATION DOCUMENTATION
 * ===========================
 * AI Tool Used: OpenAI GPT-5
 * Generation Date: 2025-09-29
 *
 * Original Prompt:
 * "Yes and name the class ShapeDriver"
 *
 * Manual Modifications:
 * - Added polymorphism demo with array of shapes
 */
import com.csc205.project2.shapes.*;

public class ShapeDriver {

    public static void main(String[] args) {

        Sphere sphere = new Sphere();
        Cube cube = new Cube();
        Cylinder cylinder = new Cylinder();
        RectangularPrism prism = new RectangularPrism();
        Pyramid pyramid = new Pyramid();

        System.out.println("=== Individual Shape Output ===");
        System.out.println(sphere);
        System.out.println(cube);
        System.out.println(cylinder);
        System.out.println(prism);
        System.out.println(pyramid);

        System.out.println("\n=== Polymorhism Demo ===");
        ThreeDimensionalShape [] shapes = {sphere, cube, cylinder, prism, pyramid};

        for (ThreeDimensionalShape shape : shapes) {
            System.out.printf("%s -> Surface Area: %.2f, Volume: %.2f%n ",
                    ((Shape3D) shape).getName(),
                    shape.getSurfaceArea(),
                    shape.getVolume());
        }
        // TODO: Create instances of your shape classes and test their methods here.
    }
}
