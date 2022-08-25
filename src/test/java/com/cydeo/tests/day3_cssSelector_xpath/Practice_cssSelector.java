package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice_cssSelector {
    public static void main(String[] args) {

        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
//2- Go to: https://google.com
        driver.get("https://www.google.com");
        WebElement acceptAll = driver.findElement(By.cssSelector("div[class='QS5gu sy4vM']"));
        acceptAll.click();
        WebElement googleSearch = driver.findElement(By.cssSelector("input[class='gLFyf gsfi']"));
        googleSearch.sendKeys("DUDLEY COUNCIL" + Keys.ENTER);

        WebElement dudleyWikipedia = driver.findElement(By.cssSelector("a[class='ruhjFe NJLBac fl']"));
        dudleyWikipedia.click();

                //4. Verify title:        //Expected: “Metropolitan Borough of Dudley - Wikipedia”
        String expectedInTitle = "Metropolitan Borough of Dudley - Wikipedia";
        String actualTitle = driver.getTitle();

        if (actualTitle.startsWith(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }//Title verification PASSED!

    }
    }
