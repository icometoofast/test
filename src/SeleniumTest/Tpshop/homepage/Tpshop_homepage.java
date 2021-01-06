package SeleniumTest.Tpshop.homepage;

import SeleniumTest.Tpshop.createUser.Tpshop_createUser;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Tpshop_homepage {
    public void mouthHolder() throws InterruptedException {
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://47.105.64.182/index.php");
        try {
            chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        }catch (Exception e){
            e.printStackTrace();
        }
        chromeDriver.findElement(By.id("q")).sendKeys("lalala");
        WebElement chromeDriverElement = chromeDriver.findElement(By.linkText("电脑"));
        Actions actions = new Actions(chromeDriver);
        actions.moveToElement(chromeDriverElement).perform();
        Thread.sleep(5000);
        chromeDriver.findElement(By.id("q")).sendKeys("awdawdad");
        chromeDriver.quit();
    }

    public void search(WebDriver driver) throws InterruptedException {
        driver.findElement(By.id("q")).sendKeys("白色");
        Thread.sleep(3000);
        driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    public void gotoRegAndSubmit(WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("注册")).click();
        Tpshop_createUser createUser = new Tpshop_createUser();
        createUser.runWithoutURL(driver);
    }

    public void quit(WebDriver driver){
        driver.quit();
    }

    public void lala(){

    }
    //配送地区暂时不改
    public void buy(WebDriver driver){
        driver.findElement(By.linkText("华为（HUAWEI） M2 10.0 平板电脑 WiFi 月光银")).click();
//        driver.findElement(By.className("store-selector add_cj_p")).click();
    }

    public void windowsOperation(WebDriver driver){
        driver.manage().window().maximize();
    }

    //注意要等到网页把jQuery.js加载完才可以调用，不然会报错
    public void javaScripeOperation(WebDriver driver){
    //异步执行js代码
        //使用js在控制台输出：hello selenium！
        String javascriptCode = "console.log('hello selenium!');";
        ((JavascriptExecutor)driver).executeScript(javascriptCode);

    //执行同步js代码
        ((JavascriptExecutor)driver).executeAsyncScript(javascriptCode);
    }
    
    public void wait(WebDriver driver){
        //显示等待，最好
        WebDriverWait wait = new WebDriverWait(driver,3000);
        wait.until(new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.id("id"));
            }
        }).sendKeys("keys");
    }

}


