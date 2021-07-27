
import C.CustomerService;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Amazon extends WebSettings{

    @Test
    public void Test1(){
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
    }

    @Test
    public void Test2(){
        Service customerService= PageFactory.initElements(driver, Service.class);

        customerService.open();
        customerService.stringCustomer();
        driver.navigate().back();
        String titlepage = driver.getTitle();
        System.out.println(titlepage);
    }

}
