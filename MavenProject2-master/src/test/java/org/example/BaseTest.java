package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Util{
    BrowserManage browserManage=new BrowserManage();
    @BeforeMethod
    public void OpenBrowser(){
        //browserManage.setUpWebBrowser();
        browserManage.setUpWebBrowser1();
    }
    @AfterMethod
    public void CloseBrowser(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus())
        {
            takeScreenShot(result.getName()+timeStamp());
        }
        browserManage.closeBrowser();
    }
}