import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.ArrayList;

public class Login {
    public static void main(String[] args) throws IOException {
        File f= new File("./LoginFile.txt");
        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        fw.write("ridham@outlook.com");
        fw.write("\n");
        fw.write("123456");
        fw.close();

        FileReader re= new FileReader("./LoginFile.txt");
        BufferedReader br= new BufferedReader(re);

//        ArrayList arr= new ArrayList();
//        arr.add(br.readLine());
//        arr.add(br.readLine());
//        System.out.println(arr);

        String str,str1;
        str = br.readLine();
        str1 = br.readLine();
        System.out.println(str);
        br.close();

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
        driver.findElement(By.id("input-email")).sendKeys(str);
        driver.findElement(By.id("input-password")).sendKeys(str1);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

    }

}