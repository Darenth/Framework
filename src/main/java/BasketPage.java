import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage extends Page {

    public String checkItemInBasket(String item){
        System.out.println(driver.findElement(By.xpath("//a[contains(text(), '"+item+"')]")).getText());
        return  driver.findElement(By.xpath("//a[contains(text(), '"+item+"')]")).getText();

    }

    public BasketPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }



}
