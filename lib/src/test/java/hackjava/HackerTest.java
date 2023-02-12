/*
 * a test class
 */
package hackjava;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HackerTest {
    @Test void testMethodReturnsTrue() {
        Hacker classUnderTest = new Hacker();
        assertTrue(classUnderTest.testMethod(), "testMethod should return 'true'");
    }
}
