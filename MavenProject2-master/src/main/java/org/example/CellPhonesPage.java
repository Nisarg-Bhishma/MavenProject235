package org.example;

import org.openqa.selenium.By;

import static org.example.Util.javaScriptClick;

public class CellPhonesPage {
    private By _CellPhones=By.xpath("//h2[@class=\"title\"]/a[contains(text(),'Cell phones')]");
    public void ClickOnCellPhone(){
        javaScriptClick(_CellPhones);
    }

}