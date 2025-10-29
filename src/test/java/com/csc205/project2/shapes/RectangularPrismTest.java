package com.csc205.project2.shapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangularPrismTest {

    @Test
    void testSurfaceAreaAndVolume() {
        RectangularPrism prism = new RectangularPrism("Yellow", 3.0, 4.0, 5.0);
        assertEquals(94.0, prism.getSurfaceArea(), 0.001); // 2(lw+lh+wh)
        assertEquals(60.0, prism.getVolume(), 0.001);      // lwh
    }

    @Test
    void testZeroDimensions() {
        RectangularPrism prism = new RectangularPrism("Flat", 0.0, 0.0, 0.0);
        assertEquals(0.0, prism.getSurfaceArea(), 0.001);
        assertEquals(0.0, prism.getVolume(), 0.001);
    }

    @Test
    void testInvalidDimensions() {
        assertThrows(IllegalArgumentException.class, () -> new RectangularPrism("Yellow", -3.0, 4.0, 5.0));
        assertThrows(IllegalArgumentException.class, () -> new RectangularPrism("Yellow", 3.0, -4.0, 5.0));
        assertThrows(IllegalArgumentException.class, () -> new RectangularPrism("Yellow", 3.0, 4.0, -5.0));
    }

    @Test
    void testPolymorphism() {
        Shape3D shape = new RectangularPrism("Orange", 2.0, 3.0, 4.0);
        assertEquals(52.0, shape.getSurfaceArea(), 0.001);
        assertEquals(24.0, shape.getVolume(), 0.001);
    }
}