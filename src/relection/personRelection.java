package relection;

import annotation.annoDemo1;
import entities.Person;
import entities.Students;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Properties;



@annoDemo1(className = "entities.Person",methodName = "eat")
public class personRelection {

 //       Class<Students> students1 = Students.class;
 //       Students student = new Students();
 //       Class<?> students2 = student.getClass();
 //       System.out.println(students1 == students2);
    public  void showPersonPublicValue(Class<?> persons) {
        Field[] personfields = persons.getFields();
        System.out.println("==========person的public属性为==========");
        for (Field personfield : personfields) {
            System.out.println(personfield);
        }
    }
    public void showPersonValue(Class<?> persons) {
        System.out.println("==========person的所有属性为==========");
        Field[] persondeclaredFields = persons.getDeclaredFields();
        for (Field field : persondeclaredFields) {
            System.out.println(field);
        }
    }
    public void operatePublicValueName(Class<?> persons) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        System.out.println("==========person的public属性name的操作==========");
        Object o = persons.newInstance();
        Field name = persons.getDeclaredField("name");
        name.set(o, "zhenfei.wang");
        System.out.println(name.get(o));
    }
    public void operatePrivateValueAge(Class<?> persons) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        System.out.println("==========person的private属性age的操作==========");
        Object o = persons.newInstance();
        Field age = persons.getDeclaredField("age");
        age.setAccessible(true);
        age.set(o, 20);
        System.out.println(age.get(o));
    }

//        System.out.println("==========students的父类的所有属性为==========");
//        Field[] studentsuperdeclaredFields = students1.getSuperclass().getDeclaredFields();
//        for(Field ssdf : studentsuperdeclaredFields){
//            System.out.println(ssdf);
//        }
    public void showPublicConstructor(Class<?> persons) {
        System.out.println("==========person的public构造方法为===========");
        Constructor<?>[] constructors = persons.getConstructors();
        for (Constructor cons : constructors) {
            System.out.println(cons);


        }
    }
    
    public void showAllConstructor(Class<?> persons) {
        System.out.println("==========person的所有构造方法为===========");
        Constructor<?>[] declaredconstructors = persons.getDeclaredConstructors();
        for (Constructor cons : declaredconstructors) {
            System.out.println(cons);

        }
    }
    
    public void useMethod(Class<?> persons) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        System.out.println("==========person的无参方法为===========");
        Method eat = persons.getMethod("eat");
        Object o = persons.newInstance();
        eat.invoke(o);
    }


    public void useMethodWithValue(Class<?> persons) throws NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException {
        System.out.println("==========person的方法为===========");
        Method hasmoney = persons.getDeclaredMethod("hasmoney", String.class, int.class);
        hasmoney.setAccessible(true);
        Object o = persons.newInstance();
        Field name = persons.getField("name");
        name.set(o,"zhenfei.wang");
        Object invoke = hasmoney.invoke(o, name.get(o), 3000);
        System.out.println(invoke.toString());
    }

    public void useMethodWithPro() throws IOException, ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("==========通过配置文件来运行系统==========");
        Properties pro = new Properties();
        Class<? extends Class> aClass = testReflection.class.getClass();
//        ClassLoader classLoader = aClass.getClassLoader();
//        String path = Thread.currentThread().getContextClassLoader().getResource("pro.properties").getPath();
//        System.out.println(path);
//        InputStream resourceAsStream = classLoader.getResourceAsStream("/Users/zhengfei.wang/IdeaProjects/lalala/out/production/lalala/pro.properties");
//        pro.load(resourceAsStream);
//        System.out.println(pro.toString());
        //找到配置文件
        String path = Thread.currentThread().getContextClassLoader().getResource("pro.properties").getPath();
        path = URLDecoder.decode(path, "UTF-8");
        FileInputStream in = new FileInputStream(path);
        pro.load(in);
        System.out.println(pro.toString());
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");
        String name = pro.getProperty("name");
        int money = Integer.valueOf(pro.getProperty("money"));

        //创建反射
        Class<?> className1 = Class.forName(className);
        Field name1 = className1.getField("name");
        Object o = className1.newInstance();
        name1.setAccessible(true);
        name1.set(o,name);
        Method method = className1.getDeclaredMethod(methodName,String.class,int.class);
        method.setAccessible(true);
        Object invoke = method.invoke(o, name1.get(o), money);

        System.out.println(invoke.toString());



    }

    public void useAnnotation() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> pr = Class.forName("relection.personRelection");
        annoDemo1 annotation = pr.getAnnotation(annoDemo1.class);
        String className = annotation.className();
        String methodName = annotation.methodName();
        Class<?> aClass = Class.forName(className);
        Method method = aClass.getMethod(methodName);
        Object o = aClass.newInstance();
        method.invoke(o);


    }
    public void test(Class<?> persons) throws NoSuchMethodException, IllegalAccessException, InstantiationException, NoSuchFieldException, InvocationTargetException {
        System.out.println("==========testtttttttt===========");
        Method hasmoney = persons.getDeclaredMethod("hasmoney", String.class, int.class);
        hasmoney.setAccessible(true);
//        Object o = persons.newInstance();
        Person person = new Person();
        Field name = persons.getField("name");
        name.set(person,"zhenfei.wang");
        Object invoke = hasmoney.invoke(person, name.get(person), 3000);
        System.out.println(invoke.toString());
    }

}
