package test.java;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadTest {
    public static void main(String args[]) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        FileInputStream f = new FileInputStream(System.getProperty("user.dir") + "\\ReadTest.xlsx");
        XSSFWorkbook Read = new XSSFWorkbook(f);
        XSSFSheet S = Read.getSheetAt(0);
        int row = S.getLastRowNum();
        System.out.println(row);
        int column = S.getRow(1).getLastCellNum();
        System.out.println(column);
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= column-1; j++) {
                System.out.println(S.getRow(i).getCell(j).getStringCellValue());
            }
        }
    }
}