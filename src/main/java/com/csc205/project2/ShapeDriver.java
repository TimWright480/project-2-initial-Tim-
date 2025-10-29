package com.csc205.project2;

import com.csc205.project2.shapes.*;

import java.util.*;

public class ShapeDriver {

    public static void main(String[] args) {

        List<Shape3D> shapes = new ArrayList<>();
        shapes.add(new Sphere("Red Ball", 5.0));
        shapes.add(new Cube("Blue Box", 4.0));
        shapes.add(new Cylinder("Green Tube", 3.0, 7.0));
        shapes.add(new RectangularPrism("Yellow Brick", 3.0, 4.0, 5.0));
        shapes.add(new Pyramid("Purple Pyramid", 4.0, 6.0));

        System.out.println("=== 3D Shape Analysis System ===\n");

        System.out.println("Created Shapes:");
        int index = 1;
        for (Shape3D shape : shapes) {
            System.out.printf("%d. %s%n   - Surface Area: %.2f square units%n   - Volume: %.2f cubic units%n%n",
                    index++, shape.toString(), shape.getSurfaceArea(), shape.getVolume());
        }

        // Comparative analysis
        Shape3D largestVolume = Collections.max(shapes, Comparator.comparingDouble(Shape3D::getVolume));
        Shape3D largestSurface = Collections.max(shapes, Comparator.comparingDouble(Shape3D::getSurfaceArea));
        Shape3D mostEfficient = Collections.max(shapes, Comparator.comparingDouble(s -> s.getVolume() / s.getSurfaceArea()));

        System.out.println("Analysis Results:");
        System.out.printf("- Largest Volume: %s (%.2f)%n", largestVolume.getName(), largestVolume.getVolume());
        System.out.printf("- Largest Surface Area: %s (%.2f)%n", largestSurface.getName(), largestSurface.getSurfaceArea());
        System.out.printf("- Most Efficient (Volume/Surface): %s (%.2f)%n",
                mostEfficient.getName(), mostEfficient.getVolume() / mostEfficient.getSurfaceArea());
    }
}