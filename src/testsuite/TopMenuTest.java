package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //User Click on the Computers Tab and Verify the text 'Computers'
    public void userShouldNavigateToComputerPageSuccessfully() {
        WebElement computerLinkText = driver.findElement(By.linkText("Computers"));
        computerLinkText.click();
        String expectedMessage = "Computers";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    //User click on the Electronics Tab and verify the text 'Electronics'
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        WebElement electronicsLinkText = driver.findElement(By.linkText("Electronics"));
        electronicsLinkText.click();
        String expectedMessage = "Electronics";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @Test
    //User click on the Apparel Tab and verify the text ‘Apparel’
    public void userShouldNavigateToApparelPageSuccessfully() {
        WebElement apparelLinkText = driver.findElement(By.linkText("Apparel"));
        apparelLinkText.click();
        String expectedMessage = "Apparel";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    //User click on the Digital downloads Tab and verify the text ‘Digital downloads'

    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        WebElement digitalDownloadsLinkText = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsLinkText.click();
        String expectedMessage = "Digital downloads";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    //User click on the ‘Books’ Tab and verify the text ‘Books’
    public void userShouldNavigateToBooksPageSuccessfully() {
        WebElement booksLinkText = driver.findElement(By.linkText("Books"));
        booksLinkText.click();
        String expectedMessage = "Books";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
    @Test
    //User click on the ‘Jewelry’ Tab and verify the text ‘Jewelry’
    public void userShouldNavigateToJewelryPageSuccessfully() {
        WebElement jewelryLinkText = driver.findElement(By.linkText("Jewelry"));
        jewelryLinkText.click();
        String expectedMessage = "Jewelry";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    //User click on the ‘Gift Cards’ Tab and verify the text ‘Gift Cards’
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        WebElement giftCardsLinkText = driver.findElement(By.linkText("Gift Cards"));
        giftCardsLinkText.click();
        String expectedMessage = "Gift Cards";
        String actualMessage = driver.findElement(By.tagName("h1")).getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @After
    //close the browser
    public void tearDown() {
        closeBrowser();
    }



}
