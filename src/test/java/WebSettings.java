import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebSettings  {
    public ChromeDriver driver;
    public WebDriverWait wait;

    public WebSettings() {
    }

    @Before

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);

    }
    @After
    public void close() {
        driver.quit();
    }
}
