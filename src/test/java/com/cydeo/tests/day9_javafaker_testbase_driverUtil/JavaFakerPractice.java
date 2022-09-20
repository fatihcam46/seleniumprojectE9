package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

//pom.xml e javafaker i yukledikten sonra islem yapiyoruz
//if we need to create that generate randomly data
public class JavaFakerPractice {
    @Test
    public void test1(){
        //Creating Faker object to reach methods
        Faker faker = new Faker();
        //Faker faker = new Faker(new Locale("fr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());//faker.name().firstName() soutv
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        //randomly generating firstname , lastname,fullname
  //faker.name().firstName() = Vincent
   //faker.name().lastName() = Parker
   //faker.name().fullName() = Normand Rutherford

        //numerify() method will generate random numbers in the format we want to get
        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));
//faker.numerify("###-###-####") = 687-487-4956

        System.out.println("faker.numerify(\"312-###-####\") = "
                + faker.numerify("312-###-####"));
//faker.numerify("312-###-####") = 312-428-1441

        //letterify() method will return random letters where we pass "?"
        System.out.println("faker.letterify(\"???-????\") = "
                + faker.letterify("???-????"));
//faker.letterify("???-????") = nto-wdqf

        System.out.println("faker.bothify(\"##?#-##?#-#?#?#-##??\") = "
                + faker.bothify("##?#-##?#-#?#?#-##??"));
//faker.bothify("##?#-##?#-#?#?#-##??") = 61f6-57d8-1m9u0-05jm

        System.out.println("faker.finance().creditCard() = "
                + faker.finance().creditCard().replaceAll("-", ""));//without replaceAll possible
//faker.finance().creditCard() = 6007225102096263

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));
//faker.chuckNorris().fact() = "It works on my machine" always holds true for Muhtar..
//funny things

    }
}
