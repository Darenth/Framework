import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;


import java.util.logging.Logger;

public class HomePage {


    static String url = "https://allegro.pl/";
    static String title = "Allegro - atrakcyjne ceny";// is it good idea to check sucess of moving to this page throught title?

    public void goTo() {
        Browser.goTo(url);
    }



    public void acceptCookies() {
        Browser.webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[7]/div/div[2]/div/div[2]/button[2]"))).click();
        System.out.println("The cookies are accepted");

    }

    public void searchingField(String text) {

        Browser.driver.findElement(By.xpath("/html/body/div[3]/div[2]/header/div/div/div[1]/div/form/input")).sendKeys(text + Keys.ENTER);
    }

    public boolean isAt() {
        return Browser.title().equals(title);
    }

}
