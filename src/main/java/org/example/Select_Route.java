package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Select_Route //extends BasePage
{
    public Select_Route(WebDriver driver) {
       super();}
    public WebElement selectRout(WebDriver driver){
        return driver.findElement(By.xpath("//a[normalize-space()='Chikkamagaluru - Bengaluru']"));
    }
    public WebElement selectDate(WebDriver driver){
        return driver.findElement(By.xpath("//a[normalize-space()='29']"));
    }
    public WebElement goToBus(WebDriver driver){
        return driver.findElement(By.xpath("(//button[normalize-space()='Search for Bus'])[1]"));
    }
    public WebElement selectBus(WebDriver driver){
        return driver.findElement(By.xpath("(//input[@id='SrvcSelectBtnForward0'])[2]"));
    }
    public WebElement selectSeat(WebDriver driver){
        return driver.findElement(By.xpath("//div[contains(@id, \"seatlayout-Forward1\")]//li[contains(@class, \"availSeatClass\")][1]"));
    }
    public WebElement customerDetalails(WebDriver driver){
        return driver.findElement(By.linkText("Customer Details"));
    }
    public WebElement mobileNum(WebDriver driver){
        return driver.findElement(By.id("mobileNo"));
    }

    public WebElement email(WebDriver driver){
        return driver.findElement(By.name("email"));
    }
    public WebElement name(WebDriver driver){
        return driver.findElement(By.id("passengerNameForward0"));
    }
    public WebElement gender(WebDriver driver){
        return driver.findElement(By.name("genderCodeId"));
    }
    public WebElement age(WebDriver driver){
        return driver.findElement(By.name("passengerAge"));
    }
    public WebElement conCession(WebDriver driver){
        return driver.findElement(By.xpath("(//select[@id='concessionIdsForward0'])[1]"));

    }

    public WebElement terms(WebDriver driver){
        return driver.findElement(By.xpath("//input[@id='termsChk']"));
    }
    public WebElement makePayment(WebDriver driver){
        return driver.findElement(By.id("PgBtn"));
    }
}
