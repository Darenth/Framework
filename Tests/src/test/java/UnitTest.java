import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {

    @Test
    public void canGoToHomePage(){
        Pages.homePage().goTo();
        Assert.assertTrue(Pages.homePage().isAt());
    }
    @Test
    public void canGoToJavaPathPage(){
        Pages.PathPages().goTo();
        Pages.PathPages().goToJavaPath();
        Assert.assertTrue(Pages.PathPages().isAt());

    }

    @AfterClass
    public static void cleanUp(){
       // Browser.close();

    }
}
