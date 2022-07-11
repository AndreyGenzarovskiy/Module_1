package task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfTriangleTest {

    @Test
    void getLengthOfTriangleSide() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 0;
        double expected = 5;
        double actual = AreaOfTriangle.getLengthOfTriangleSide(x1, y1, x2, y2);
        assertEquals(expected, actual);
    }

    @Test
    void getAreaOfTriangle() {
        int x1 = 0;
        int y1 = 3;
        int x2 = 4;
        int y2 = 0;
        int x3 = 2;
        int y3 = 0;
        double epsilon = 0.001;
        double expected = 3.0;
        double leftBoundary = expected - epsilon;
        double rightBoundary = expected + epsilon;
        double actual = AreaOfTriangle.getAreaOfTriangle(x1, y1, x2, y2, x3, y3);
        assertTrue(actual >= leftBoundary && actual < rightBoundary);
    }
}