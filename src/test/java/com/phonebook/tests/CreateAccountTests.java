package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    //precondition:(predislowie) user should be logged out(rasloginen dolschen bitj polsowatelj)
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isElementPresent(By.xpath("//a[.='LOGIN']"))) {//esli etogo ne suschestwuet snatschit ti usche saloginilsa
            click(By.xpath("//button[.='Sign Out']"));
        }
        //click Login link
        click(By.xpath("//a[.='LOGIN']"));//saloginilisj click button Login metod click opisan nische
    }

    @Test
    public void existedUserRegistrationNegativeTest() {

        //enter email field
        type(By.cssSelector("[placeholder='Email']"), "alb@gmail.com");

        //enter password field
        type(By.cssSelector("[placeholder='Password']"), "12345Alb$");

        //click on Registration
        click(By.name("registration"));


        //assert user logged in(check Sign out button displayed) kogda salogen to pojawlaetsa pole sign out
        Assert.assertTrue(isAlertPresent());//pri wtorom prohode test prowalitsa potomuschto dwa rasa s odnimi i temi sce dannimi nelsa saregitsa
    }



}
