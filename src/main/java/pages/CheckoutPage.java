package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By addedPhone = By.linkText("iphone X");
    private By price = By.xpath("//td/strong");
    private By checkout = By.xpath("//tr/td/button[@class='btn btn-success']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getAddedPhone() {
        return driver.findElement(addedPhone).getText();
    }

    public String getPrice() {
        return driver.findElement(price).getText();
    }

    public SubmitPage submitCheckout() {
        driver.findElement(checkout).click();
        return new SubmitPage(driver);
    }
}
