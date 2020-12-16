import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListingPage extends Page {


    public ListingPage(WebDriver driver, WebDriverWait wait) {
        super(driver,wait);
    }

    public void selectElementByIndex(int i) {
        System.out.println("int i ="+i);
        driver.findElement(By.xpath("(//div[@class='m7er_k4 _9c44d_3TzmE'])["+i+"]")).click();
    }







}
