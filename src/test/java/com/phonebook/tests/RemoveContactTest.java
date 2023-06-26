package com.phonebook.tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTest extends TestBase{
    //Создайте, пожалуйста, класс RemoveContactTest, где будет содержаться метод, проверяющий удаление контакта
    //(все остальные действия следует вынести в @BeforeMethod). Попытайтесь написать Assert

    @BeforeMethod
    public void ensurePrecondition() {
        if (!app.getHeader().isLoginLinkPresent()) {
            app.getHeader().clickOnLoginOutButton();
        }
        app.getHeader().clickOnLoginLink();

        app.getUser().fillLoginRegistrationForm(new User().setEmail("alb@gmail.com").setPassword("12345Alb$"));
        app.getUser().clickOnLoginButton();
        app.getHeader().clickOnAddLink();

        app.getContact().fillAddContactForm(new Contact()
                .setName("Karl")
                .setLastname("Adam")
                .setPhone("1234567890")
                .setEmail("adam@gm.com")
                .setAddress("Koblenz")
                .setDesc("goalkepper"));

        app.getContact().clickOnSaveButton();

        Assert.assertTrue(app.getContact().isContactCreated("Karl"));

        app.getContact().removeContact();
    }

    @Test
    public void removeContactTest() {

        Assert.assertTrue(app.getContact().isContactDeleted("Karl"));

    }
}
