package com.cydeo.utilities;

import java.io.*;
import java.util.*;

public class ConfigurationReader {
    //1- Create the object of Properties
    private static Properties properties = new Properties(); //inaccessible, private we need
    static{
        try {
            //2- We need to open the file in java memory: FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3- Load the properties object using FileInputStream object
            properties.load(file); //surround try/catch for `load`

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }
    }
//keyword means that configuration properties (disardaki bir dosya ,target in orda) look>>after>>which keyword >>take it
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
