package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_nonSelectDropdown {
    WebDriver driver;
    //2-  @BeforeMethod    >>WebDriver>> driver.get
    @BeforeMethod
    public void setupMethod() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void nonSelectDropdownTest  () throws InterruptedException{
       //3. Click to non-select dropdown
      //  Select nonSelectDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdownMenuLink']")));
        WebElement nonSelectDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectDropdown.click();
        Thread.sleep(3000);

        //4. Select Facebook from dropdown
        WebElement selectFacebook = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a[4]"));
        selectFacebook.click();
//5. Verify title is “Facebook - Log In or Sign Up”
        WebElement facebookTitle = driver.findElement(By.xpath("//*[@id=\"pageTitle\"]"));

        String actualTitle = facebookTitle.getText();
        String expectedTitle = "Facebook – log in or sign up";
        //System.out.println(driver.getTitle());
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }
    }
}
/*
TC #7: Selecting value from non-select dropdown
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Click to non-select dropdown
4. Select Facebook from dropdown
5. Verify title is “Facebook - Log In or Sign Up”
 */