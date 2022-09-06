package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_StateDropdown {
    WebDriver driver;
    //2-  @BeforeMethod    >>WebDriver>> driver.get
    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void stateDropdownTest  () throws InterruptedException{                  ////select[@id='state']
       Select stateDropdown = new Select(driver.findElement(By.xpath("//*[@id='state']")));
        //3. Select Illinois
        Thread.sleep(1000);//you dont have to put, lets see how works.
        stateDropdown.selectByVisibleText("Illinois");

      //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");
     //5. Select California
        Thread.sleep(1000);
        stateDropdown.selectByIndex(5);

        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText, expectedOptionText);
    }
     //   6. Verify final selected option is California.
        //   Use all Select options. (visible text, value, index)

}
/*
TC #5: Selecting state from State dropdown and verifying result
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Select Illinois
4. Select Virginia
5. Select California
6. Verify final selected option is California.
Use all Select options. (visible text, value, index)
 */