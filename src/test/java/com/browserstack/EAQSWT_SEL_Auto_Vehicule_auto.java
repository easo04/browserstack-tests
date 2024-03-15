package com.browserstack;
 
import com.browserstack.SeleniumTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.devtools.CdpEndpointFinder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
 
public class EAQSWT_SEL_Auto_Vehicule_auto extends SeleniumTest {
    @Test
    public void Soumission_simple() throws Exception {
        // navigate to bstackdemo
        driver.get("https://quote-and-buy-promutuel-gwcpdev-eaqswt.api.alpha3-butterfly.guidewire.net/quote-and-buy/auto/identification");
        //driver.manage().window().setSize(new Dimension(1616, 886));
        TimeUnit.SECONDS.sleep(4);
        //PAGE IDENTIFICATION
        driver.findElement(By.cssSelector(".jut__Flex__gwFlex span > span")).click();
        TimeUnit.SECONDS.sleep(4);
        //pb sur iphone la personnalisation des cookies n'est pas affichée (OK sur browserstack en manuel)
        driver.findElement(By.xpath("//div[2]/button[2]")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.id("gw-expand-more_3")).click();
        driver.findElement(By.xpath("//div[@id=\'react-select-2-option-1\']")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[2]/div[2]/input")).click();
        //vars.put("Prenom", js.executeScript("let result = \'\';const characters = \'ABCDEFGHIJKLMNOPQRSTUVWXYZ\';const charactersLength = characters.length;let counter = 0;while (counter < 6) {result += characters.charAt(Math.floor(Math.random() * charactersLength));counter += 1;}return result;"));
        //driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[2]/div[2]/input")).sendKeys(vars.get("Prenom").toString());
        //vars.put("vars.get("Prenom").toString()", driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[2]/div[2]/input")).getText());
        //System.out.println(vars.get("Prenom").toString());
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) 
                (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        System.out.println(generatedString);
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[2]/div[2]/input")).sendKeys(generatedString);
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[3]/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[3]/div[2]/input")).sendKeys("SELENIUM");
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[4]/div[2]/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[4]/div[2]/div/div/div/div/input")).sendKeys("1960-01-01");
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[5]/div/div[2]/div/div/input")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[5]/div/div[2]/div/div/input")).sendKeys("1717 G2L 1R1");
        TimeUnit.SECONDS.sleep(4);
        //String verifyadress = driver.findElement(By.cssSelector("li:nth-child(2) > .addressItem")).getText();
        //System.out.println(verifyadress);
        //TimeUnit.SECONDS.sleep(4);
        //WebElement button = driver.findElement(By.cssSelector("li:nth-child(2) > .addressItem"));
        //button.click();
        //button.click();
        driver.findElement(By.cssSelector("li:nth-child(2) > .addressItem")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) > .addressItem")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//div[@id=\'phoneNumberType-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'phoneNumberType-wrapper--menu-list\']/li[3]/div")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberInputContainer\']/div/div/input")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//div[@id=\'phoneNumberInputContainer\']/div/div/input")).sendKeys("514-710-2512");
        driver.findElement(By.name("emailAddress")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[8]/div[2]/input")).sendKeys(generatedString+"SELENIUM@gmail.com");
        TimeUnit.SECONDS.sleep(4);
        //A FAIRE Mettre un println pour faire apparaitre l'adresse mail
        //vars.put("email", "vars.get("Prenom").toString()SELENIUM@gmail.com");
        //System.out.println(vars.get("email").toString());
        driver.findElement(By.xpath("//div[@id=\'react-select-4-placeholder\']")).click();
        driver.findElement(By.xpath("//div[@id=\'react-select-4-placeholder\']")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.xpath("//div[@id=\'react-select-4-option-1\']/div")).click();
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();
        
        //POP-UP
        {
            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#asyncOkButton > span > span")));
        }
        driver.findElement(By.cssSelector("#asyncOkButton > span > span")).click();

        //PAGE CONDUCTEUR
        driver.findElement(By.xpath("//div[@id=\'driversLicenseTooltip0\']/div[3]/span")).click();
        driver.findElement(By.xpath("//div[@id=\'driversLicenseAgeObtained0-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'driversLicenseAgeObtained0-wrapper--menu-list\']/li[6]/div")).click();
        driver.findElement(By.xpath("//div[@id=\'continuousInsuranceContainer0\']/div/div[2]/div/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id=\'continuousInsuranceContainer0\']/div/div[2]/div/div/div/div/div/div/input")).sendKeys("2000-01-01");
        driver.findElement(By.cssSelector(".react-datepicker__day--selected > .jut__GenericDatePicker__dayContent")).click();
        driver.findElement(By.xpath("//div[@id=\'driverMaritalStatusTooltip0-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'driverMaritalStatusTooltip0-wrapper--menu-list\']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id=\'driverPrimaryOccupationTooltip0-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'driverPrimaryOccupationTooltip0-wrapper--menu-list\']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id=\'driverCurrentEmployerTooltip0-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'driverCurrentEmployerTooltip0-wrapper--menu-list\']/li[2]/div")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(90));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\'vehicleYear-wrapper\']/div/div/div")));

        //PAGE VÉHICULE
        driver.findElement(By.xpath("//div[@id=\'vehicleYear-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'vehicleYear-wrapper--menu-list\']/li[3]/div")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.xpath("//div[@id=\'vehicleMake-wrapper\']/div/div/div[2]")).click();
        driver.findElement(By.xpath("//ul[@id=\'vehicleMake-wrapper--menu-list\']/li[2]/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//div[@id=\'vehicleModel-wrapper\']/div/div/div[2]")).click();
        driver.findElement(By.xpath("//ul[@id=\'vehicleModel-wrapper--menu-list\']/li/div")).click();
        TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[@id=\'vehicleMake-wrapper\']/div/div/div[2]")).click();
        //TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/input")).sendKeys("ALFA ROMEO");
        //TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div[2]")).click();
        //TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[2]/div[2]/div/div/div/div/input")).sendKeys(Keys.ENTER);
        //TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[3]/div/div[2]/div/div/div/div[2]/input")).click();
        driver.findElement(By.xpath("//div[@id=\'promutuelVehicleConditionAtAcquisition-wrapper\']/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//ul[@id=\'promutuelVehicleConditionAtAcquisition-wrapper--menu-list\']/li[2]/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//div[@id=\'promutuelVehicleYearOfAcquisition-wrapper\']/div/div/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//ul[@id=\'promutuelVehicleYearOfAcquisition-wrapper--menu-list\']/li[3]/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//div[@id=\'promutuelVehicleMonthOfAcquisition-wrapper\']/div/div/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//ul[@id=\'promutuelVehicleMonthOfAcquisition-wrapper--menu-list\']/li[2]/div")).click();
        TimeUnit.SECONDS.sleep(1);
        driver.findElement(By.xpath("//div[@id=\'vehicleInfoLookupContainer\']/div/div[7]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@id=\'vehicleInfoLookupContainer\']/div/div[7]/div[2]/div/input")).sendKeys("1000");
        driver.findElement(By.xpath("//div[@id=\'vehicleInfoLookupContainer\']/div/div[8]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@id=\'vehicleInfoLookupContainer\']/div/div[8]/div[2]/div/input")).sendKeys("10");
        driver.findElement(By.id("gw-wizard-Next")).click();

        WebDriverWait waitpagerabais = new WebDriverWait(driver,Duration.ofSeconds(90));
        waitpagerabais.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\'upcomingPolicyRadioButton\']/div[2]/span")));

        //PAGE RABAIS
        driver.findElement(By.xpath("//div[@id=\'upcomingPolicyRadioButton\']/div[2]/span")).click();
        driver.findElement(By.xpath("//div[@id=\'psfconsentRadioButton\']/div[2]/span")).click();
        driver.findElement(By.id("gw-wizard-Next")).click();

        //PAGE OFFRE
        WebDriverWait waitpageoffre = new WebDriverWait(driver,Duration.ofSeconds(30));
        waitpageoffre.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#premiumCardSubmissionNumber > button")));
        
    }
}