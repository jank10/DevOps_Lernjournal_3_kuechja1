/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package org.example;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        try {
            // Specify the source and destination files
            File sourceFile = new File("input.txt");
            File destinationFile = new File("copied_text.txt");

            // Copy the source file to the destination
            FileUtils.copyFile(sourceFile, destinationFile);

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }


    }
}
