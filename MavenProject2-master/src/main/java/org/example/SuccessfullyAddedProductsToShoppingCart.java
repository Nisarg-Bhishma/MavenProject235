package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class SuccessfullyAddedProductsToShoppingCart extends Util{
    private By _Product1=By.xpath("//a[@class='product-name'][contains(text(),'HTC One M8 Android L 5.0 Lollipop')]");
    private By _Product2=By.xpath("//a[@class='product-name'][contains(text(),'HTC One Mini Blue')]");

    //write expected result
    String expectedShoppingCartText1 = "HTC123 One M8 Android L 5.0 Lollipop";
    String expectedShoppingCartText2 = "HTC One Mini Blue";
    public void VerifyAddedProductsToShoppingCart(){
        Assert.assertEquals(getTextFromElement(_Product1), expectedShoppingCartText1, "expected match with actual");
        Assert.assertEquals(getTextFromElement(_Product2), expectedShoppingCartText2,"expected match with actual");
    }
}
