import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class Service {
    public ChromeDriver driver;
    public WebDriverWait wait;
    public Service(WebDriver driver) {
        this.driver = (ChromeDriver) driver;
        wait = new WebDriverWait(driver, 10);
    }
    public void open(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Customer Service']")));
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_1']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[alt='Your Orders']")));
    }

    public void stringCustomer(){
        String title = driver.getTitle();
        System.out.println(title);
    }
}