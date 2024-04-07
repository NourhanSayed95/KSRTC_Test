import org.example.PaymentPopUpFrame;
import org.example.Select_Route;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SelectTrip extends Test_Base{

    @Test
    public void  Select_Trip(){
        select.selectRout(driver).click();
        select.selectDate(driver).click();
        select.goToBus(driver).click();

    }

}
