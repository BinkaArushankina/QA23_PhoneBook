package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateContactTests extends TestBase{
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {//esli etogo ne suschestwuet snatschit ti usche saloginilsa
            app.getHeader().clickOnLoginOutButton();
        }
        app.getHeader().clickOnLoginLink();

        app.getUser().fillLoginRegistrationForm(new User().setEmail("alb@gmail.com").setPassword("12345Alb$"));
        app.getUser().clickOnLoginButton();
    }

    @Test
    public void addContactPositiveTest() {
        //click on the ADD link
        app.getHeader().clickOnAddLink();
        //int i = (int) (System.currentTimeMillis() / 1000) % 3600;//schtobi sdelatj pole unikalnim "1234 + i";
        //fill in the add contact form
        app.getContact().fillAddContactForm(new Contact()//sdes sabiraem metodi is contacta
                .setName("Karl")
                .setLastname("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Koblenz")
                .setDesc("goalkepper"));
        //click on the Save button
        app.getContact().clickOnSaveButton();
        //assert the contact is added   h2 -> account
        Assert.assertTrue(app.getContact().isContactCreated("Karl"));//proweraem estj li takoj karl usche

    }

    @AfterMethod
    public void tearDown() {
        app.getContact().removeContact();
    }

}
