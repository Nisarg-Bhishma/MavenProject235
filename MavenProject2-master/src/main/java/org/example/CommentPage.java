package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class CommentPage extends Util {

    public void verifyNewsLatterPage() {
        String ActualURL = driver.getCurrentUrl();
        String ExpectedURL = "https://demo.nopcommerce.com/new-online-store-is-open";
        Assert.assertEquals(ActualURL, ExpectedURL, "expected match with actual");
    }

    private By _Title = By.xpath("//input[@class='enter-comment-title']");
    private By _Comment = By.xpath("//textarea[@class='enter-comment-text']");

    public void clickOnNewCommentButton() {
        typeText(_Title, "Nick Solomon");
        typeText(_Comment, "This is a test comment, to review the site comment button.");
        javaScriptClick(By.xpath("//input[@class='button-1 news-item-add-comment-button']"));
    }

    private By _ActualSuccessMessage = By.xpath("//div[@class='result']");

    public void verifyMessagePostedSuccessfully() {
        String ExpectedSuccessMessage = "News comment is successfully added.";
        Assert.assertEquals(getTextFromElement(_ActualSuccessMessage), ExpectedSuccessMessage);
    }

    private By _ActualTitle = By.xpath("//div[@class='comments']//div[2]//div[2]//div[2]//strong[1]");

    public void verifyPostedComments()
    {
        List<WebElement> Comment = driver.findElements(By.xpath("//strong[@class=\"comment-text\"]"));
        String []linkText =new String[Comment.size()];
        int i=0;
            //Storing List elements text into String array
            for(WebElement title: Comment)
            {
                linkText[i]=title.getText();
                i++;
            }
            String _ActualTitle = linkText[1];
            Assert.assertEquals(_ActualTitle, "Nick Solomon", "expected match with actual");
    }
    public void verifyLastMessage()
        {
            List<WebElement> Comment = driver.findElements(By.xpath("//strong[@class=\"comment-text\"]"));
            String _ActualTitle = Comment.get(Comment.size() - 1).getText();
            Assert.assertEquals(_ActualTitle, "Nick Solomon","expected match with actual");
        }
}