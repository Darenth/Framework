import org.openqa.selenium.By;

public class Listing {

    public void click(String text){
        Browser.driver.findElement(By.linkText(text)).click();
    }

}
