package tests;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

//    WebDriver wd;
//
//    @BeforeMethod
//    public void init(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }

    @Test
    public void loginPositiveTest(){


        User user= new User().whithEmail("abc@def.com").whithPassword("$Abcdef12345");



        app.getHelperUser().openLoginRegistrationForm();
        app.getHelperUser().fillLoginRegistrationForm(user);
        app.getHelperUser().submitLogin();
        // assert
        app.getHelperUser().pause(3000);

        Assert.assertTrue(app.getHelperUser().isElementPresent(By.tagName("button")));
    }

        @Test
    public void loginNegativeTestWrongEmail(){
            User user= new User().whithEmail("abcdef.com").whithPassword("$Abcdef12345");
            app.getHelperUser().openLoginRegistrationForm();
            app.getHelperUser().fillLoginRegistrationForm(user);
            app.getHelperUser().submitLogin();
            Assert.assertTrue(app.getHelperUser().isAlertPresent());
        }
//    @Test
//    public void loginNegativeTestWrongEmail(){
//        // open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//        // fill login form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("abcdef.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("$Abcdef12345");
//
//        // click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
//        // assert
//        pause(3000);
//        Assert.assertTrue(isAlertPresent());
//    }
//    @Test
//    public void loginNegativeTestWrongPassword(){
//        // open login form
//        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
//        // fill login form
//        WebElement emailInput = wd.findElement(By.xpath("//input[1]"));
//        emailInput.click();
//        emailInput.clear();
//        emailInput.sendKeys("abc@def.com");
//
//        WebElement passInput = wd.findElement(By.xpath("//input[2]"));
//        passInput.click();
//        passInput.clear();
//        passInput.sendKeys("Abcdef12345");
//
//        // click on button login
//        wd.findElement(By.xpath("//button[1]")).click();
//        // assert
//        pause(3000);
//
//    }


//
//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public boolean isAlertPresent(){
//        Alert alert = new WebDriverWait(wd, 5)
//                .until(ExpectedConditions.alertIsPresent());
//        if(alert == null) return false;
//        wd.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();
//        return true;
//    }
//

}
