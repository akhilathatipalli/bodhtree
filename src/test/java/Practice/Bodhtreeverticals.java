package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bodhtreeverticals {
    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();


        driver.get("https://www.bodhtree.com");
        WebElement verticalsElement = driver.findElement(By.xpath("//li[@id='menu-item-8827']//span[@class='x-menu-text'][normalize-space()='Verticals']"));
//        String verticalsText = verticalsElement.getText();
        verticalsElement.click();


    }
}

