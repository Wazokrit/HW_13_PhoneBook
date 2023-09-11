package tests;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{
    @Test
    public void registrationPositiveTest() {
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User().whithEmail("abc_" + i + "@def.com").whithPassword("$Abcdef12345");

        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm(user);
        app.getHelperUser().submitRegistration();
        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }
    @Test
    public void registrationNegativeTestWrongEmail(){
        // open login form
        app.getHelperUser().openLoginRegistrationForm();
        int i = (int)(System.currentTimeMillis()/1000)%3600;
        User user = new User().whithEmail("abc_" + i + "def.com").whithPassword("$Abcdef12345");
        app.getHelperUser().fillLoginRegistrationForm(user);
        // click on button login
        app.getHelperUser().click(By.xpath("//button[2]"));
        // assert
        app.getHelperUser().pause(3000);
        Assert.assertTrue(app.getHelperUser().isAlertPresent());
    }

}
