package TestClasses;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}

	@Test
	public void test4() {
		System.out.println("test4");
	}

	@Test
	public void test5() {
		System.out.println("test5");
	}

	@Test
	public void test6() {
		System.out.println("test6");
	}

	@Test
	public void test7() {
		System.out.println("test7");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		// Get the class name
		String className = result.getTestClass().getName();

		// Get the method name
		String methodName = result.getMethod().getMethodName();

		// Print class name and method name
		System.out.println("Class Name: " + className+"Method Name: " + methodName);
	}
}
