package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsUsingAction {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.get("https://sellglobal.ebay.in/seller-center/");
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.linkText("Getting Started"))).build().perform();

    }
}