package day01_seleniumilkOtomasyon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_webdriverOlusturma {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver.exe");
        // olusturacağımız web dirver in özelliklerini set ediyor.
        // web driver otomasyon sırasında bizim elimiz ayağımız.

        WebDriver driver = new ChromeDriver();
        driver.get("https://testotomasyonu.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();
        driver.quit();

    }
}
