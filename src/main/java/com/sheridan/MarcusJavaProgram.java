package com.sheridan;

import java.util.logging.Level;
import java.util.logging.Logger;


public class MarcusJavaProgram {
    private static final Logger logger = Logger.getLogger(MarcusJavaProgram.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            int result = performCalculation(5, 0);
            logger.info("Calculation result: " + result);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred", e);
        }

        logger.info("Application finished");
    }

    public static int performCalculation(int a, int b) {
        logger.fine("Performing calculation with a=" + a + ", b=" + b);
        return a / b; // This will throw an exception if b is 0
    }
}
