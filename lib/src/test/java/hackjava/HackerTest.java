/*
 * a test class
 */
package hackjava;

import org.junit.jupiter.api.Test;
import utils.Logger;

import static org.junit.jupiter.api.Assertions.*;

class HackerTest {
    Logger<HackerTest> log = new Logger<>(this);
    @Test void testMethodReturnsTrue() {
        Hacker classUnderTest = new Hacker();
        assertTrue(classUnderTest.testMethod(), "testMethod should return 'true'");
        log.info("testMethod returns 'true'");
    }
}
