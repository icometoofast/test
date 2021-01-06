package relection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class testReflection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IOException {
        Class<?> persons = Class.forName("entities.Person");
        personRelection pr = new personRelection();
        pr.showPersonPublicValue(persons);
        pr.showPersonValue(persons);
        pr.showPublicConstructor(persons);
        pr.showAllConstructor(persons);
        pr.operatePublicValueName(persons);
        pr.operatePrivateValueAge(persons);
        pr.useMethod(persons);
        pr.useMethodWithValue(persons);
        pr.useMethodWithPro();
        pr.useAnnotation();
        pr.test(persons);

    }
}
