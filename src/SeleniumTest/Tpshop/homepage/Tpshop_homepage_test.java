package SeleniumTest.Tpshop.homepage;

import SeleniumTest.Tpshop.annotation.step;
import SeleniumTest.Tpshop.quit.Quit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Driver;

@step( step1 = "search", step2 = "gotoRegAndSubmit",step3 = "quit",driver = "driver")
public class Tpshop_homepage_test {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Tpshop_homepage homepage = new Tpshop_homepage();
        WebDriver driver = new ChromeDriver();
        driver.get("http://47.105.64.182/index.php");
        Quit quit = new Quit();
        //鼠标悬浮测试
//        homepage.mouthHolder();
        //使用搜索栏
//        homepage.search();
//        Thread.sleep(300);
//        homepage.gotoRegAndSubmit(driver);
        Class<?> aClass = Tpshop_homepage_test.class;
        step step = aClass.getAnnotation(step.class);
        String step1 = step.step1();
        String step2 = step.step2();
        String step3 = step.step3();
        String step4 = step.step4();
        String step5 = step.step5();
        String step6 = step.step6();
        String step7 = step.step7();
        String driver1 = step.driver();
        Class<?> aClass1 = Tpshop_homepage.class;
        Object o = aClass1.newInstance();
        Method step11 = aClass1.getMethod(step1,WebDriver.class);
        Method step12 = aClass1.getMethod(step2,WebDriver.class);
        Method step13 = aClass1.getMethod(step3,WebDriver.class);
        Method step14 = aClass1.getMethod(step4);
        Method step15 = aClass1.getMethod(step5);
        Method step16 = aClass1.getMethod(step6);
        Method step17 = aClass1.getMethod(step7);
        step11.invoke(o,driver);
        step12.invoke(o,driver);
        step13.invoke(o,driver);
        step14.invoke(o);



    }
}
