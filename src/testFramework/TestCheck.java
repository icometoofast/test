package testFramework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int num = 0;//记录异常次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
        Calculator cal = new Calculator();
        //获取字节码对象
        Class<?> aClass = Class.forName("testFramework.Calculator");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        System.out.println("测试开始");
        //判断方法上是否有check注解
        for(Method method:declaredMethods){
            if(method.isAnnotationPresent(Check.class)){
                try{
                    //执行
                    method.invoke(cal);
                } catch (Exception e) {
                    num++;
                    bw.write(method.getName()+"有问题");
                    System.out.println(method.getName()+"有问题");
                    bw.newLine();
                    bw.write(String.valueOf(e.getCause().getClass().getSimpleName()));
                    System.out.println(String.valueOf(e.getCause().getClass().getSimpleName()));
                    bw.newLine();
                    bw.write(e.getCause().getMessage());
                    System.out.println(e.getCause().getMessage());
                    bw.newLine();
                }
            }
        }
        bw.write("测试结束");
        System.out.println("测试结束");
        bw.flush();
        bw.close();
    }

}
