import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {


    By acceptCookiesButton =By.cssSelector("div[class='_9f0v0 _jkrtd mpof_ki_s'] button[class='_13q9y _8hkto munh_56_m m7er_k4 m7er_56_m']");//TODO
    By healthCategory =By.cssSelector("div[data-box-name='departments'] div[data-group-id='departments_Zdrowie']");
    By searchingBar =By.cssSelector("div[data-box-name='allegro.metrumHeader.search'] input[type='search']");
    String url = "https://allegro.pl/";



    public HomePage(WebDriver driver,WebDriverWait wait) {
        super(driver,wait);
    }

    public Page goTo( ) {
        driver.get(url);
        return this;
    }

    public void acceptCookies(){
        wait.until(ExpectedConditions.presenceOfElementLocated(acceptCookiesButton)).click();
        System.out.println("The cookies are accepted");
    }


//    public HealthPage selectHealthCategoty() {
//        driver.findElement(healthCategory).click();
//        return new HealthPage(driver,wait);
//    }

    public ListingPage typeIntoSearchingBar(String textForSearching) {
        driver.findElement(searchingBar).sendKeys(textForSearching + Keys.ENTER);
        return new ListingPage(driver,wait);
    }

}
