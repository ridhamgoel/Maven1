package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExcTest {
    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.opencart.com/index.php?route=account/login");
        WebElement username = driver.findElement(By.name("email"));
        username.sendKeys("Ridham");
        driver.navigate().refresh();
        Thread.sleep(5000);
        username.sendKeys("Anish");
    }
}
