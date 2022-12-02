package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class utils {
    static WebDriver driver = new ChromeDriver();
    static String searchBar = "gLFyf";

    public static void navigateGoogle(){
        driver.get("https://google.com");
    }

    public static String searchGoogle(String input){
        driver.findElement(By.className(searchBar)).sendKeys(input + Keys.ENTER);
        //WebElement element = driver.findElement(By.xpath("//input[@value='" + input + "']"));
        Assert.assertEquals(driver.findElement(By.xpath("//input[@value='" + input + "' and @name='q' and @aria-label= 'Search']")).isDisplayed(), true);
        return input;
    }

    public static void validateSearch(){


    }
}
