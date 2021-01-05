import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class IleanaFakeJunit {

    private static final Logger log = Logger.getLogger(IleanaFakeJunit.class);

    public static void main(String[] args) throws Exception {
        Class<?> testClass = Class.forName("com.github.snowhite93.stringholder.StringHolderTest");
        log.info("Loaded " + testClass);

        Method[] declaredMethods = testClass.getDeclaredMethods();
        Constructor<?> testClassConstructor = testClass.getConstructor();

        List<Method> beforeAllMethods = new ArrayList<>();
        List<Method> beforeEachMethods = new ArrayList<>();
        List<Method> testMethods = new ArrayList<>();

        log.info("---");
        log.info("Identifying methods...");
        for (Method declaredMethod : declaredMethods) {
            String methodName = declaredMethod.getName();
            if (declaredMethod.isAnnotationPresent(BeforeAll.class)) {
                log.info("Identified before all method " + methodName);
                beforeAllMethods.add(declaredMethod);
            } else if (declaredMethod.isAnnotationPresent(BeforeEach.class)) {
                beforeEachMethods.add(declaredMethod);
                log.info("Identified before each method " + methodName);
            } else if (declaredMethod.isAnnotationPresent(Test.class)) {
                testMethods.add(declaredMethod);
                log.info("Identified test method " + methodName);
            } else {
                log.warn("Unidentified method present " + methodName);
            }
        }

        log.info("---");
        for (Method beforeAllMethod : beforeAllMethods) {
            log.info("Invoking before all method " + beforeAllMethod.getName());
            beforeAllMethod.invoke(null);
        }

        for (Method testMethod : testMethods) {
            log.info("---");
            String testMethodName = testMethod.getName();
            log.info("Preparing new test " + testMethodName);
            Object newTestClass = testClassConstructor.newInstance();

            for (Method beforeEachMethod : beforeEachMethods) {
                beforeEachMethod.invoke(newTestClass);
            }

            log.info("Executing test " + testMethodName);
            try {
                // actually invoke test method
                testMethod.invoke(newTestClass);
                log.info("Test " + testMethodName + " passed!");
            } catch (InvocationTargetException ex) {
                log.error("Test " + testMethodName + " failed to execute: " + ex.getTargetException().getMessage());
            }

        }

    }


}
