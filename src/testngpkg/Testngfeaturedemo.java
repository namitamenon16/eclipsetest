package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngfeaturedemo {
@BeforeTest
public void setUp() {
	System.out.println("before test method");
}
@BeforeMethod
public void urlloading() {
	System.out.println("before method");
}
@Test(priority = 3)
public void test1() {
	System.out.println("test1");
}
@Test(priority = 1)
public void test2() {
	System.out.println("test2");
}
@Test(priority = 2)
public void test3() {
	System.out.println("test3");
}
@AfterMethod
public void aftermethod() {
	System.out.println("aftermethod");
}
@AfterTest
public void aftertest() {
	System.out.println("aftertest");
}
	


}
