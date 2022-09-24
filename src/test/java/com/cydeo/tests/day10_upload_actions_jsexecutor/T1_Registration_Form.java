package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
//review all things selenium
public class T1_Registration_Form {
    @Test
    public void registration_form_test() {
        //1. Open browser
        //2. Go to website:https://practice.cydeo.com/registration_form
        //Driver.getDriver() --> driver  //it will create
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));
//once utilities>>Driver  acip>>browser secip>>chrome acip>>Configuration properties ten browser=chrome
        //sonra >>registration.form.url=https://practice.cydeo.com/registration_form  aciyor
   //this key from Configuration properties registration.form.url=https://practice.cydeo.com/registration_form

        //Create JavaFaker object
        Faker faker = new Faker();  //let's create faker name it is writing,generating
//3. Enter first name
        //WebElement inputFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));     //attribute value
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String fakerFirstName = faker.name().firstName();
        inputFirstName.sendKeys(fakerFirstName);
//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
//5. Enter username
        //inputUsername.sendKeys(faker.name().username().replaceAll(".", ""));
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));

        String user = faker.bothify("helpdesk###");//randomly generating username bothify:numeric,letter
        inputUsername.sendKeys(user);

        //6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user + "@email.com");

        //7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));//randomly generating password
        //System.out.println("faker.internet().password() = " + faker.internet().password());

        //8. Enter phone number
        WebElement inputPhone = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));//numerify:numeric randomly generating

        //9. Select a gender from radio buttons                                              //inspect>copy female
        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputBirthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        //faker.number().numberBetween(2004, 1920)
        inputBirthday.sendKeys("03/08/2000");

        //11.Select Department/Office
        Select departmentDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));
        //break until 1.05pm cst

        //12.Select Job Title
        Select jobTitleDropdown = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitleDropdown.selectByIndex(faker.number().numberBetween(1,8));

        //13.Select programming language from checkboxes
        WebElement selectProgrammingLang = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        selectProgrammingLang.click();

        //14.Click to sign up button
        WebElement clickSignup = Driver.getDriver().findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
        clickSignup.click();

        //15.Verify success message “You’ve successfully completed registration.” is displayed.

        WebElement verifyRegistration = Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/div/p"));

        //15. Verify success message “You’ve successfully completed registration.” is displayed.
      //  WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
    //    Assert.assertTrue(fileUploadedHeader.isDisplayed());
    }
}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.
 */