/*
 * The entrance class of hackJava project
 */
package hackjava;

import AbstractSyntaxTree.ASTBuilder;
import utils.Logger;

public class Hacker {
    Logger<Hacker> log = new Logger<>(this);
    public boolean testMethod() {
        log.info("Hello, hacker!");
        String testCodePath = "D:\\sast\\hackJava\\lib\\src\\test\\resources" +
                "\\BenchmarkJava\\src\\main\\java\\org\\owasp\\benchmark\\testcode\\";
        String testCodeFile = "BenchmarkTest00001.java";
        ASTBuilder astBuilder = new ASTBuilder(testCodePath+testCodeFile);
        astBuilder.parseSourceToAST();
        return true;
    }
}
