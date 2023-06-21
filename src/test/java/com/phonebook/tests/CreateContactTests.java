package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {//esli etogo ne suschestwuet snatschit ti usche saloginilsa
            app.clickOnLoginOutButton();
        }
        app.clickOnLoginLink();

        app.fillLoginRegistrationForm(new User().setEmail("alb@gmail.com").setPassword("12345Alb$"));
        app.clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        //click on the ADD link
        app.clickOnAddLink();
        //int i = (int) (System.currentTimeMillis() / 1000) % 3600;//schtobi sdelatj pole unikalnim "1234 + i";
        //fill in the add contact form
        app.fillAddContactForm("Karl", "Adam", "1234567890", "adam@gm.com", "Koblenz", "goalkepper");
        //click on the Save button
        app.clickOnSaveButton();
        //assert the contact is added   h2 -> account
        Assert.assertTrue(app.isContactCreated("Karl"));//proweraem estj li takoj karl usche

    }

    @AfterMethod
    public void tearDown() {
        app.click(clickOnTheUserCart());
        app.click(clickOnTheRemoveButton());
    }

}
