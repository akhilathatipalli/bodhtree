package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Mouseoveraction_forservices {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        driver.get("https://www.bodhtree.com");
        Actions act =new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//li[@id='menu-item-9487']//span[@class='x-menu-text'][normalize-space()='Services']")));
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        act.build().perform();
        WebElement analyticsElement = driver.findElement(By.xpath("//li[@id='menu-item-6693']//span[@class='x-menu-text'][normalize-space()='Analytics']"));
       analyticsElement.click();
       WebElement readmore_Element= driver.findElement(By.xpath("//a[@href='http://www.bodhtree.com//beta/services/analytics/tableau-reseller/']"));
        readmore_Element.click();
    }
}




