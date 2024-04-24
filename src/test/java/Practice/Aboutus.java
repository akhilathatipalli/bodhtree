package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aboutus {
        public static void main(String[] args) {

            //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


            WebDriver driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.get("https://www.bodhtree.com");
            WebElement aboutusElement = driver.findElement(By.xpath("//li[@id='menu-item-6420']"));
            aboutusElement.click();
        }
    }

