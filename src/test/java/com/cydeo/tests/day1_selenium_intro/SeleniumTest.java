package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //1-setting up the web driver manager
        WebDriverManager.chromedriver().setup();

        //2-create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3-test if driver is working as expected
        driver.get("https://www.facebook.com");
    }
}
