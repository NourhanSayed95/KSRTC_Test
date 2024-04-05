package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PaymentPopUpFrame extends BasePage {
    public PaymentPopUpFrame(WebDriver driver) {
        super(driver);
    }
    public static By iframe = By.xpath("//iframe[@class=\"razorpay-checkout-frame\"]");
    public WebElement getIframe() {
        return driver.findElement(iframe) ;
    }

    public By paymentMethodBtn = By.xpath("//button[@method=\"card\"]");
    public void clickPaymentMethodBtn() {
        clickElement(paymentMethodBtn);
    }



    public By cardNoTxtFld = By.id("card_number");
    public void setCardNoTxtFld(String cardNo) {
        sendKeysToElement(cardNoTxtFld, cardNo);
    }



    public By cardExpiryTxtFld = By.id("card_expiry");
    public void setCardExpiryTxtFld(String cardExpiry) {
        sendKeysToElement(cardExpiryTxtFld, cardExpiry);
    }

    public By cardCvvTxtFld = By.id("card_cvv");
    public void setCardCvvTxtFld(String cardCvv) {
        sendKeysToElement(cardCvvTxtFld, cardCvv);
    }
    protected WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
    protected void clickElement(By locator) {
        WebElement element = findElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void sendKeysToElement(By locator, String text) {
        WebElement element = findElement(locator);
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }
    protected WebDriverWait wait;


}
