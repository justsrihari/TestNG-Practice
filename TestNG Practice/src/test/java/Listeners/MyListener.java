package Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class MyListener implements ITestListener, IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setInvocationCount(2);
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Start");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Success");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("On Test Failure");
	}

	// addedd a comment

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("On Start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}

}
