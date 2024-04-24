package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Servicestab {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        driver.get("https://www.bodhtree.com");
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-9487']//span[@class='x-menu-text'][normalize-space()='Services']")));
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        act.build().perform();
        WebElement analyticsElement = driver.findElement(By.xpath("//li[@id='menu-item-6693']//span[@class='x-menu-text'][normalize-space()='Analytics']"));
        analyticsElement.click();
        WebElement readmore_Element = driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/tableau-reseller/']"));
        readmore_Element.click();
        driver.findElement(By.xpath("//input[@placeholder='Name*']")).sendKeys("Akhila");
        driver.findElement(By.xpath("//input[@placeholder='Title*']")).sendKeys("Testing");
        driver.findElement(By.xpath("//input[@placeholder='Company*']")).sendKeys("Bothtree");
        driver.findElement(By.xpath("//input[@placeholder='Email*']")).sendKeys("akhila@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone*']")).sendKeys("9988776655");
        driver.findElement(By.xpath("//input[@placeholder='Location*']")).sendKeys("Hyderabad");
        WebElement licence_typesElement = driver.findElement(By.xpath("//select[@name='license']"));
        licence_typesElement.click();
        Select licenceTypesDropdown = new Select(licence_typesElement);
        licenceTypesDropdown.selectByValue("Creator");
        driver.findElement(By.xpath("//textarea[@placeholder='Message']")).sendKeys("i want listen the demo");
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.isSelected();
        checkbox.click();
//        WebElement send_Element = driver.findElement(By.xpath("//input[@value='Send']"));
//        send_Element.click();
    }
    }





