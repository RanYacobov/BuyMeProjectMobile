import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Main {
        private static AndroidDriver<MobileElement> driver;
        @BeforeClass
        public static void setUp() throws IOException {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
            capabilities.setCapability("appPackage", "il.co.mintapp.buyme");
            capabilities.setCapability("appActivity", "il.co.mintapp.buyme.activities.common.SplashScreen");
         //   driver.hideKeyboard();
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
            capabilities.setCapability(MobileCapabilityType.NO_RESET,true);
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        @Test
    public void IntoApp()throws IOException{  //registration screen-user need to fill in his information in order to log in
            RegistrationScreen.RegistrationButton(driver).click();
            RegistrationScreen.EmailButton(driver).click();
            RegistrationScreen.EmailType(driver).click();
            driver.findElement(By.id(Constant.TYPING)).sendKeys("ran21@gmail.com");
            RegistrationScreen.Continue(driver).submit();
            RegistrationScreen.NameClick(driver).click();
            driver.findElement(By.id(Constant.NAME)).sendKeys("Ran");
            RegistrationScreen.PasswordClick(driver).click();
            driver.findElement(By.id(Constant.PASSWORD)).sendKeys("111111");
            RegistrationScreen.RepassordClick(driver).click();
            driver.findElement(By.id(Constant.REPASSWORD)).sendKeys("111111");
            RegistrationScreen.Confirm(driver).submit();
            driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        }
        @Test
    public void Home()throws IOException{  //home screen- user need to add his contact info and chose the gift he want to send
            driver.findElement(By.id(Constant.FirstPhoneNumber)).click();
            driver.findElement(By.id(Constant.FirstPhoneNumber)).sendKeys("0");
            driver.findElement(By.id(Constant.RestPhoneNumber)).click();
            driver.findElement(By.id(Constant.RestPhoneNumber)).sendKeys("545288658");
            HomeScreen.ChoseCtegory(driver).click();
            HomeScreen.ChoseGift(driver).click();
            driver.findElement(By.id(Constant.ChoseAmount)).click();
            driver.findElement(By.id(Constant.ChoseAmount)).sendKeys("100");
            HomeScreen.Purchase(driver).submit();
            driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        }
        @Test
    public void Info()throws IOException{ //information screen- user need to add a blessing to his friend and the occasion that celebrate
            driver.findElement(By.id(Constant.Reciver)).click();
            driver.findElement(By.id(Constant.Reciver)).sendKeys("Daniel-Gotlib");
            InformationScreen.Occasion(driver).click();
            InformationScreen.Occasion(driver).sendKeys(Keys.ARROW_DOWN);
            InformationScreen.Occasion(driver).sendKeys(Keys.ENTER);
            driver.findElement(By.id(Constant.Blessing)).click();
            driver.findElement(By.id(Constant.Blessing)).clear();
            driver.findElement(By.id(Constant.Blessing)).sendKeys("Mobile final project!");
            InformationScreen.Proceed(driver).submit();
            driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        }
        @Test
    public void FinalPage()throws IOException{//final page- user need to update the day and the way he want to send the gift
            SendScreen.SMS(driver).click();
            driver.findElement(By.id(Constant.EMAILS)).click();
            driver.findElement(By.id(Constant.EMAILS)).sendKeys("ploni22@gmail.com");
            InformationScreen.Proceed(driver).submit();
            driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        }
}
