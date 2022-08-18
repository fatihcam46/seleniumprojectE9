package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2_ZeroBankHeaderVerification {
    //TC #2: Zero Bank header verification
    //1. Open Chrome browser
    //2. Go to http://zero.webappsecurity.com/login.html
    //3. Verify header text    //Expected: “Log in to ZeroBank”
    public static void main(String[] args) {
    //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text    //Expected: “Log in to ZeroBank”

        String actualHeader = driver.getTitle();
        System.out.println("actualHeader = " + actualHeader);
        String expectedHeader = "Log in to ZeroBank";
        
        if (actualHeader.equals(expectedHeader)){
            System.out.println("Header verification PASSED!");
        }else{
            System.out.println("Header verification FAILED!!!");
        }
    }
}
