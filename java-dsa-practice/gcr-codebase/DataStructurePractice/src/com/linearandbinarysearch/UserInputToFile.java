package com.linearandbinarysearch;

import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {

        String fileName = "userInput.txt";

        try {
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            
            FileWriter fw = new FileWriter(fileName);

            String input;

            System.out.println("Enter text (type 'exit' to stop):");
           
            
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                
                fw.write(input + "\n");
            }

            
            fw.close();
            br.close();
            isr.close();

            System.out.println("User input has been written to " + fileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
