package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static java.lang.Thread.sleep;


public class IFrameExaple extends Util{

    private By _Title=By.xpath("//h1[text()=\"Frames Examples in Selenium Webdriver\"]");//path of frame text
    private By _Topic=By.xpath("//input[@type=\"text\"]");
    private By _CheckBox=By.xpath("//input[@type=\"checkbox\"]");
    private By _SelectAnimal= By.xpath("//select[@class=\"col-lg-3\"]");

    public void verifyIFrameTitle()
    {
        String ExpectedText="Frames Examples in Selenium Webdriver";
        Assert.assertEquals(getTextFromElement(_Title),ExpectedText,"expected match with actual");
    }

    public void verifyUserEnteredDetails(){
//        try {
//            sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        driver.switchTo().frame("frame1");//switch to first frame

        typeText(_Topic,"Test");//type any topic in topic box

        driver.switchTo().frame("frame3");
        //driver.switchTo().frame("frame3");//switch to third frame
        javaScriptClick(_CheckBox);//click on check box

//        driver.switchTo().defaultContent();//switch to main frame
        driver.switchTo().frame("frame1");
//        driver.switchTo().frame("frame3");
        driver.switchTo().frame("frame2");//switch to second frame

        selectFromDropDownByVisiableText(_SelectAnimal,"Avatar");//select animal type as Avatar
    }
}