import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PathPages {

    WebDriverWait webDriverWait = new WebDriverWait(Browser.driver,10);
    static String url = "https://www.pluralsight.com/product/paths";
    static String title = "Install and Manage Google Cloud's Apigee API Platform | Pluralsight";

    public void goTo(){
        Browser.goTo(url);
    }
    public void goToGoogleCloudPath(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/a[1]"))).click();
        WebElement element = Browser.driver.findElement(By.xpath("//*[@id=\"pathContent\"]/div[1]/a/div"));
        Actions actions = new Actions(Browser.driver);
        actions.moveToElement(element).click().perform();

    }
    public boolean isAt(){
        return Browser.title().equals(title);
    }
}
