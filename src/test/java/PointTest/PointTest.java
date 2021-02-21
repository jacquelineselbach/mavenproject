package PointTest;

import Point.Point;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PointTest {

        @BeforeAll
        static void init() {}

        @BeforeEach
        void setUp() {}

        @Test
        public void testCalcDistance_samePosition() {

            Point point1 = new Point(1,1);
            Point point2 = new Point(1,1);
            double actual = point1.calcDistance(point2);
            double expected = 0.0;
            assertEquals(expected, actual,0.0001);
        }

        @Test
        public void testCalcDistance_P2higher() {

            Point point1 = new Point(1,1);
            Point point2 = new Point(2,2);
            double actual = point1.calcDistance(point2);
            double expected = 1.4142135623730951;
            assertEquals(expected, actual,0.0001);
        }

        @Test
        public void testCompare_samePosition() {
            Point point1 = new Point(1,1);
            Point point2 = new Point(1,1);
            assertTrue(point1.compare(point2));
        }
}


