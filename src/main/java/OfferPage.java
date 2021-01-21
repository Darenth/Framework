import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OfferPage extends  Page{

    public OfferPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }


    public void putGoodInBasket() {
        driver.findElement(By.xpath("//a[@class='_13q9y _8tsq7 munh_56_s']")).click();//

    }
}
