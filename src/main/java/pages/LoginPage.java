package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private WebDriver driver;

    private By userName = By.id("username");
    private By password = By.id("password");
    private By user = By.xpath("//label[@class='customradio'][1]/span[@class='checkmark']");
    private By signIn = By.id("signInBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String name) {
        driver.findElement(userName).sendKeys(name);
    }

    public void enterPassword(String epassword) {
        driver.findElement(password).sendKeys(epassword);
    }

    public void selectType() {
        driver.findElement(user).click();
    }

    public HomePage clickSign() {
        driver.findElement(signIn).click();
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.invisibilityOfAllElements());
        return new HomePage(driver);
    }
}
