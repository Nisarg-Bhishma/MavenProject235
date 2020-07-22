package org.example;

import org.openqa.selenium.By;

public class DigitalStorm extends Util{
    private By _DigitalStrom=By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    private By _EmailAFriendButton=By.cssSelector("input[value='Email a friend']");


    public void ClickOnDigitalStrom(){
        javaScriptClick(_DigitalStrom);
        javaScriptClick(_EmailAFriendButton);
    }
}
