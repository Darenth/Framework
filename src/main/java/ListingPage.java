import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListingPage extends Page {
    WebDriver driver;

    public ListingPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }



    public void click(String text){
        driver.findElement(By.linkText(text)).click();
    }

}
