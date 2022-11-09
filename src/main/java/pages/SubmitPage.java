package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubmitPage {
    private WebDriver driver;
    private By country = By.id("country");
    private By agree = By.xpath("//*[@id='checkbox2']");
    private By validation = By.className("lds-ellipsis");
    private By submit = By.cssSelector("form>input");
    private By message = By.xpath("//div/strong");

    public SubmitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setCountry(String country1) {
        driver.findElement(country).sendKeys(country1);
    }

    public void clickPurchase() {
        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(validation)));
        driver.findElement(submit).click();
    }

    public String submitMessage() {
        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(message)));
        return driver.findElement(message).getText();
    }
}
