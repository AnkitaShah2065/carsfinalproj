/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycars;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reach
 */
public class LoginTest {
    Login log;
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        log = new Login();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() throws FileNotFoundException, IOException {
         String username,password;
      FileInputStream inputStream = new FileInputStream("C:\\Ankita\\QA testing training\\Selenium Project\\cars.com_data.xlsx")  ;
      Workbook workbook = new XSSFWorkbook(inputStream); 
      //Getting first WorkSheet
      Sheet firstSheet = workbook.getSheetAt(0) ;
      // Getting first row
      Row row = firstSheet.getRow(1);
      Cell cell = row.getCell(0);
      username = cell.getStringCellValue();
      cell = row.getCell(1);
      password = cell.getStringCellValue();
      
         log.setUsername(username);
         assertEquals("abc123@test.com",username);
         log.setPassword("abc123@test.com");
         assertEquals("Abc#12345",password);
     }
}
