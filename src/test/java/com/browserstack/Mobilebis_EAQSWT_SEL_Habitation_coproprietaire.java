package com.browserstack;
 
import com.browserstack.SeleniumTest;
import static org.testng.Assert.assertTrue;
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
 
public class Mobilebis_EAQSWT_SEL_Habitation_coproprietaire extends SeleniumTest {
    @Test
    public void Soumission_simple() throws Exception {
        // Soumission en ligne auto
        driver.get("https://quote-and-buy-promutuel-gwcpdev-eaqswt.api.alpha3-butterfly.guidewire.net/quote-and-buy/habitation/identification");
        {
        WebDriverWait waitconsentementprimaire = new WebDriverWait(driver,Duration.ofSeconds(90));
        waitconsentementprimaire.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".jut__Flex__gwFlex span > span")));
        }
        driver.findElement(By.cssSelector(".jut__Flex__gwFlex span > span")).click();
          
        TimeUnit.SECONDS.sleep(4);
       {
          WebDriverWait waitcookies = new WebDriverWait(driver,Duration.ofSeconds(90));
          waitcookies.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.cookiesjsr-btn.important.allowAll")));
        }
      
        if(driver.findElements(By.cssSelector("button.cookiesjsr-btn.important.allowAll")).size()>0) {
          driver.findElement(By.cssSelector("button.cookiesjsr-btn.important.allowAll")).click();
          driver.findElement(By.id("gw-expand-more_3")).click();
        driver.findElement(By.xpath("//div[@id=\'react-select-2-option-1\']")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[2]/div[2]/input")).click();
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
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[5]/div/div[2]/div/div/input")).sendKeys("1717 G2L 1R1");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(By.xpath("//li[2]/button")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberType-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'phoneNumberType-wrapper--menu-list\']/li[3]/div")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberInputContainer\']/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberInputContainer\']/div/div/input")).sendKeys("514-710-2512");
        driver.findElement(By.name("emailAddress")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[8]/div[2]/input")).sendKeys(generatedString+"SELENIUM@gmail.com");
        String adressemail = (generatedString+"SELENIUM@gmail.com");
        System.out.println(adressemail);
        TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[@id='policyEffectiveContainer']/div/div[10]/div/div/span")).click();
        driver.findElement(By.xpath("//button[@id='promutuelResidencePicker_iconResidenceType_coowner']/div/div/i")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();
        
        //POP-UP
        {
            WebDriverWait waitpopup = new WebDriverWait(driver,Duration.ofSeconds(90));
            waitpopup.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#asyncOkButton > span > span")));
        }
        driver.findElement(By.cssSelector("#asyncOkButton > span > span")).click();
        driver.findElement(By.xpath("//div[@id='homeownerPrimaryOccupationTooltip-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='homeownerPrimaryOccupationTooltip-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='homeownerCurrentEmployerTooltip-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='homeownerCurrentEmployerTooltip-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[2]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[2]/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[2]/div[2]/div/input")).sendKeys("2020");
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[3]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[3]/div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[3]/div[2]/div/div/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//div[@id='promutuelDwellingNumberOfCreditors']/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).sendKeys("2020-01-01");
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[6]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[6]/div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[6]/div[2]/div/div/div/input")).sendKeys("40000");
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[7]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[7]/div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[7]/div[2]/div/div/div/input")).sendKeys("350000");
        driver.findElement(By.xpath("//div[@id='promutuelDropdown-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//li[5]/div/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDropdown-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//li[3]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDwellingHeathingPercentage']/div[5]/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDwellingDistanceFireStationTooltip']/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDwellingDistanceFireHydrantTooltip']/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelPoolType-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='promutuelPoolType-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelHotTubType-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='promutuelHotTubType-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelOtherDetailsInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelOtherDetailsInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelOtherDetailsInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).sendKeys("2020-01-01");
        //driver.findElement(By.xpath("//div[@id='promutuelDwellingWaterTankManufactureDateTooltip_129_428682489']/div/div[2]/div/div/div[2]/div[2]/div/div[4]")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();

        {
        WebDriverWait waitpagerabais = new WebDriverWait(driver,Duration.ofSeconds(90));
        waitpagerabais.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='upcomingPolicyRadioButton']/div[2]/span")));
        }

        driver.findElement(By.xpath("//div[@id='upcomingPolicyRadioButton']/div[2]/span")).click();
        driver.findElement(By.xpath("//div[@id='psfconsentRadioButton']/div[2]/span")).click();
        driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/span/span")).click();
        driver.findElement(By.xpath("//div[@id='fireAlarmWithTooltip']/div/span")).click();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/span/span")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();

        {
          WebDriverWait waitpageoffre = new WebDriverWait(driver,Duration.ofSeconds(90));
          waitpageoffre.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='premiumCardCtaFinalizeNowButton']/span/span")));
        }

        driver.findElement(By.xpath("//button[@id='premiumCardCtaFinalizeNowButton']/span/span")).click();
        }
        else
        {
        driver.findElement(By.id("gw-expand-more_3")).click();
        driver.findElement(By.xpath("//div[@id=\'react-select-2-option-1\']")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[2]/div[2]/input")).click();
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
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[5]/div/div[2]/div/div/input")).sendKeys("1717 G2L 1R1");
        TimeUnit.SECONDS.sleep(4);
        driver.findElement(By.xpath("//li[2]/button")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberType-wrapper\']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id=\'phoneNumberType-wrapper--menu-list\']/li[3]/div")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberInputContainer\']/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id=\'phoneNumberInputContainer\']/div/div/input")).sendKeys("514-710-2512");
        driver.findElement(By.name("emailAddress")).click();
        driver.findElement(By.xpath("//div[@id=\'policyEffectiveContainer\']/div/div[8]/div[2]/input")).sendKeys(generatedString+"SELENIUM@gmail.com");
        String adressemail = (generatedString+"SELENIUM@gmail.com");
        System.out.println(adressemail);
        TimeUnit.SECONDS.sleep(1);
        //driver.findElement(By.xpath("//div[@id='policyEffectiveContainer']/div/div[10]/div/div/span")).click();
        driver.findElement(By.xpath("//button[@id='promutuelResidencePicker_iconResidenceType_coowner']/div/div/i")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();
        
        //POP-UP
        {
            WebDriverWait waitpopup = new WebDriverWait(driver,Duration.ofSeconds(90));
            waitpopup.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#asyncOkButton > span > span")));
        }
        driver.findElement(By.cssSelector("#asyncOkButton > span > span")).click();
        driver.findElement(By.xpath("//div[@id='homeownerPrimaryOccupationTooltip-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='homeownerPrimaryOccupationTooltip-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='homeownerCurrentEmployerTooltip-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='homeownerCurrentEmployerTooltip-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[2]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[2]/div[2]/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[2]/div[2]/div/input")).sendKeys("2020");
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[3]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[3]/div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[3]/div[2]/div/div/div/input")).sendKeys("1");
        driver.findElement(By.xpath("//div[@id='promutuelDwellingNumberOfCreditors']/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).sendKeys("2020-01-01");
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[6]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[6]/div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[6]/div[2]/div/div/div/input")).sendKeys("40000");
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[7]/div[2]/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[7]/div[2]/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelBuildingInfoCardWrapper']/div/div[7]/div[2]/div/div/div/input")).sendKeys("350000");
        driver.findElement(By.xpath("//div[@id='promutuelDropdown-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//li[5]/div/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDropdown-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//li[3]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDwellingHeathingPercentage']/div[5]/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDwellingDistanceFireStationTooltip']/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelDwellingDistanceFireHydrantTooltip']/div/span")).click();
        driver.findElement(By.xpath("//div[@id='promutuelPoolType-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='promutuelPoolType-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelHotTubType-wrapper']/div/div/div")).click();
        driver.findElement(By.xpath("//ul[@id='promutuelHotTubType-wrapper--menu-list']/li[2]/div")).click();
        driver.findElement(By.xpath("//div[@id='promutuelOtherDetailsInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).click();
        driver.findElement(By.xpath("//div[@id='promutuelOtherDetailsInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).clear();
        driver.findElement(By.xpath("//div[@id='promutuelOtherDetailsInfoCardWrapper']/div/div[5]/div[2]/div/div/div/div/div/div/input")).sendKeys("2020-01-01");
        //driver.findElement(By.xpath("//div[@id='promutuelDwellingWaterTankManufactureDateTooltip_129_428682489']/div/div[2]/div/div/div[2]/div[2]/div/div[4]")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();

        {
        WebDriverWait waitpagerabais = new WebDriverWait(driver,Duration.ofSeconds(90));
        waitpagerabais.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='upcomingPolicyRadioButton']/div[2]/span")));
        }

        driver.findElement(By.xpath("//div[@id='upcomingPolicyRadioButton']/div[2]/span")).click();
        driver.findElement(By.xpath("//div[@id='psfconsentRadioButton']/div[2]/span")).click();
        driver.findElement(By.xpath("//div[4]/div[2]/div/div/div/div/span/span")).click();
        driver.findElement(By.xpath("//div[@id='fireAlarmWithTooltip']/div/span")).click();
        driver.findElement(By.xpath("//div[6]/div/div/div/div/span/span")).click();
        driver.findElement(By.cssSelector("#gw-wizard-Next > span > span")).click();

        {
          WebDriverWait waitpageoffre = new WebDriverWait(driver,Duration.ofSeconds(90));
          waitpageoffre.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='premiumCardCtaFinalizeNowButton']/span/span")));
        }

        driver.findElement(By.xpath("//button[@id='premiumCardCtaFinalizeNowButton']/span/span")).click();
      }
    }
  }
