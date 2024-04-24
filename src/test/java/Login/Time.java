package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Time {
//Time.validUsernameAndPwd();
    //Time.navigation bar working or not();
    public  WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void beforeTest(){

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }
    @AfterTest
    public void quitDriver(){
        driver.close();
    }

    @Test
    public void validUsernameAndPwd() {
//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("NAME")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
    }
   // @Test
    //public void Verify navigation bar working or not(){

    //}
    @Test
      public void verifyTimePage(){
  driver.findElement(By.linkText("Time"));
   }
   @Test
           public void verifyTimesheet(){
            WebElement dropdownElement = driver.findElement(By.name(" Timesheet"));
            Select Timesheet = new Select(dropdownElement);
        }
       @Test
       public void verifyTheMyTimesheetsWetherItIsDisplayingOrNot(){
           Select dropdown = null;
           dropdown.selectByVisibleText("Option 1");
           driver.findElement(By.id("menu_time_viewMyTimesheet")).click();

        }
        @Test
        public void verifyTheTimesheetsPeriodWorkingOrNot(){
            WebElement calendarIcon = driver.findElement(By.xpath("//class=\"oxd-icon bi-calendar oxd-date-input-icon\""));
            calendarIcon.click();
        Select day=new Select(driver.findElement(By.id("day")));
        day.selectByIndex(14);
        Select month=new Select(driver.findElement(By.id("month")));
        month.selectByValue("2");
        WebElement Element=driver.findElement(By.id("year"));
        Select year=new Select(Element);
        year.selectByVisibleText("2024");
        }
        //@Test
        //public void verifyTheTimesheetsPeriodWorkingOrNot();{

        //}
    }







