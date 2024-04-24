package Login;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Login {
    String NAME="//input[@name='username']";

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
        driver.findElement(By.xpath(NAME)).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        System.out.println(dashboardElement.getText());
        Assert.assertEquals(dashboardElement.getText(),"Dashboard");

    }

    @Test
    public void invalidUsernameAndValidPwd() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Adminnn");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();

    }


    @Test
    public void validUsernameAndInvalidPwd() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin456");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();

    }

    @Test
    public void invalidUsernameAndInvalidPwd() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Adminnn");
        driver.findElement(By.name("password")).sendKeys("admin456");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();

    }

    @Test
    public void validUsernameAndleavePwdBlank() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys(" ");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();

    }

    @Test
    public void leaveUsernameBlankAndValidPwd() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(" ");
        driver.findElement(By.name("password")).sendKeys("admin123 ");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();

    }

    @Test
    public void leaveUsernameBlankAndLeavePwdBlank() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(" ");
        driver.findElement(By.name("password")).sendKeys(" ");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();

    }
}