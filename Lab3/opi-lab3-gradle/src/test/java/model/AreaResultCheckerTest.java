package model;
import org.junit.jupiter.api.Test;
import model.AreaResultChecker;

import static org.junit.jupiter.api.Assertions.*;

class AreaResultCheckerTest {

    @Test
    void testCheckInCircle() {
        assertTrue(AreaResultChecker.checkInCircle(-1, -1, 2));
        assertFalse(AreaResultChecker.checkInCircle(1, 1, 2));
    }

    @Test
    void testCheckArea() {
        assertTrue(AreaResultChecker.checkArea(-1, 1, 2));
        assertFalse(AreaResultChecker.checkArea(2, -1, 2));
    }

    @Test
    void testValidateXYR() {
        assertTrue(AreaResultChecker.validateXYR(1, 1, 3));
        assertFalse(AreaResultChecker.validateXYR(3, 3, 1));
    }

    @Test
    void testGetResult() {
        assertTrue(AreaResultChecker.getResult(-1, 1, 2));
        assertFalse(AreaResultChecker.getResult(1, -1, 2));
    }
}