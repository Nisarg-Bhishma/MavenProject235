package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SuccessfullyRegistered extends Util{
    private By _SuccessMessage=By.xpath("//div[@class='result']");
    String _expectedText = "Your registration completed";
    public void VerifyUserRegisteredSuccessfully(){
        Assert.assertEquals(getTextFromElement(_SuccessMessage), _expectedText, "expected match with actual");
    }
}