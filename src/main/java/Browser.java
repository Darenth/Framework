import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    static WebDriver driver = new ChromeDriver();
    static WebDriverWait webDriverWait = new WebDriverWait(Browser.driver, 10);

    public static void goTo(String url) {
        driver.get(url);
    }

    public static void maximize() {
        Browser.driver.manage().window().maximize();
        System.out.println("Window is maximaze");
    }

    public static String title() {
        return driver.getTitle();
    }

    public static void close() {
        driver.close();
    }
}
