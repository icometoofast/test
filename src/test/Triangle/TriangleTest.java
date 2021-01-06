package test.Triangle;

import static org.junit.Assert.*;

import org.junit.Test;
import test.Triangle.Triangle;


public class TriangleTest {

    Triangle T1 = new Triangle(2, 3, 4);
    Triangle T2 = new Triangle(0, 3, 4);
    Triangle T3 = new Triangle(1, 3, 4);
    Triangle T4 = new Triangle(2, 3, 9);
    Triangle T5 = new Triangle(2, 2, 2);
    Triangle T6 = new Triangle(5, 3, 4);
    Triangle T7 = new Triangle(0, 0, 0);
    Triangle T8 = new Triangle(2, 2, 3);

    @Test
    public void testIsTriangle() {
        assertEquals(true, T1.isTriangle(T1));
        assertEquals(false, T2.isTriangle(T2));
        assertEquals(false, T3.isTriangle(T3));
        assertEquals(false, T4.isTriangle(T4));
        assertEquals(true, T5.isTriangle(T5));
        assertEquals(true, T6.isTriangle(T6));
        assertEquals(false, T7.isTriangle(T7));
        assertEquals(true, T8.isTriangle(T8));
    }

    @Test
    public void testGetType() {
        assertEquals("Scalene",T1.getType(T1));
        assertEquals("Illegal",T2.getType(T2));
        assertEquals("Illegal",T3.getType(T3));
        assertEquals("Illegal",T4.getType(T4));
        assertEquals("Regular",T5.getType(T5));
        assertEquals("Scalene",T6.getType(T6));
        assertEquals("Illegal",T7.getType(T7));
        assertEquals("Isosceles",T8.getType(T8));
    }



}
