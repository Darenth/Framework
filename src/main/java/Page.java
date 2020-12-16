import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
    WebDriver driver;
    WebDriverWait wait ;
    String url;

    public Page(WebDriver driver,WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void click(String text){
        driver.findElement(By.xpath(text)).click();
    }

    public Page goTo( ) {
        driver.get(url);
        return this;
    }
}
