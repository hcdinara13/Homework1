package com.cbt.tests;

import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTests {

    public static void main(String[] args) {
        Chrome();
        Firefox();
        Edge();
    }
    public static void Chrome(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String actual = driver.getTitle();
        BrowserUtils.wait(1);
        driver.navigate().to("http://etsy.com");
        String actual2 = driver.getTitle();
        BrowserUtils.wait(1);
        driver.navigate().back();
        BrowserUtils.wait(1);
        StringUtility.verifyEquals(actual, "Google");
        driver.navigate().forward();
        StringUtility.verifyEquals(actual2, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
        driver.close();
    }

    public static void Firefox(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://google.com");
        String actual = driver.getTitle();
        BrowserUtils.wait(1);
        driver.navigate().to("http://etsy.com");
        String actual2 = driver.getTitle();
        BrowserUtils.wait(1);
        driver.navigate().back();
        BrowserUtils.wait(1);
        StringUtility.verifyEquals(actual, "Google");
        driver.navigate().forward();
        StringUtility.verifyEquals(actual2, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
        driver.close();
    }

    public static void Edge(){
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://google.com");
        String actual = driver.getTitle();
        BrowserUtils.wait(1);
        driver.navigate().to("http://etsy.com");
        String actual2 = driver.getTitle();
        BrowserUtils.wait(1);
        driver.navigate().back();
        BrowserUtils.wait(1);
        StringUtility.verifyEquals(actual, "Google");
        driver.navigate().forward();
        StringUtility.verifyEquals(actual2, "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone");
        driver.close();
    }
}
