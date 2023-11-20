package day02_getMetodlari;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class C03_getMethodlari {
    public static void main(String[] args) throws InterruptedException {

        /*
        Selenium 4.12 versiyonu ile kendi webdriver ini da oluşturabiliyor.
        yani artık dışarıdan bir webdriver tanımlama mecburiyeti kalmadı ancak
        şirketlerin pekçoğu kendilerine özel olarak satın aldıkları webdriver lari kullanabiliyor.

        biz bu ruma alışmak için selenium webdriver yerine
        indirdiğimiz driver.exe dosyasını kullanmaya devam edeceğiz.
         */

        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.testotomasyonu.com");
        Thread.sleep(1000);
       //  System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle()); // 629FAF89B5CCBE916FAC7C818D347B04
        //  window handle değeri: selenium un oluşturdugu her webdriver objesine verdiği bir uniq koddur.
        // biz bu değerleri birden fazla sayfa açılırsa sayfalar arasında geçiş yapmak için kullanıcaz

        System.out.println(driver.getWindowHandles());  // [D59645D0F18175C1E4EFA26DA1860AE7]
        // aktif webdriver objasinin açtığı tüm sayfaların window handle değerlerini set gibi getirir.

        Thread.sleep(1000);
        driver.quit();

    }
}
