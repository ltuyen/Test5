package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws InterruptedException {


        // write your code here
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1704,916));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://tuyen.online.sit.getzpass.com");

        Thread.sleep(2000);
        driver.findElementByXPath("//div[@id='btnPickup']/div[2]/img").click();
        Thread.sleep(3000);
        driver.findElement(By.id("btn-map-29")).click();

        driver.findElement(By.id("addToCart-9ea89546-ba04-4c56-97c2-f58da8025340")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnCheckOut")).click();
        driver.findElement(By.id("member_firstName")).click();
        driver.findElement(By.id("member_firstName")).sendKeys("tuyen");
        driver.findElement(By.id("member_lastName")).click();
        driver.findElement(By.id("member_lastName")).sendKeys("le");
        driver.findElement(By.id("member_email")).click();
        driver.findElement(By.id("member_email")).sendKeys("tuyensdc@gmail.com");
        driver.findElement(By.id("member_phone")).click();
        driver.findElement(By.id("member_phone")).sendKeys("92345678");
        driver.findElement(By.id("check_paymentS")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tab2href")).click();
        driver.findElementByXPath("(//input[@name='account_type'])[2]").click();
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("tuyen.le@smoovapp.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("GetzPay123");
        driver.findElement(By.id("btnLog")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("SecurityCode")).click();
        driver.findElement(By.id("SecurityCode")).sendKeys("123");
        driver.findElement(By.id("TempAgreeTC")).click();
        driver.findElement(By.id("btnSubmit")).click();
        assertEquals(driver.findElement(By.cssSelector("h2.title-2")).getText(), "TRACK YOUR ORDER STATUS");
        driver.quit();
    }

    private static void assertEquals(String text, String track_your_order_status) {

    }

}