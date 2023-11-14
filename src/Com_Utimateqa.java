import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-5 - ProjectName : com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Click on ‘Sign In’ link
 * 7. Print the current url
 * 8. Enter the email to email field.
 * 9. Enter the password to password field.
 * 10. Click on Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */

public class Com_Utimateqa {
    public static void main(String[] args) {

        String baseUrl = "https://courses.ultimateqa.com/";

        // 1. Set up Chrome Browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open Url.
        driver.get(baseUrl);

        // 3. Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current url.
        System.out.println("This is the Current Url: " + driver.getCurrentUrl());

        // 5. Print the page source.
        driver.getPageSource();

        // 6. Click on ‘Sign In’ link
        WebElement signin = driver.findElement(By.linkText("Sign In"));
        signin.click();

        // 7. Print the current url
        System.out.println("This is the current Url: " + driver.getCurrentUrl());

        // 8. Enter the email to email field.
        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("Devansh Rami");

        // 9. Enter the password to password field.
        WebElement passwordfield = driver.findElement(By.id("user[password]"));
        passwordfield.sendKeys("HAwjdejfj34");

        // 10. Click on Login Button.
        WebElement login = driver.findElement(By.className("button button-primary g-recaptcha"));
        login.click();

        // 11. Navigate to baseUrl.
        driver.navigate().to(baseUrl);

        // 12. Navigate forward to Homepage.
        driver.navigate().forward();

        // 13. Navigate back to baseUrl.
        driver.navigate().back();

        // 14. Refresh the page.
        driver.navigate().refresh();

        // 15. Close the browser.
        driver.quit();
    }
}
