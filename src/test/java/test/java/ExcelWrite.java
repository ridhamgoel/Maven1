package test.java;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelWrite {
    public static void main(String args[]) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream f=new FileInputStream( System.getProperty("user.dir")+"\\ReadTest.xlsx");
//        createWorkbook object
        XSSFWorkbook w=new XSSFWorkbook(f);
        XSSFSheet s=  w.getSheetAt(0);
        s.getRow(1).getCell(1).setCellValue("maryada@gmail.com");
        FileOutputStream fi=new FileOutputStream(System.getProperty("user.dir")+"\\ReadTest.xlsx");
        w.write(fi);
        fi.close();
    }
}