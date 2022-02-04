import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashMap;


public class Register {
    public static void main(String args[]) throws IOException {

        File fl = new File("./RegistrationFile.txt");
        fl.createNewFile();

        FileWriter fw = new FileWriter(fl);
        fw.write("Damini");
        fw.write("\n");
        fw.write("Sharma");
        fw.write("\n");
        fw.write("aabbyy@gmail.com");
        fw.write("\n");
        fw.write("7678787887");
        fw.write("\n");
        fw.write("123456345");
        fw.write("\n");
        fw.write("123456345");
        fw.write("\n");
        fw.close();

        FileReader re= new FileReader("./RegistrationFile.txt");
        BufferedReader br= new BufferedReader(re);

        String str,str1,str3,str4,str5,str6;
        str=br.readLine();
        str1=br.readLine();
        str3=br.readLine();
        str4=br.readLine();
        str5=br.readLine();
        str6=br.readLine();



//        ArrayList<String> arr= new ArrayList<String>();
//        for (String s:arr) {
//            arr.add(br.readLine());
//        }
//        arr.add(br.readLine());
//        arr.add(br.readLine());
//        arr.add(br.readLine());
//        arr.add(br.readLine());
//        arr.add(br.readLine());
//        arr.add(br.readLine());
//        System.out.println(arr.get(0));

//        for(int i=0; i<=arr.size()-1; i++){
//            arr.add(br.readLine());
//            System.out.println(arr.get(i));
//
//        }
//        while ((arr=br.readLine())!=null){
//            System.out.println(arr);
//        }

        br.close();

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.opencart.com/");

        driver.findElement(By.xpath("//i[@class='fa fa-user']")).click();

        driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();

        driver.findElement(By.id("input-firstname")).sendKeys(str);
        driver.findElement(By.id("input-lastname")).sendKeys(str1);
        driver.findElement(By.id("input-email")).sendKeys(str3);
        driver.findElement(By.id("input-telephone")).sendKeys(str4);
        driver.findElement(By.id("input-password")).sendKeys(str5);
        driver.findElement(By.id("input-confirm")).sendKeys(str6);

        driver.findElement(By.xpath("//input[@name='agree']")).click();
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
    }
}