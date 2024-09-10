package annotations.test;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationFieldTest {

    String value() default "a";
//    int values() default 0;
    String name() default "";
}
