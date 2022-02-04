import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo {
    public WebDriver driver;
    @Test
    public void firsttestcase()
    {
        System.out.println("This is the first TestNg_Maven Testcase");
    }
    @Test
    public void secondtestcase(){
        System.out.println("This is the second TestNg_Maven Testcase");
    }
    @Test()
    public void textverify() {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/");

//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val, "Your Store");
        System.out.println("textVerify Test Case Passed");
        driver.quit();

    }
}
