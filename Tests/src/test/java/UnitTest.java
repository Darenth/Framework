import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Browser.maximize();
        Pages.homePage().acceptCookies();
        Assert.assertTrue(Pages.homePage().isAt());
    }
    @Test
    public void possibilityOfSearching(){
        String object = "iPhone 12 Pro 256GB PACYFIC POLSKA DYSTRYBUCJA 5G";
        Pages.homePage().searchingField(object);
        Pages.ListingPage().click(object);

    }

    @AfterClass
    public static void cleanUp(){
        //Browser.close();

    }
}
