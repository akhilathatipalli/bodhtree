package HRMS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Debug;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Loginpage {
    public WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

    }

    @AfterTest
    public void quitDriver() {
        driver.close();
    }

    @Test
    public void validUsernameAndPwd() {

//driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("test@office.com");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Opened the dashboard page - Assert passed");

    }

    @Test
    public void validUserEmailInvalidPassword() {
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("test@office.com");
        driver.findElement(By.name("password")).sendKeys("test124");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Enter valid password - Assert passed");

    }

    @Test
    public void InvalidUserEmailValidPassword() {
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("testoffice.com");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Enter valid userEmail - Assert passed");
    }

    @Test
    public void InvalidUserEmailInvalidPassword() {
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("testoffice.com");
        driver.findElement(By.name("password")).sendKeys("test124");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Invalid credentials - Assert passed");
    }
    @Test
    public void ValidUserEmailLeavePasswordBlank() {
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("test@office.com");
        driver.findElement(By.name("password")).sendKeys("<blank>");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Invalid credentials - Assert passed");
    }
    @Test
    public void LeaveUserEmailBlankValidPassword() {
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("<blank>");
        driver.findElement(By.name("password")).sendKeys("test123");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Invalid credentials - Assert passed");
    }
    @Test
    public void LeaveUserEmailBlankPasswordBlank() {
        driver.manage().window().maximize();
        driver.get("Dummy");
        driver.findElement(By.name("officeEmail")).sendKeys("<blank>");
        driver.findElement(By.name("password")).sendKeys("<blank>");
        driver.findElement((By.xpath("//button[contains(.,'Login')]"))).click();
        WebElement dashboardElement = driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]"));
        Assert.assertEquals("ExpectedText", dashboardElement.getText());
        System.out.println("Invalid credentials - Assert passed");
    }
}