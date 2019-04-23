package sxf.term.androidadvancelight.annotation.run;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author by sunzhongda
 * @date 2019/4/10
 */
public class RunAnnotationProcess {

    @Test
    public void AnnotationProcess() {
        Method[] declaredMethods = AnnotationTest.class.getDeclaredMethods();

        for (Method method : declaredMethods) {
            Get get = method.getAnnotation(Get.class);
            System.out.println(get.value());
        }
    }
}
