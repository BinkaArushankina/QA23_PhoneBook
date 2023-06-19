package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase{
    //В проекте создать новый класс HeaderTests и в нем 4 метода, которые будут проверять наличие элементов
    // в навигационной панели(логотип, HOME, ABOUT и LOGIN) dlja nesareg. pols. testit nalitschie etich knopok

    @Test
    public void logo() {
         Assert.assertTrue(isElementPresent(By.xpath("//h1[text()='PHONEBOOK']")));
    }
    @Test
    public void HOME() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/home']")));
    }
    @Test
    public void ABOUT() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/about']")));
    }
    @Test
    public void LOGIN() {
        Assert.assertTrue(isElementPresent(By.xpath("//a[@href='/login']")));
    }
}
