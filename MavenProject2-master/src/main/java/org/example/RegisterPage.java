package org.example;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class RegisterPage extends Util{

    private By _Gender=By.xpath("//input[@id=\"gender-male\"]");
    private By _FirstName=By.xpath("//input[@id=\"FirstName\"]");
    private By _LastName=By.xpath("//input[@id=\"LastName\"]");
    private By _Date=By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _Month=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _Year=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _Email=By.xpath("//input[@id=\"Email\"]");
    private By _CompanyName=By.xpath("//input[@id=\"Company\"]");
    private By _NewsLatter=By.xpath("//input[@id=\"Newsletter\"]");
    private By _Password=By.xpath("//input[@id=\"Password\"]");
    private By _ConfirmPassword=By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _RegisterButton=By.xpath("//input[@id=\"register-button\"]");
    public void RegisterForm(){
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //waitUntillElementClickable(_FirstName,30);
        //waitUntillElementClickable(_LastName,30);
        javaScriptClick(_Gender);
        typeText(_FirstName,"Nick");
        typeText(_LastName,"Solomon");
        selectFromDropDownByValue(_Date,"28");
        selectFromDropDownByVisiableText(_Month,"February");
        selectFromDropDownByValue(_Year,"2020");
        typeText(_Email,"test+" + timeStamp() + "@gmail.com");
        typeText(_CompanyName,"ABCOnline.com");
        javaScriptClick(_NewsLatter);
        typeText(_Password,"P@$$W0RD");
        typeText(_ConfirmPassword,"P@$$W0RD");
    }
    public void ClickOnSubmitRegister(){
        javaScriptClick(_RegisterButton);
    }
}