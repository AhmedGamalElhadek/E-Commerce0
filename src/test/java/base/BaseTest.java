package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SubmitPage;

public class BaseTest {
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected CheckoutPage checkoutPage;
    protected SubmitPage submitPage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        checkoutPage = new CheckoutPage(driver);
        submitPage = new SubmitPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
