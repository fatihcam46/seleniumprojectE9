package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException{
        //1-setup browser driver          //throws InterruptedException{ for  Thread.sleep(3000);  we wrote
        WebDriverManager.chromedriver().setup();
        //2-create instance of the selenium webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();//this is making full screen
//driver.manage().window().fullscreen(); for MAC users
        //3-go to tesla.com
        driver.get("https://www.tesla.com");//without https it cannot,invalid argument

        System.out.println("driver.getCurrentUrl()= " + driver.getCurrentUrl());
  //driver.getCurrentUrl()= https://www.tesla.com/
        System.out.println("driver.getTitle()= " + driver.getTitle());
//driver.getTitle()= Electric Cars, Solar & Clean Energy | Tesla

        //stop code execution for 3 seconds
        Thread.sleep(3000);
        //use selenium navigate back
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();//use selenium navigate forward
        
         Thread.sleep(3000);//wait 3 second
        driver.navigate().refresh();//use selenium navigate refresh

        //use navigate().to()
        driver.navigate().to("https://www.google.com");

        //get the title of the page
        System.out.println("driver.getTitle()= " + driver.getTitle());
//driver.getTitle()= Google

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);//currentTitle = Google

        System.out.println("driver.getCurrentUrl()= " + driver.getCurrentUrl());
//driver.getCurrentUrl()= https://www.google.com/

        //this will close the currently opened window
            driver.close();

        //this will close all of the  opened window//
     //   driver.quit();

    }
}
