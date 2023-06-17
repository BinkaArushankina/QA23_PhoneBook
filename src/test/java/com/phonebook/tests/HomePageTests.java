package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void openHomePageTest() { //w etom teste wisiwaem metodi nische i proweraem, eto nasiwaetsa musornij kod buler playedKod
        //System.out.println("Home Component is " + isHomeComponentPresent());//budet true esli schto schto estj
        //isElementPresent(By.xpath("//h1[text()='Home Component']"));
        //isElementPresent1(By.xpath("//h1[text()='Home Component']"));
        Assert.assertTrue(isElementPresent1(By.xpath("//h1[text()='Home Component']"))); //esli ego net snatschit test ne polnozennij, assert objasatelno
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.xpath("//h1[text()='Home Component']"));  //esli bolsche 0 ubedimsa schto element totschno suschestwuet
    }

    public boolean isHomeComponentPresent1() {
        return isElementPresent1(By.xpath("//h1[text()='Home Component']"));
    }


}
