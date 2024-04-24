package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Services_analytics {
    public static void main(String[] args) throws InterruptedException {

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
        driver.navigate().back();
       WebElement tableauconsultingreadmore_Element= driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/tableau-consulting-services/']"));
        tableauconsultingreadmore_Element.click();
        WebElement tryItForFreeElement= driver.findElement(By.xpath("//a[normalize-space()='Try It For Free']"));
        tryItForFreeElement.click();
        String mainWindowHandle = driver.getWindowHandle(); // Store the current window handle
        System.out.println("main window id : "+mainWindowHandle);
        Set<String> windowHandles = driver.getWindowHandles(); // Get all window handles

        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle); // Switch to the pop-up window
                System.out.println("child window : "+handle);
                driver.close();

            }
        }
        driver.switchTo().window(mainWindowHandle);
        Thread.sleep(5000);

        driver.navigate().back();
        WebElement sapReadMore_Element= driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/sap-businessobjects/']"));
        sapReadMore_Element.click();

       String url =driver.getCurrentUrl();
        System.out.println(url);
        WebElement informaticaReadMore_Element= driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/informatica/']"));
        informaticaReadMore_Element.click();
        driver.findElement(By.linkText("Quick Facts")).click();
        driver.findElement(By.linkText("Offerings")).click();
       driver.findElement(By.linkText("Key Highlights")).click();
        driver.navigate().back();
        WebElement oracleReadMore_Element = driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/oracle-bi/']"));
        oracleReadMore_Element.click();
        driver.navigate().back();
        WebElement bigdataReadMore_Element = driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/bigdata/']"));
        bigdataReadMore_Element.click();
        driver.navigate().back();
        WebElement advancedAnalyticsReadMore_Element = driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/advanced-analytics/']"));
        advancedAnalyticsReadMore_Element.click();
        driver.navigate().back();
        WebElement businessReadMoreElement = driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/business-intelligence-data-warehouse/']"));
        businessReadMoreElement.click();
        driver.navigate().back();

    }
}