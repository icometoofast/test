package SeleniumTest.Tpshop.homepage;

import SeleniumTest.Tpshop.annotation.step;
import SeleniumTest.Tpshop.quit.Quit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Tpshop_homepage_test_t {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Tpshop_homepage homepage = new Tpshop_homepage();
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php");
//        Quit quit = new Quit();
        //鼠标悬浮测试
//        homepage.mouthHolder();
        //使用搜索栏
//        homepage.search();
//        Thread.sleep(300);
        homepage.gotoRegAndSubmit(driver);
        homepage.search(driver);
        homepage.buy(driver);




    }
}
