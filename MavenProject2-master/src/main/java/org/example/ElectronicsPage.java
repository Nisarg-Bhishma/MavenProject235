package org.example;

import org.openqa.selenium.By;
import sun.security.util.AuthResources_es;

public class ElectronicsPage extends Util{
    private By _Electronics=By.xpath("//ul[@class=\"top-menu notmobile\"]/li[2]/a[1]");
    public void ClickOnElectronics(){
        javaScriptClick(_Electronics);
    }
}
