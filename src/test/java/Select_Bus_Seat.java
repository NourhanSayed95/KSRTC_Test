import org.testng.annotations.Test;

public class Select_Bus_Seat extends Test_Base{
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
}
