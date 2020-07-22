package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManage extends Util{
    public  void setUpWebBrowser() {// re-usable method to setup web browser for gui
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }

    public  void setUpWebBrowser1() {// re-usable method to setup web browser for gui
        System.setProperty("webdriver.chrome.driver", "src\\test\\BrowserDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
    }
    public  void closeBrowser() {//re-usable method to close web-browser
        driver.close();
    }
}