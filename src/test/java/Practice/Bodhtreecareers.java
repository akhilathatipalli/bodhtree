package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bodhtreecareers {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        driver.get("https://www.bodhtree.com");
        WebElement careersElement = driver.findElement(By.xpath("//li[@id='menu-item-22506']//span[@class='x-menu-text'][normalize-space()='Careers']"));
//        String  careersText =  careersElement.getText();
        careersElement.click();
    }
}
