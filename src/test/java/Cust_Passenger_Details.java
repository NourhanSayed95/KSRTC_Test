import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Cust_Passenger_Details extends Test_Base{
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
}
