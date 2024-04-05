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
public class SelectTrip {
    WebDriver driver ;
    PaymentPopUpFrame payment;
    Select_Route   select;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {

        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));

        driver.navigate().to("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        https://ksrtc.in/oprs-web/avail/services.do

        Thread.sleep(3000);
        select = new Select_Route(driver);
        payment = new PaymentPopUpFrame(driver);
    }
    @Test
    public void  Select_Trip(){
        select.selectRout(driver).click();
        select.selectDate(driver).click();
        select.goToBus(driver).click();
        select.selectBus(driver).click();
        select.selectSeat(driver).click();
        select.customerDetalails(driver).click();
        select.mobileNum(driver).sendKeys("6789125987");
        select.email(driver).sendKeys("noon@gmail.com");
        select.name(driver).sendKeys("Nourhan");
        select.age(driver).sendKeys("20");
        Select conCession = new Select(select.conCession(driver));
        conCession.selectByValue("1466060086837");
        select.terms(driver).click();
        select.makePayment(driver).click();
        driver.switchTo().frame(payment.getIframe());
        payment.clickPaymentMethodBtn();
        payment.setCardNoTxtFld("378282246310005");
        payment.setCardExpiryTxtFld("03/26");
        payment.setCardCvvTxtFld("123");
    }
@AfterTest
public void CloseDriver() throws InterruptedException {
    Thread.sleep(3000);
    driver.quit();
}
}
