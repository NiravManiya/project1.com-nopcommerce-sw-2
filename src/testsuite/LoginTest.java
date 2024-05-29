package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement =  driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals("Not redirected to login page", expectedText,actualText);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //find login link and click on login link
        WebElement loginLink =  driver.findElement(By.linkText("Log in"));
        loginLink.click();
        //find and fill the email field
        WebElement userName = driver.findElement(By.className("email"));
        userName.sendKeys("sandipmaniya04@gmail.com");
        //find and fill the password filed
        WebElement passWord = driver.findElement(By.id("Password"));
        passWord.sendKeys("sam123");
        //click on login button
        WebElement loginbutton =  driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
        loginbutton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String expectedMessage = "Log out";
        String actualMessage = driver.findElement(By.linkText("Log out")).getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Test
    public void verifyTheErrorMessage(){
        //Find the login link and click on login link element
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();
        //Find the Email Element and type the Email address to email field.
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("sandipmaniya4@gmail.com");
        //Find the password field and type the password into password field
        driver.findElement(By.name("Password")).sendKeys("sam123");
        //Find Login btn Element and click
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class = 'message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not displayed",expectedErrorMessage,actualErrorMessage);
    }

    @After
    //close the browser
    public void tearDown() {
        closeBrowser();
}

}
