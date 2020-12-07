import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    WebDriver driver;
    WebDriverWait wait ;
    String url;
    String textForSearching;

    public Page(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }



    public Page goTo( ) {
        driver.get(url);
        return this;
    }
}
