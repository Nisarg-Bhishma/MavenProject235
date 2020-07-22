package org.example;

import org.openqa.selenium.By;

public class ComputersPage extends Util{
    private By _Computer=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[1]/a[1]");
    public void ClickonComputers(){
        javaScriptClick(_Computer);
    }
}