package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertHandle {
    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("E:\\SimpleAlert.html");

        driver.findElement(By.xpath("//*[text()='click on me']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
}
