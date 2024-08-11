package com.example.input_output;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInputExample {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = FileInputExample.class.getClassLoader().getResourceAsStream("article.txt");
//        String fileName = "C:\\Users\\serge\\IdeaProjects\\Ablazzing\\article.txt";
//        FileReader fileReader = new FileReader(fileName, StandardCharsets.UTF_8);
//
//        while (fileReader.ready()) {
//            char read = (char) fileReader.read();
//
//            System.out.print(read);
//        }

//        Scanner scanner = new Scanner(new File(fileName), StandardCharsets.UTF_8);
        Scanner scanner = new Scanner(resourceAsStream, StandardCharsets.UTF_8);
        int count = 0;
        int lineNeeded = 1;
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (count == lineNeeded) {
//                System.out.println();
                System.out.println(nextLine);
            }
            count++;
        }
        scanner.close();
        resourceAsStream.close();

        
    }
}
