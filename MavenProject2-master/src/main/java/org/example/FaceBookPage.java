package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Util{
    private String  expectedURL="https://www.facebook.com/nopCommerce";
    private By _ActualCreateAPage=By.xpath("//button[@class='_4jy0 _4jy3 _4jy2 _51sy selected _42ft']");
    String expectedCreateAPage ="Create a Page";
    String expectedColor="rgba(66, 183, 42, 1)";

    public void verifyPopUpWindowURL()
    {
        String MainWindow=driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1=driver.getWindowHandles();
        Iterator<String> i1=s1.iterator();

        while(i1.hasNext())
        {
            String ChildWindow=i1.next();

            if(!MainWindow.equalsIgnoreCase(ChildWindow))
            {
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                String ActualURL=driver.getCurrentUrl();
                Assert.assertEquals(ActualURL, expectedURL, "expected match with actual");

                //Verify Create a Page Button Text
                Assert.assertEquals(getTextFromElement(_ActualCreateAPage), expectedCreateAPage, "expected match with actual");

                //Verify Create a Page Button Style
                String ActualColor=driver.findElement(_ActualCreateAPage).getCssValue("background-color");
                System.out.print(ActualColor);
                Assert.assertEquals(ActualColor,expectedColor,"expected match with actual");

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}
