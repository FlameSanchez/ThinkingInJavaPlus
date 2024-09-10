package annotations.test;

import annotations.database.DBTable;
import annotations.database.Member;
import annotations.database.SQLInteger;
import annotations.database.SQLString;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

import static net.mindview.util.Print.*;

public class AnnotationReflection {


    public static void main(String[] args) {
        DBTable dbTable = MyTest1.class.getAnnotation(DBTable.class);

        DBTable dbTable1 = MyTest1.class.getDeclaredAnnotation(DBTable.class);

        for (Field field : Member.class.getDeclaredFields()) {
            System.out.println(field);

            Annotation[] annotations = field.getDeclaredAnnotations();
            System.out.println(Arrays.toString(annotations));

        }

//        System.out.println(dbTable.equals(dbTable1));
//
//        SQLString sqlString = Member.class.getAnnotation(SQLString.class);


    }
}
