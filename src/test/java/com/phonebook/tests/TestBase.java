package com.phonebook.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://telranedu.web.app"); //sajti
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //dast 10 sec wremeni schtobi sajt uspel sagrusitsa, a potom test
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();//wichodit is priloschenia polnostju a exit sakriwaet odnu stranizu
    }

    public boolean isElementPresent(By locator) { //By class selenium locator peremennaja, ubiwersalnaja
        return driver.findElements(locator).size() > 0;  //esli bolsche 0 ubedimsa schto element totschno suschestwuet
    }

    public boolean isElementPresent1(By locator) { //wtoroe uniwersalnoe sredstwo
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;//esli ne najdesch eto kidaj false, a ne oschibku
        }
    }

    public void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {//uniwersalnij metod click() on budet klikatj
        driver.findElement(locator).click();
    }

    public boolean isAlertPresent() {//schtobi wspliwajuschee okno robot uwidel i naschal na ok i wernulsa na str
        Alert alert = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.alertIsPresent());//klass otwetschajuschij sa oschidanie i ukasiwaem wrema , jawnoe oschidanie, otrabatiwaet 20 sek

        if (alert == null) {
            return false;
        } else {
            driver.switchTo().alert();//pereprigni so stranizi na alert wipliwajuschij
            alert.accept();//robot podtwerschdaet knopku ok na wspliwajuschem okne
            return true;
        }
    }
}
