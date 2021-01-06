package annotation;


import entities.Students;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@annoDemo1(className = "entities.Students",methodName = "study")
public class useAnnotation {
 //   @annoDemo1
    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> aClass = Class.forName("annotation.useAnnotation");
        annoDemo1 annotation = aClass.getAnnotation(annoDemo1.class);
        String className = annotation.className();
        String methodName = annotation.methodName();

        //创建反射
        Class<?> aClass1 = Class.forName(className);
        Method method = aClass1.getMethod(methodName);
        method.setAccessible(true);
        Students std = new Students();
        method.invoke(std);



    }

}
