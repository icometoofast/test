package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhenfei.wang
 */

@annoDemo1(className = "entities.Students", methodName = "study")
public class testAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> aClass = Class.forName("annotation.testAnnotation");
        annoDemo1 annotation = aClass.getAnnotation(annoDemo1.class);
        String className = annotation.className();
        String methodName = annotation.methodName();

        Class<?> aClass1 = Class.forName(className);
        Object o = aClass1.newInstance();
        Method method = aClass1.getMethod(methodName);
        method.invoke(o);
        useAnnotation use = new useAnnotation();
        use.test();

    }
}
