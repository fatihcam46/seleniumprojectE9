package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1_EtsyTitleVerification {
    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        //3. Search for “wooden spoon”
        //4. Verify title:        //Expected: “Wooden spoon | Etsy”
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
      //  driver.findElement(By.name("agree")).click();
       WebElement accept = driver.findElement(By.className("wt-overlay__footer__action"));
       accept.click();

        //3. Search for “wooden spoon”
        WebElement etsySearchBox = driver.findElement(By.name("q"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:        //Expected: “Wooden spoon | Etsy”
        String expectedInTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }//Title verification PASSED!

    }
}
