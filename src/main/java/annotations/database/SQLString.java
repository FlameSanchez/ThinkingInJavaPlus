//: annotations/database/SQLString.java
package annotations.database;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
  int value() default 0;
  String name() default "";
  Constraints constraints() default @Constraints;
//  @Target(ElementType.FIELD)
//  @Retention(RetentionPolicy.RUNTIME)
//  @interface Constraints {
//    boolean primaryKey() default false;
//    boolean allowNull() default true;
//    boolean unique() default false;
//  }
} ///:~
