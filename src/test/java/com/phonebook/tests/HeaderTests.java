package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{
    //В проекте создать новый класс HeaderTests и в нем 4 метода, которые будут проверять наличие элементов
    // в навигационной панели(логотип, HOME, ABOUT и LOGIN) dlja nesareg. pols. testit nalitschie etich knopok
    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.isLoginLinkPresent()) {
            app.clickOnLoginOutButton();
        }
        app.clickOnLoginLink();
    }

    @Test
    public void logo() {
         Assert.assertTrue(app.isLogoPresent());
    }

    @Test
    public void HOME() {
        Assert.assertTrue(app.isHomeLinkPresent());
    }

    @Test
    public void ABOUT() {
        Assert.assertTrue(app.isAboutLinkPresent());
    }

    @Test
    public void LOGIN() {
        Assert.assertTrue(app.isLoginLinkPresent());
    }
}
