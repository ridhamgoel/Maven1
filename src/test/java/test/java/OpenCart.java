package test.java;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OpenCart {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        boolean a=driver.findElement(By.linkText("MacBook")).isDisplayed();
        Assert.assertTrue(a);
        System.out.println("True");
        boolean b=driver.findElement(By.linkText("iPhone")).isDisplayed();
        Assert.assertTrue(b);
        System.out.println("True");
        boolean c=driver.findElement(By.linkText("Apple Cinema 30")).isDisplayed();
        Assert.assertTrue(c);
        System.out.println("True");
        boolean d=driver.findElement(By.linkText("Canon EOS 5D")).isDisplayed();
        Assert.assertTrue(d);
        System.out.println("True");
        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Show All Desktops")).click();


        boolean e = driver.findElement(By.linkText("Sony VAIO")).isDisplayed();
        Assert.assertTrue(e);
        System.out.println("true");


        boolean g = driver.findElement(By.linkText("Canon EOS 5D")).isDisplayed();
        Assert.assertTrue(g);
        System.out.println("true");

        boolean h = driver.findElement(By.linkText("HP LP3065")).isDisplayed();
        Assert.assertTrue(h);
        System.out.println("true");


    }
}