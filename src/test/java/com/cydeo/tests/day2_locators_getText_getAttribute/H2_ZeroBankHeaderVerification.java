package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        WebElement headerText = driver.findElement(By.tagName("h3"));
        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();

        if(expectedHeaderText.equals(actualHeaderText)){

            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!!!");
        }

    }
}
