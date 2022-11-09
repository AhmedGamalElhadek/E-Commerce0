package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class HomePage {
    private WebDriver driver;
    private By addIphone = By.xpath("//app-card[1]/div/div[2]/button");
    private By checkout = By.xpath("//*[@id='navbarResponsive']/ul/li/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(addIphone).click();
    }

    public CheckoutPage clickCheckout() {
        driver.findElement(checkout).click();
        return new CheckoutPage(driver);
    }
}
