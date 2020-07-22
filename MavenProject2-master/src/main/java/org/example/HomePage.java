package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static java.lang.Thread.sleep;

public class HomePage extends Util{
    private By _RegisterButton=By.linkText("Register");
    private By _CurrencySelector=By.xpath("//select[@aria-label=\"Currency selector\"]");
    private By _SearchButton= By.xpath("//input[@class='button-1 search-box-button']");
    private By _FBButton=By.xpath("//a[contains(text(),'Facebook')]");
    private By _NewsLatterButton=By.xpath("//div[@class='news-list-homepage']//div[1]//div[3]//a[1]");

    public void clickOnRegisterButton(){
        clickOnElement(_RegisterButton);
    }

    public void clickOnSearchButton(){
        clickOnElement(_SearchButton);
    }

    public void clickONFBButton(){javaScriptClick(_FBButton);}

    public void clickOnNewsLatterButton(){javaScriptClick(_NewsLatterButton);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }}

    public void _AlertWindowHomePage() {
        // Switching to Alert
        Alert alert = driver.switchTo().alert();
        // Capturing alert message.
        String actualMessage = driver.switchTo().alert().getText();
        System.out.print(actualMessage);
        String _expectedText = "Please enter some search keyword";
        Assert.assertEquals(actualMessage, _expectedText, "expected match with actual");
        // Accepting alert, click on OK button
        alert.accept();
    }

    public void VerifyCustomerSelectCurrency(String currency) {
        selectFromDropDownByVisiableText(_CurrencySelector, currency);//selecting currency
        List<WebElement> PriceOfProduct = driver.findElements(By.xpath("//div[@class=\"item-grid\"]//div[@class=\"prices\"]"));
        for (WebElement Currency : PriceOfProduct) {

            if (currency.equals("Euro")) {
                Assert.assertTrue(Currency.getText().contains("€"), "Currency of the price does not match expected symbol");
            } else if (currency.equals("US Dollar")) {
                Assert.assertTrue(Currency.getText().contains("$"), "Currency of the price does not match expected symbol");
           }
        }
    }
}