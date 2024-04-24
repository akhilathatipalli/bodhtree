package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bodhtreeservice {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        driver.get("https://www.bodhtree.com");
        WebElement servicesElement = driver.findElement(By.xpath("//div[@id='primary-menu']//following-sibling::li//span"));
//        String servicesText = servicesElement.getText();
        servicesElement.click();
        //WebElement SERVICES = driver.findElement(By.id("SERVICES"));

    }
}

