package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RegisterTest extends BaseTest {
    String  baseUrl ="https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //User find Register Link and click on Register link and Verify the Register Text
    public void userShouldNavigateToRegisterPageSuccessfully() {
        WebElement RegisterLinkText = driver.findElement(By.linkText("Register"));
        RegisterLinkText.click();
        String expectedMessage = "Register";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //find and click Register link and displayed register page
        WebElement RegisterLinkText = driver.findElement(By.linkText("Register"));
        RegisterLinkText.click();
        //find radiobutton and click on Female radio button
        WebElement radioButtom = driver.findElement(By.className("gender"));
        radioButtom.click();
        //find FirstName text and enter name
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Sandip");
        //find LastName text and enter Lastname
        WebElement lastName = driver.findElement(By.xpath("// input[@name='LastName']"));
        lastName.sendKeys("Maniya");
        //find Day/Month/Year and select Day,Month,Year
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("11");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("October");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1992");
        //find Email address and enter email
        WebElement emailAddress = driver.findElement(By.xpath("//input[@type='email']"));
        emailAddress.sendKeys("sandipmaniya04@gmail.com");
        //find password element and enter valid password
        WebElement passwordLinkText = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordLinkText.sendKeys("same123");
        //find confirm password element and enter confirm password
        WebElement confirmPassWord = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
        confirmPassWord.sendKeys("same123");
        //find RegisterButton and click on Register
        WebElement registerLinkText = driver.findElement(By.id("register-button"));
        registerLinkText.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String expectedMessage = "Your registration completed";
        String actualMessage = driver.findElement(By.className("result")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    //close the browser
    public void tearDown() {
        closeBrowser();
}

}
