package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))) {//esli etogo ne suschestwuet snatschit ti usche saloginilsa
            click(By.xpath("//button[.='Sign Out']"));
        }
        //click Login link
        click(By.xpath("//a[.='LOGIN']"));//saloginilisj click button Login metod click opisan nische
    }

    @Test
    public void loginPositiveTest() {

        //enter email field
        type(By.cssSelector("[placeholder='Email']"), "alb@gmail.com");

        //enter password field
        type(By.cssSelector("[placeholder='Password']"), "12345Alb$");

        //click on Registration
        click(By.name("login"));

        //assert user logged in(check Sign out button displayed) kogda salogen to pojawlaetsa pole sign out
        Assert.assertTrue(isElementPresent1(By.xpath("//button[.='Sign Out']")));//pri wtorom prohode test prowalitsa potomuschto dwa rasa s odnimi i temi sce dannimi nelsa saregitsa
    }
}
