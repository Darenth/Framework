import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UnitTest {

    WebDriver driver;
    WebDriverWait wait;
    String item = "iPhone 12 Pro 256GB PACYFIC POLSKA DYSTRYBUCJA 5G";


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @Test
    public void checkGoodInBasket() {
        HomePage homePage = new HomePage(driver, wait);
        OfferPage offerPage;
        homePage.goTo();
        homePage.acceptCookies();
        ListingPage listingPage = homePage.typeIntoSearchingBar(item);
        listingPage.selectElementByIndex(1);
        offerPage = new OfferPage(driver, wait);
        offerPage.clickOnAddCardButtonAndWait();
        offerPage.putGoodInBasket();
        BasketPage basketPage = new BasketPage(driver, wait);

        Assert.assertEquals(basketPage.checkItemInBasket(item), item);
    }

    @After
    public void cleanUp() {
        driver.quit();
    }
}



