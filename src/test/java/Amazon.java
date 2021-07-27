
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Amazon extends WebSettings{

    @Test
    public void Test1(){
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
    }

    @Test
    public void Test2(){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[text()='Customer Service']")));
        driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_1']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[alt='Your Orders']")));
        String title = driver.getTitle();
        System.out.println(title);
        driver.navigate().back();
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
    }

}
