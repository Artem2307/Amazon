
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends WebSettings{

    @Test
    public void Test1(){
        driver.get("https://www.amazon.com/");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }

    @Test
    public void Test2(){
        driver.get("https://www.amazon.com/");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice_2bf4fe8c5ec54e6bae2d1c24043f012b\"]")));
        driver.findElement(By.xpath("//a[@href=\"/gp/help/customer/display.html?nodeId=508510&ref_=nav_cs_customerservice_2bf4fe8c5ec54e6bae2d1c24043f012b\"]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class=\"a-column a-span3\"]//img[@alt=\"Your Orders\"]")));
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().back();
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
    }

}
