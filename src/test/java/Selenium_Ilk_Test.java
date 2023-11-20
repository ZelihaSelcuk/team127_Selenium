import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Ilk_Test {
    public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver dirver = new ChromeDriver();
        dirver.get("https://www.trendyol.com/");
    }
}
