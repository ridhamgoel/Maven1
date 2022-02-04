import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class textverify {
    public WebDriver driver;
    @BeforeTest
    public void beforetest(){
        System.out.println("Executed before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("Executed after test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Executed before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Executed after Suite");

    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("Executed before demo_textVarifyclass");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("Executed after demo_textVarifyclass");
    }
    @Parameters({"browser","URL"})
    @BeforeMethod
    public void setup(String br,String AppUrl){
        if(br.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        else if(br.equalsIgnoreCase("edge")){
            WebDriverManager.edgedriver().setup();
            WebDriver driver= new EdgeDriver();
        }
        driver.get(AppUrl);
        System.out.println("Setup Completed");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
        System.out.println("Setup closed");
    }
    @DataProvider
    public Object[][] getuserdata() {
        return new Object[][]{
                {"Your Store"}, {"Your Store"}
        };
    }
    @Test(dataProvider = "getuserdata")//dependsOnMethods = {"login"}, priority = 1)
    public void demo_1(String expval){
       // System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
      //  WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
         // driver.get("https://demo.opencart.com/");
        String val = driver.findElement(By.xpath("//a[normalize-space()='Your Store']")).getText();
        Assert.assertEquals(val,expval);
       // Assert.assertNotEquals(val,expval);
        System.out.println("Test Case Passed");

    }
    @Test(priority = 2 )
    public void login(){
//        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
        //System.out.println(System.getProperty("user.dir"));
        driver.findElement(By.xpath("//span[@class='caret']")).click();
        driver.findElement(By.linkText("Login")).click();
        Assert.assertTrue( driver.findElement(By.linkText("Login")).isDisplayed());
        System.out.println("Login Test Case Passed");
        driver.quit();
    }
}























































