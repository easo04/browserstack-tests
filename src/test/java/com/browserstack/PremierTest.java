package com.browserstack;
 
import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.devtools.CdpEndpointFinder;
 
public class PremierTest extends SeleniumTest {
    @Test
    public void addProductToCart() throws Exception {
        // navigate to bstackdemo
        driver.get("https://quote-and-buy-promutuel-gwcpdev-eaqswt.api.alpha3-butterfly.guidewire.net");
 
System.out.println("Title: " + driver.getTitle());
        // Check the title
        Assert.assertTrue(driver.getTitle().matches("CustomerEngage Quote and Buy - CustomerEngage Quote and Buy"));
 
    }
}