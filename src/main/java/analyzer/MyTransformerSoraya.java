package analyzer;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyTransformerSoraya implements IAnnotationTransformer {


    @Override
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
       /* IAnnotationTransformer.super.transform(annotation, testClass, testConstructor, testMethod);this
       is the first methode that we overide from iannotationTransformer interface
        */


        annotation.setRetryAnalyzer(RetryAnalyzerSoraya.class);


    }
}
