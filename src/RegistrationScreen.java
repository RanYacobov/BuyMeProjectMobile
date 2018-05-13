import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationScreen {
    private static WebElement element=null;
    public static WebElement RegistrationButton(WebDriver driver){
        element=driver.findElement(By.id("il.co.mintapp.buyme:id/skipButton"));
        return element;
    }
        private static WebElement element1=null;
        public static WebElement EmailButton(WebDriver driver){
            element1=driver.findElement(By.id("il.co.mintapp.buyme:id/emailButton"));
            return element1;
    }
    private static WebElement element2=null;
    public static WebElement EmailType(WebDriver driver){
        element2=driver.findElement(By.id("il.co.mintapp.buyme:id/inputEmail"));
        return element2;
}
     static WebElement element3=null;
    public static WebElement Continue(WebDriver driver){
        element3=driver.findElement(By.id("il.co.mintapp.buyme:id/continueButton"));
        return element3;
}
    static WebElement element4=null;
    public static WebElement NameClick(WebDriver driver) {
        element4 = driver.findElement(By.id("il.co.mintapp.buyme:id/inputFirstName"));
        return element4;
    }

    static WebElement element5=null;
    public static WebElement PasswordClick(WebDriver driver) {
        element5 = driver.findElement(By.id("il.co.mintapp.buyme:id/inputPassword"));
        return element5;
    }
    static WebElement element6=null;
    public static WebElement RepassordClick(WebDriver driver) {
        element6 = driver.findElement(By.id("il.co.mintapp.buyme:id/inputPasswordVerify"));
        return element6;
    }






     static WebElement element7=null;
    public static WebElement Confirm(WebDriver driver) {
        element7 = driver.findElement(By.id("il.co.mintapp.buyme:id/continueButton"));
        return element7;
    }
}
