import com.google.common.annotations.VisibleForTesting;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.sql.SQLOutput;

public class Selenium001 {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/login");
        String pageTitle = driver.getTitle();
        Assert.isTrue(true, String.valueOf(pageTitle.equalsIgnoreCase("Login - VWO")));

        WebElement user_ip_box = driver.findElement(By.id("login-username"));
        user_ip_box.sendKeys("abc@gmail.com");

        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("abc@1234");

        WebElement button = driver.findElement(By.id("js-login-btn"));
        button.click();
        Thread.sleep(4000);
        WebElement error_mesg = driver.findElement(By.id("js-notification-box-msg"));

        driver.quit();
    }


}
