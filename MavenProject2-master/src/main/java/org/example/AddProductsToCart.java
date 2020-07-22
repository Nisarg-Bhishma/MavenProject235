package org.example;

import org.openqa.selenium.By;

import static java.lang.Thread.sleep;

public class AddProductsToCart extends Util{

    private By _HTCOneM8=By.xpath("//div[@class=\"item-grid\"]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]");
    private By _HTMOneMini=(By.xpath("//div[@class=\"item-grid\"]/div[2]/div[1]/div[2]/div[3]/div[2]/input[1]"));

    public void ClickOnAddToCartButton(){

        waitUntillElementClickable(_HTCOneM8,30);
        javaScriptClick(_HTCOneM8);
        //waitUntillElementClickable(_HTMOneMini,30);
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        javaScriptClick(_HTMOneMini);
    }
}