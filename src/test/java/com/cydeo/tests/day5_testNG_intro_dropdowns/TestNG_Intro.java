package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;
//https://mvnrepository.com/artifact/org.testng/testng/7.5
//burdan pom.xml e testNG yi yukledikten sonra main method kullanmiyoruz.//direkt @Test yaziyoruz.

public class TestNG_Intro { //click here test1 and test2 running

    @BeforeClass
    public void setupMethod(){  //firstly it is running , one time,first//it can be everywhere
        System.out.println("---> BeforeClass is running!");
    }
    @AfterClass
    public void tearDownClass(){   //finally is running, just one time, last //it can be everywhere
        System.out.println("---> AfterClass is running!");
    }

    @BeforeMethod
    public void setUpMethod(){  //every Test ,before is running    @BeforeMethod
        System.out.println("---> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){  //every Test ,after is running  @AfterMethod
        System.out.println("---> AfterMethod is running!");
    }


    @Test (priority = 2)  //after test1 is running
    public void test1(){ //click here test running
        System.out.println("Test 1 is running...");  //Test 1 is running...

        //ASSERT EQUALS: compare 2 of the same things
        String actual = "apple";
        String expected = "apple";//if here is different from actual>>it will fail

        Assert.assertEquals(actual, expected);//aeq shortcut//without String you can write
//Assert class has some values>>
    }

    @Test (priority = 1)  //first test2 is running
    public  void test2(){  //click here test2 running
        System.out.println("Test 2 is running...");//Test 2 is running...
//AssertTrue
        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected), "your message will go here");

    }

}
