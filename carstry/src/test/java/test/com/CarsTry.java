/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
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
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author reach
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CarsTry {
    
    private WebDriver driver;
    private String baseUrl;
    
    public CarsTry() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // 
     public void hello() {}
     @Test
  public void testCarkSignup() throws Exception {
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
    driver.get("https://www.cars.com/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Videos & Reviews'])[2]/following::a[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]")).sendKeys(username);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::input[1]")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm Password'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm Password'])[1]/following::input[1]")).sendKeys(conpassword);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Confirm Password'])[1]/following::button[1]")).click();
    
  }

     @Test
       public void testCarLogin() throws Exception {
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
      driver.manage().deleteAllCookies();
      driver.get("https://www.cars.com/");
    driver.findElement(By.id("profile_menu-avatar")).click();
    driver.findElement(By.linkText("Log In")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Email'])[1]/following::input[1]")).sendKeys(username);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::input[1]")).clear();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Password'])[1]/following::input[1]")).sendKeys(password);
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Forgot your password?'])[1]/following::button[1]")).click();
    driver.close();
  }

    @Test
    public void testCars() throws Exception {
         String stocktype;
        String make;
        String model;
        String maxprice;
        String radius;
        
      FileInputStream inputStream = new FileInputStream("C:\\Ankita\\QA testing training\\Selenium Project\\cars.com_data.xlsx")  ;
      Workbook workbook = new XSSFWorkbook(inputStream); 
      //Getting first WorkSheet
      Sheet firstSheet = workbook.getSheetAt(0) ;
      // Getting first row
      Row row = firstSheet.getRow(4);
      Cell cell = row.getCell(0);
      stocktype = cell.getStringCellValue();
      cell = row.getCell(1);
      make = cell.getStringCellValue();
      cell = row.getCell(2);
      model = cell.getStringCellValue();
      cell = row.getCell(3);
      maxprice = cell.getStringCellValue();
      cell = row.getCell(4);
      radius = cell.getStringCellValue();
      
    driver.get("https://www.cars.com/");
    driver.findElement(By.name("stockType")).click();
    new Select(driver.findElement(By.name("stockType"))).selectByVisibleText(stocktype);
    driver.findElement(By.name("stockType")).click();
    driver.findElement(By.name("makeId")).click();
    new Select(driver.findElement(By.name("makeId"))).selectByVisibleText(make);
    driver.findElement(By.name("makeId")).click();
    driver.findElement(By.name("modelId")).click();
    new Select(driver.findElement(By.name("modelId"))).selectByVisibleText(model);
    driver.findElement(By.name("modelId")).click();
    driver.findElement(By.name("priceMax")).click();
    new Select(driver.findElement(By.name("priceMax"))).selectByVisibleText(maxprice);
    driver.findElement(By.name("priceMax")).click();
    driver.findElement(By.name("radius")).click();
    new Select(driver.findElement(By.name("radius"))).selectByVisibleText(radius);
    driver.findElement(By.name("radius")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search by'])[2]/following::input[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[7]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[8]/following::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Save'])[9]/following::label[1]")).click();

    driver.close();
    
  }
    

}
