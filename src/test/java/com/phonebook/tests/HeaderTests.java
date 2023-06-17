package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{
    //В проекте создать новый класс HeaderTests и в нем 4 метода, которые будут проверять наличие элементов
    // в навигационной панели(логотип, HOME, ABOUT и LOGIN) dlja nesareg. pols. testit nalitschie etich knopok

    @Test
    public void headerTests() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/home']")));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/about']")));
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/login']")));
        Assert.assertTrue(isElementPresent(By.xpath("//h1[text()='PHONEBOOK']")));
    }








    public boolean logo() {
        return isElementPresent(By.xpath("//h1[text()='PHONEBOOK']"));
    }
    public boolean HOME() {
        return isElementPresent(By.xpath("//a[@href='/home']"));
    }
    public boolean ABOUT() {
        return isElementPresent(By.xpath("//a[@href='/about']"));
    }
    public boolean LOGIN() {
        return isElementPresent(By.xpath("//a[@href='/login']"));
    }
}
