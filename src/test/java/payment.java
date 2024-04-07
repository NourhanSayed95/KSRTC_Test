import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class payment extends Test_Base{
    @Test(priority = 1)
    public void  Select_Trip(){
        select.selectRout(driver).click();
        select.selectDate(driver).click();
        select.goToBus(driver).click();
    }


    @Test(priority = 2)
    public void Bus_and_seat (){
        select.selectBus(driver).click();
        select.selectSeat(driver).click();
    }
    @Test(priority = 3)
    public void cust_passenger(){
        select.customerDetalails(driver).click();
        select.mobileNum(driver).sendKeys("6789125987");
        select.email(driver).sendKeys("noon@gmail.com");
        select.name(driver).sendKeys("Nourhan");
        Select Gender = new Select(select.gender(driver));
        Gender.selectByValue("25");
        select.age(driver).sendKeys("20");
        Select conCession = new Select(select.conCession(driver));
        conCession.selectByValue("1466060086837");
        select.terms(driver).click();
    }
    @Test(priority = 4)
public void make_payment(){
        select.makePayment(driver).click();
        driver.switchTo().frame(payment.getIframe());
        payment.clickPaymentMethodBtn();
        payment.setCardNoTxtFld("378282246310005");
        payment.setCardExpiryTxtFld("03/26");
        payment.setCardCvvTxtFld("123");
    }
}
