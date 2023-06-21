package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    public static By clickOnTheRemoveButton() {
        return By.xpath("//button[text()='Remove']");
    }

    public static By clickOnTheUserCart() {
        return By.cssSelector(".contact-item_card__2SOIM");
    }

    @BeforeMethod
    public void setUp() {
        app.init();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop();//wichodit is priloschenia polnostju a exit sakriwaet odnu stranizu
    }

}
