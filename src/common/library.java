/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class library {

    public boolean isLineEmpty(String line) {
        if (line.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int countLine() {
        BufferedReader br = null;
        int countLine = 0;
        try {
            br = new BufferedReader(new FileReader(new File(common.INPUT)));
            String line;
            while ((line = br.readLine()) != null) {
                if (isLineEmpty(line)) {
                    continue;
                }
                countLine++;
            }
        } catch (FileNotFoundException ex) {
            System.err.print("File not found!");
        } catch (IOException ex) {
            System.err.print("Intput/Outpur error!");
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                System.err.print("Intput/Outpur error!");
            }
        }
        return countLine;
    }

    public String formatOneSpace(String line) {
        line = line.toLowerCase();
        line = line.replaceAll("\\s+", " ");
        line = formatOneSpaceSpecial(line, ".");
        line = formatOneSpaceSpecial(line, ",");
        line = formatOneSpaceSpecial(line, ":");
        return line.trim();
    }

    public String formatOneSpaceSpecial(String line, String Character) {
        StringBuffer bu = new StringBuffer();
        String[] strings = line.split("\\s*\\" + Character + "\\s*");
        for (String word : strings) {
            bu.append(word + " " + Character + " ");
        }
        return bu.toString().trim().substring(0, bu.length() - 3);
    }
}
