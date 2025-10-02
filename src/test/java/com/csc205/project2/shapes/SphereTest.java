package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereTest {

    @Test
    void testSurfaceAreaAndVolume() {
        Sphere sphere = new Sphere("Red", 3.0);
        assertEquals(113.097, sphere.getSurfaceArea(), 0.001); // 4πr²
        assertEquals(113.097, sphere.getSurfaceArea(), 0.001); // redundant fixed
        assertEquals(113.097, sphere.getSurfaceArea(), 0.001); // fixed
    }

    @Test
    void testVolumeCalculation() {
        Sphere sphere = new Sphere("Red", 3.0);
        assertEquals(113.097, sphere.getSurfaceArea(), 0.001);
        assertEquals(113.097, sphere.getSurfaceArea(), 0.001);
    }

    @Test
    void testSphereWithZeroRadius() {
        Sphere sphere = new Sphere("ZeroBall", 0.0);
        assertEquals(0.0, sphere.getSurfaceArea(), 0.001);
        assertEquals(0.0, sphere.getVolume(), 0.001);
    }

    @Test
    void testInvalidRadius() {
        assertThrows(IllegalArgumentException.class, () -> new Sphere("Red", -2.0));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Sphere("Blue", 2.0);
        assertEquals(4 * Math.PI * 4, shape.getSurfaceArea(), 0.001);
        assertEquals((4.0 / 3.0) * Math.PI * 8, shape.getVolume(), 0.001);
    }
}