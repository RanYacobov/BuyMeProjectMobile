import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeScreen {
    private static WebElement element = null;
    public static WebElement ChoseCtegory(WebDriver driver) {
        element = driver.findElement(By.id("il.co.mintapp.buyme:id/i_background"));
        return element;
    }
    private static WebElement element1=null;
    public static  WebElement ChoseGift(WebDriver driver){
        element1= driver.findElement(By.name("BUYME TOTAL - שובר משולב לרשתות אופנה"));
        return element1;
    }
    private static WebElement element2=null;
    public static  WebElement Purchase(WebDriver driver){
        element1= driver.findElement(By.name("il.co.mintapp.buyme:id/purchaseButton"));
        return element1;
}}