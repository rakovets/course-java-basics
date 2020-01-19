package com.rakovets.java.io;

import java.io.*;

public class Ticket5 {
    public static void main(String[] args) {
        String textWithReplacing;
        String text = "";
        try(InputStream fileInput = new FileInputStream("Ticket5(input).txt");
            OutputStream fileOutput = new FileOutputStream("Ticket5(output).txt")) {
            while (fileInput.available() > 0) {
                text += (char) fileInput.read();
            }
            textWithReplacing = text.replaceAll("public", "private");
            byte[] textInByte = textWithReplacing.getBytes();
            fileOutput.write(textInByte);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
