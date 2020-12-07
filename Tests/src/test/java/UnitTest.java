import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnitTest {
    WebDriver driver;
    WebDriverWait wait;
    String item= "iPhone 12 Pro 256GB PACYFIC POLSKA DYSTRYBUCJA 5G";


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.manage().window().maximize();
        //driver.manage().window().setPosition();
    }

    @Test
    public void checkGoodInBasket() {
        HomePage homePage = new HomePage(driver,wait);
        homePage.goTo();
        homePage.acceptCookies();
        homePage.typeIntoSearchingBar(item);

        //HealthPage healthPage=homePage.selectHealthCategoty();
//        healthPage.selectMedicine();
//        healthPage.putToBasket();


//        buyMedicine(homePage);
        //ListingPage listingPage = new ListingPage(driver);

    }

//    @Test
//    public void possibilityOfSearching() {
//        String object = "iPhone 12 Pro 256GB PACYFIC POLSKA DYSTRYBUCJA 5G";
//        homePage.searchingField(object);
//        ListingPage().click(object);

//    }

    @After
    public void cleanUp() {
        //driver.quit();
    }

    public void buyMedicine(HomePage homePage){

    }
}



