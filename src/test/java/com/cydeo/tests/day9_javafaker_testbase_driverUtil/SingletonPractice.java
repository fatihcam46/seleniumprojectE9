package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import org.testng.annotations.Test;

public class SingletonPractice {

    @Test(priority = 2)
    public void singleton_understand_test1(){

        String str1 = Singleton.getWord();//getWord kullandik, private oldugundan>>
        System.out.println("str1 = " + str1);
//Word already has value.
//str1 = something

        String str2 = Singleton.getWord();
        System.out.println("str2 = " + str2);
//Word already has value.
//str2 = something

        String str3 = Singleton.getWord();
        System.out.println("str3 = " + str3);
//Word already has value.
//str3 = something
    }
    @Test (priority = 1)  //ilk bu yazdirilacak>>
    public void singleton_understanding_test2(){
        String str4 = Singleton.getWord();
        System.out.println("str4 = " + str4);
 //First time call. Word object is null. Assigning value to it now!
   //str4 = something

    }
}
