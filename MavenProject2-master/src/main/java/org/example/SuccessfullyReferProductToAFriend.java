package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SuccessfullyReferProductToAFriend extends Util{
    private By _SuccessMessage=By.xpath("//div[@class=\"result\"]");
    String _expectedText = "Your message has been sent.";
    public void VerifySuccessMessageToReferProductAFriend(){
        Assert.assertEquals(getTextFromElement(_SuccessMessage), _expectedText, "expected match with actual");
    }
}
