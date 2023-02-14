/*
 * The entrance class of hackJava project
 */
package hackjava;

import utils.Logger;

public class Hacker {
    Logger<Hacker> log = new Logger<>(this);
    public boolean testMethod() {
        log.info("Hello, hacker!");
        return true;
    }
}
