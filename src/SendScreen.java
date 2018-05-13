import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendScreen {
    private static WebElement element=null;
    public static WebElement SMS(WebDriver driver){
        element=driver.findElement(By.id("il.co.mintapp.buyme:id/optionCheckBox"));
        return element;
}}
