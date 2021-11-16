package com.runner.com;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.com.Baseclass;
import com.helper.com.FileReaderManager;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature\\com",glue = "com.stepdefenition.com",
                monochrome=true,
                strict=false,		
                plugin={"pretty","html:Report3","json:Report1","junit:Report2"
                		})
                
public class AdactinRunner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException {
		String browser = FileReaderManager.getInstanceCR().getBrowser();
     driver = Baseclass.Launchbrowser(browser);
	}
	
	

}
