package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {
    //#1- initialize the driver instance and object of the class
    public LibraryLoginPage(){
        /*initElements method will create connection in between the current
        driver session (instance) and the object of the current class.         */

        PageFactory.initElements(Driver.getDriver(), this);
        // means that, initElements >> my object will know here>>
    }


    //#2- use @FindBy annotation to locate web elements
//findElement in yerine @FindBy(xpath = "mzmskldmsakj']") yaziyoruz

    @FindBy(xpath = "//input[@id='inputEmail']") // WebElement inputUsername=Driver.getDriver().findElement(By.xpath("asmpldpdld"));
                    //where me @ get me id =''
    public WebElement inputUsername;

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div") //we took text message
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")//we took text message
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']/div")
    public WebElement wrongEmailOrPasswordErrorMessage;


}
