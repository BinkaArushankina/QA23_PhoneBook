package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager
            (System.getProperty("browser", Browser.CHROME.browserName()));



   //@BeforeMethod
    @BeforeSuite
    public void setUp() {
        app.init();
    }

    //@AfterMethod(enabled = false) to schto w skobkach schtobi bruaser sam ne skriwalsa
    @AfterSuite
    public void tearDown() {
        app.stop();//wichodit is priloschenia polnostju a exit sakriwaet odnu stranizu
    }

}
//@BeforeTest (perwij na otscheredi)
   //@BeforeMethod
      //@BeforeClass
         //@BeforeSuite (w odnom brausere)
            //@BeforeGroup (budet poslednim sapuschen)

//(enabled = false) ,  to schto w skobkach schtobi bruaser sam ne skriwalsa;   kak bi sakommentirowan i wremenno ne rabotaet
//(priority = 1) ,  prioritet wnutri klassa


           //@AfterGroups
         //@AfterSuite
      //@AfterClass
   //@AfterMethod
//@AfterTest
