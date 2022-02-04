package test.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicWebTable {
    public static void main(String args[]) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.get("E:\\WbTable.html");
        driver.manage().window().maximize();
        List<WebElement> lst = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
        List<WebElement> lst1 = driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/th"));
        int rcount = lst.size();
        int ccount = lst1.size();
        System.out.println(rcount);
        System.out.println(ccount);

        for (int i = 3; i <= rcount; i++) {
            for (int j = 1; j <= ccount; j++) {
                System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[" + i + "]/td[" + i + "]")).getText());
            }
        }
        }

}
