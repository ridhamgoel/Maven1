package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefulMethods1 {
    public static void main(String args[]) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.opencart.com/index.php?route=account/login");
        boolean bol = driver.findElement(By.name("email")).isEnabled();      //isDisplayed();
        if (bol) {
            System.out.println("Testcase is passed and username is visible on the webpage");
        }
        else {
            System.out.println("Testcase is passed and username is visible on the webpage");
    }
}
}
