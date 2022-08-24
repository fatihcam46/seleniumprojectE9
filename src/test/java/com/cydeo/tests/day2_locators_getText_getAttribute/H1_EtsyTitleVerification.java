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
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
       //driver.findElement(By.className("wt-btn wt-btn--filled wt-mb-xs-0")).click();
        
//     WebElement accept = driver.findElement(By.className("wt-btn wt-btn--filled wt-mb-xs-0"));
 // accept.click();  it did not work. i used cssSelector
        WebElement acceptInButton = driver.findElement(By.cssSelector("button[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        acceptInButton.click();
        //3. Search for “wooden spoon”
        WebElement etsySearchBox = driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //4. Verify title:        //Expected: “Wooden spoon | Etsy”
        String expectedInTitle = "Wooden spoon - Etsy UK";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }//Title verification PASSED!

    }
}
