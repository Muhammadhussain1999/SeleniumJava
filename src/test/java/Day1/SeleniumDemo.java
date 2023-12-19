package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SeleniumDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");

        // Get the title of the page
        String pageTitle = driver.getTitle();

        // Assert that the title contains a specific text
        Assert.assertTrue(pageTitle.contains("Facebook"));

        // Print the title to the console
        System.out.println("Page Title: " + pageTitle);

        // Close the browser
        driver.quit();
    }
}
