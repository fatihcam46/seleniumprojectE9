package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H3_BackAndForthNavigation {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:        //Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:        //Expected: Google

        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://google.com
        driver.get("https://www.google.com");

        WebElement acceptAll = driver.findElement(By.id("L2AGLb"));
        acceptAll.click();
        //3- Click to Gmail from top right.
        WebElement gmailButton = driver.findElement(By.className("gb_d"));
        gmailButton.click();

        //4- Verify title contains:        //Expected: Gmail
        String expectedTitle = "Gmail: Private and secure email at no cost | Google Workspace";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }//Title verification PASSED!
     //5- Go back to Google by using the .back();
        driver.navigate().back();

        //6- Verify title equals:        //Expected: Google
        String expectedLastTitle = "Google";
        String actualLastTitle = driver.getTitle();

        if (actualLastTitle.equals(expectedLastTitle)){
            System.out.println("Last Title verification PASSED!");
        }else{
            System.out.println("Last Title verification FAILED!!!");
        }//Last Title verification PASSED!
    }
}
