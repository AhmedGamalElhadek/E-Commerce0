package order;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class OrderTest extends BaseTest {
    @Test
    public void testPlacingOrder(){
        loginPage.enterUsername("rahulshettyacademy");
        loginPage.enterPassword("learning");
        loginPage.selectType();

        var homePage = loginPage.clickSign();
        homePage.addToCart();

        var checkoutPage=homePage.clickCheckout();
        assertEquals(checkoutPage.getAddedPhone(),"iphone X","Wrong Device");
        assertEquals(checkoutPage.getPrice(),"₹. 100000","Wrong Price");

        var submitPage =checkoutPage.submitCheckout();
        submitPage.setCountry("Egypt");
        submitPage.clickPurchase();
        assertEquals(submitPage.submitMessage(),"Success!","invalid purchase");
    }
}
