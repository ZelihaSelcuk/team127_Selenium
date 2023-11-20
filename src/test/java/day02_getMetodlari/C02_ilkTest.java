package day02_getMetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {
    public static void main(String[] args) throws InterruptedException {

        // testotomasyonu anasayfaya gidin
        // URL'in https://www.testotomasyonu.com oldugunu
        // ve Title'in test kelimesi icerdigini test edin

        // her test için mutlaka bir web driver oluşturmalı ve gerekli ayarlamaları yapmalıyız.
        // aşağıdaki üçlü fix bulunacak,  işin besmelesi..
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // testotomasyonu anasayfaya gidin
        driver.get("https://testotomasyonu.com");

        // URL'in https://www.testotomasyonu.com oldugunu
        String expectedUrl = "https://testotomasyonu.com";
        String actualUrl = driver.getCurrentUrl();

        if (expectedUrl.equals(actualUrl)) {
            System.out.println("URL testi PASSED");
        } else {
            System.out.println("URL testi FAILED");
            System.out.println("Actual URL: " + actualUrl);

        }
        // ve Title'in test kelimesi icerdigini test edin
        String expectedTitleIcerigi = "test";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitleIcerigi)){
            System.out.println("Title Testi Passed");
        }else {
            System.out.println("Title Testi Failed");
            System.out.println("Actual title : " + actualTitle);
        }

        Thread.sleep(3000);
        driver.quit();
        }
}