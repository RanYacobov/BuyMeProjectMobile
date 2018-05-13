import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationScreen {
    private static WebElement element=null;
    public static WebElement Occasion(WebDriver driver){
        element=driver.findElement(By.id("android:id/text1"));
        return element;
}
    private static WebElement element1=null;
    public static WebElement Proceed(WebDriver driver){
        element=driver.findElement(By.id("il.co.mintapp.buyme:id/goNextButton"));
        return element;
}}
