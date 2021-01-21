import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Page {



    By acceptCookiesButton =By.xpath("//button[text()='Ok, zgadzam się']");
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



    public ListingPage typeIntoSearchingBar(String textForSearching) {
        driver.findElement(searchingBar).sendKeys(textForSearching + Keys.ENTER);
        return new ListingPage(driver,wait);
    }

}
