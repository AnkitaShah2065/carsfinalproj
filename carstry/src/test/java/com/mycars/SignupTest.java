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
public class SignupTest {
        Signup signup;
    public SignupTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        signup = new Signup();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() throws FileNotFoundException, IOException {
     
          String username,password,conpassword;
      FileInputStream inputStream = new FileInputStream("C:\\Ankita\\QA testing training\\Selenium Project\\cars.com_data.xlsx")  ;
      Workbook workbook = new XSSFWorkbook(inputStream); 
      //Getting first WorkSheet
      Sheet firstSheet = workbook.getSheetAt(0) ;
      // Getting first row
      Row row = firstSheet.getRow(2);
       //  System.out.println(row.getRowNum());
      Cell cell = row.getCell(0);
      username = cell.getStringCellValue();
      System.out.println(username);
      cell = row.getCell(1);
      password = cell.getStringCellValue();
      cell = row.getCell(2);
      conpassword = cell.getStringCellValue();
      
      signup.setUsername(username);
         assertEquals("abc123@test.com", username);
      signup.setPassword(password);
         assertEquals("Abc#12345", password);
         signup.setConpassword(conpassword);
         assertEquals(conpassword, password);
     }
}
