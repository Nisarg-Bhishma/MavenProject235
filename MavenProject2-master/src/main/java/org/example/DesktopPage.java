package org.example;

import org.openqa.selenium.By;

public class DesktopPage extends Util{

    private By _Desktop=By.cssSelector("h2.title>a[href='/desktops']");
    public void ClickOnDesktop(){
        javaScriptClick(_Desktop);
    }
}
