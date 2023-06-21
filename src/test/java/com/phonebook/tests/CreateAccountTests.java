package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //precondition:(predislowie) user should be logged out(rasloginen dolschen bitj polsowatelj)
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {     //esli etogo ne suschestwuet snatschit ti usche saloginilsa
            app.clickOnLoginOutButton();
        }
        //click Login link
        app.clickOnLoginLink();     //saloginilisj click button Login metod click opisan nische
    }

    @Test
    public void existedUserRegistrationNegativeTest() {

        //enter email field
        // enter password field
        app.fillLoginRegistrationForm(new User().setEmail("alb@gmail.com").setPassword("12345Alb$"));

        //click on Registration
        app.clickOnRegistrationButton();

        //assert user logged in(check Sign out button displayed) kogda salogen to pojawlaetsa pole sign out
        Assert.assertTrue(app.isAlertPresent());//pri wtorom prohode test prowalitsa potomuschto dwa rasa s odnimi i temi sce dannimi nelsa saregitsa
    }


}
