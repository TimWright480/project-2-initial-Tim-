package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void testSurfaceAreaAndVolume() {
        Cylinder cylinder = new Cylinder("Green", 2.0, 5.0);
        assertEquals(87.9646, cylinder.getSurfaceArea(), 0.001); // 2πr(h+r)
        assertEquals(62.832, cylinder.getVolume(), 0.001);       // πr²h
    }

    @Test
    void testZeroDimensions() {
        Cylinder cylinder = new Cylinder("Flat", 0.0, 0.0);
        assertEquals(0.0, cylinder.getSurfaceArea(), 0.001);
        assertEquals(0.0, cylinder.getVolume(), 0.001);
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new Cylinder("Green", -2.0, 5.0));
        assertThrows(IllegalArgumentException.class, () -> new Cylinder("Green", 2.0, -5.0));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new Cylinder("Blue", 1.0, 1.0);
        assertEquals(12.566, shape.getSurfaceArea(), 0.001);
        assertEquals(3.142, shape.getVolume(), 0.001);
    }
}