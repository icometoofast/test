package SeleniumTest.Tpshop.annotation;

import org.apache.xalan.templates.ElemEmpty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface step {
    String driver() default "driver";
    String step1() default "lala";
    String step2() default "lala";
    String step3() default "lala";
    String step4() default "lala";
    String step5() default "lala";
    String step6() default "lala";
    String step7() default "lala";


}
