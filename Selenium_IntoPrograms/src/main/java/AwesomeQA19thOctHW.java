import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class AwesomeQA19thOctHW {
    public static void main(String[] args)
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://awesomeqa.com/ui/index.php?route=account/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("input-firstname")).sendKeys("Shubhz");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Berad");
        driver.findElement(By.cssSelector("input#input-email")).sendKeys("shubh11@gmail.com");
        driver.findElement(By.cssSelector("input[type=\"tel\"]")).sendKeys("92378237373");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Shubham@123");
        driver.findElement(By.cssSelector("input#input-confirm")).sendKeys("Shubham@123");
        driver.findElement(By.cssSelector("input[value='0']")).click();
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds('4'));
        String msg=driver.findElement(By.cssSelector("div h1")).toString();
        System.out.println(msg);
        driver.quit();
    }
}
