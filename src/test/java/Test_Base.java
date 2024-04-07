import org.example.PaymentPopUpFrame;
import org.example.Select_Route;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Test_Base {
    WebDriver driver ;
    PaymentPopUpFrame payment;
    Select_Route select;
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
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
