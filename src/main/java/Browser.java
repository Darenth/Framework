import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

     WebDriver driver = new ChromeDriver();
     WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

    public void goTo(String url) {
        driver.get(url);
    }

    public void maximize() {
        driver.manage().window().maximize();
        System.out.println("Window is maximaze");
    }

    public  String title() {
        return driver.getTitle();
    }

    public  void close() {
        driver.close();
    }
}
