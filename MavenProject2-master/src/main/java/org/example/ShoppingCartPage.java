package org.example;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;
import static org.example.Util.*;

public class ShoppingCartPage {
    private By _shoppingCart=(By.xpath("//span[@class='cart-label']"));

    public void ClickOnShoppingCart(){
       waitUntillElementClickable(_shoppingCart,30);
        javaScriptClick(_shoppingCart);
    }
}
