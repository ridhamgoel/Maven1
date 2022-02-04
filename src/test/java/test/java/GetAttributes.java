package test.java;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/index.php?route=common/home");
        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
        driver.findElement(By.id("input-email")).sendKeys("Ridham");

        //getattributes
        String ActualValue= driver.findElement(By.xpath("//input[@value='Login']")).getAttribute("value");
        System.out.println(ActualValue);

        //get css

        String color=driver.findElement(By.xpath("//input[@value='Login']")).getCssValue("color");
        System.out.println(color);
        //submit
        driver.findElement(By.xpath("//input[@value='Login']")).submit();
    }
}
