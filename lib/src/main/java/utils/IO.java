package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IO {
    public static String getFileContent(String filePath){
        StringBuilder fileContent = new StringBuilder();
        String line = "";
        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            while ((line = in.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileContent.toString();
    }
}
