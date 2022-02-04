package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethods {
    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.opencart.com/index.php?route=account/login");
        driver.findElement(By.name("email")).sendKeys("xyz");
        driver.findElement(By.name("password")).sendKeys("zyz");
        Thread.sleep(3000);
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("password")).clear();
    }
}
