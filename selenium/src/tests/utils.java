package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class utils {

    static WebDriver driver;
    static ChromeOptions options = new ChromeOptions();

    //Reusable variables
    static String searchBar = "gLFyf";


    //Selenium broke google driver in update. Tried to go to the latest version but didn't
    //Added method to get it to start. Once Selenium fixes it, remove method.
    public static void initializeOptions(){
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    public static void navigateGoogle(){
        driver.get("https://google.com");
    }

    public static String searchGoogle(String input){
        driver.findElement(By.className(searchBar)).sendKeys(input + Keys.ENTER);
        //WebElement element = driver.findElement(By.xpath("//input[@value='" + input + "']"));
        Assert.assertEquals(driver.findElement(By.xpath("//textarea[@value='" + input + "' and @name='q' and @aria-label= 'Search']")).isDisplayed(), true);
        return input;
    }

    public static String tapButton (String button){
        driver.findElement(By.id(button)).click();
        return button;
    }

    public static void validateSearch(){


    }
}
