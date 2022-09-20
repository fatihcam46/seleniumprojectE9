package com.cydeo.tests.day8_properties_config_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {
    @Test                  //load  and FileInputStream  exception we write IOException
    public void reading_from_properties_test() throws IOException {
        //1- Create the object of Properties
        Properties properties = new Properties();

        //2- We need to open the file in java memory: FileInputStream
        FileInputStream file = new FileInputStream("configuration.properties");

        //3- Load the properties object using FileInputStream object
        properties.load(file);

        //4- Use "properties" object to read value

        System.out.println("properties.getProperty(\"browser\") = "
                + properties.getProperty("browser"));  //browser yazinca =chrome yazacak, configuration.properties
        //properties.getProperty("browser") = chrome
        System.out.println("properties.getProperty(\"env\") = "
                + properties.getProperty("env"));// env=https://login1.nextbasecrm.com
        //properties.getProperty("env") = https://login1.nextbasecrm.com
        System.out.println("properties.getProperty(\"username\") = "
                + properties.getProperty("username"));//username=helpdesk1@cydeo.com
       //properties.getProperty("username") = helpdesk1@cydeo.com


    }
}
