package SeleniumTest.Tpshop.createUser;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Tpshop_createUser {
    public void run() throws InterruptedException {
        Tpshop_createUser_createTele CreateTele = new Tpshop_createUser_createTele();
        String tele = CreateTele.create_tele();
        WebDriver chromeDriver = new ChromeDriver();
        String url = "http://47.105.64.182/index.php/Home/user/reg.html";
        chromeDriver.get(url);
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.findElement(By.id("username")).sendKeys(tele);
        Thread.sleep(1000);
        chromeDriver.findElement(By.name("verify_code")).sendKeys("8888");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("password")).sendKeys("lalala");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("password2")).sendKeys("lalala");
        Thread.sleep(1000);
        //进行鼠标操作
        //获取需要操作的元素
        WebElement webElement = chromeDriver.findElement(By.linkText("同意协议并注册"));
        //创建动作
        Actions actions = new Actions(chromeDriver);
        //鼠标悬浮在指定元素上
        actions.moveToElement(webElement);
        Thread.sleep(5000);
        //右击指定的元素
        actions.contextClick(webElement);
        Thread.sleep(5000);
        //尝试不指定元素的右击
        actions.contextClick();
        Thread.sleep(5000);
        //双击指定的元素
        actions.doubleClick(webElement);
        Thread.sleep(5000);
        //尝试不指定元素的双击
        actions.doubleClick();
        Thread.sleep(5000);
        chromeDriver.findElement(By.linkText("同意协议并注册")).click();
        Thread.sleep(1000);
//        chromeDriver.quit();

    }

    public void runWithoutURL(WebDriver chromeDriver) throws InterruptedException {
        Tpshop_createUser_createTele CreateTele = new Tpshop_createUser_createTele();
        String tele = CreateTele.create_tele();
        chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        chromeDriver.findElement(By.id("username")).sendKeys(tele);
        Thread.sleep(1000);
        chromeDriver.findElement(By.name("verify_code")).sendKeys("8888");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("password")).sendKeys("lalala");
        Thread.sleep(1000);
        chromeDriver.findElement(By.id("password2")).sendKeys("lalala");
        Thread.sleep(1000);
        //进行鼠标操作
        //获取需要操作的元素
        WebElement webElement = chromeDriver.findElement(By.linkText("同意协议并注册"));
        chromeDriver.findElement(By.linkText("同意协议并注册")).click();
        Thread.sleep(1000);
//        chromeDriver.quit();

    }

    public void findPasswordWithcss(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        driver.findElement(By.cssSelector("#password")).sendKeys("123456");

    }
    public void findButtonWithcss(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        driver.findElement(By.cssSelector(".regbtn.J_btn_agree")).click();
    }

    public void findUsernameWithCss(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        driver.findElement(By.cssSelector(".fnlogin.clearfix>.line:nth-child(1)>.liner>input")).sendKeys("110");
    }

    public void fillinData() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        driver.findElement(By.id("username")).sendKeys("18611111111");
        driver.findElement(By.name("verify_code")).sendKeys("8888");
        driver.findElement(By.id("password")).sendKeys("lalala");
        driver.findElement(By.id("password2")).sendKeys("lalala");
        Thread.sleep(3000);
        for(int i=0;i<=10;i++) {
            driver.findElement(By.id("username")).sendKeys(Keys.BACK_SPACE);
        }
        driver.findElement(By.id("username")).sendKeys("18600000000");
        Thread.sleep(3000);
        driver.findElement(By.linkText("同意协议并注册")).click();
        Thread.sleep(3000);
        driver.quit();

    }

    public void changeWindowSize() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        driver.manage().window().setPosition(new Point(350, 200));
        Thread.sleep(1000);
        //设置浏览器大小
        driver.manage().window().setSize(new Dimension(200, 500));
        Thread.sleep(1000);
        //获取浏览器位置和大小信息
        System.out.println("浏览器所在位置："+driver.manage().window().getPosition());
        System.out.println("浏览器大小："+driver.manage().window().getSize());
        //浏览器满屏，覆盖任务栏
//		webDriver.manage().window().fullscreen();
        //浏览器最大化，不覆盖任务栏
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();
    }

    public void buttonRightClick(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        WebElement username = driver.findElement(By.id("username"));
        Actions actions = new Actions(driver);
        actions.contextClick(username).perform();
    }

    public void clickAndMove() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/user/reg.html");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.cssSelector(".uli.active"));
        WebElement password = driver.findElement(By.id("password"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(element,password).perform();
    }

    public void keysControl() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php/Home/User/reg/t/email.html");
        driver.findElement(By.id("username")).sendKeys("admin1");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"a");
        Thread.sleep(2000);
        driver.findElement(By.id("username")).sendKeys(Keys.CONTROL,"c");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys(Keys.CONTROL,"v");

    }
}
