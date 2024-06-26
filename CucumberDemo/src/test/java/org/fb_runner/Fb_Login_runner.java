package org.fb_runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	
	//feature folder location            stepdef package name
	@CucumberOptions(features="src\\test\\java\\facebook.feature", glue="org.stepdef")
	
	public class Fb_Login_runner {

    //static ...... classname.method name or variable name
		public static WebDriver driver;
		
		@BeforeClass
		public static void start() {
			driver=new ChromeDriver();
		}
	
	
}
