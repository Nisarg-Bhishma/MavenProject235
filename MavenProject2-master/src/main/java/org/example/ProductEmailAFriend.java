package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriend extends Util{
    private By _FriendsEmail=By.xpath("//input[@placeholder=\"Enter friend's email.\"]");
    private By _OwnEmail=By.xpath("//input[@placeholder=\"Enter your email address.\"]");
    private By _PersonalMessage=By.xpath("//textarea[@name=\"PersonalMessage\"]");
    private By _SendEmailButton=By.xpath("//input[@name=\"send-email\"]");

    public void ClickOnEmailAFriendButton(){
        typeText(_FriendsEmail,"test+" + timeStamp() + "@gmail.com");
        typeText(_OwnEmail,"test1+" + timeStamp() + "@gmail.com");
        typeText(_PersonalMessage,"This is a Blast, don't miss it..");
        javaScriptClick(_SendEmailButton);
    }
}
