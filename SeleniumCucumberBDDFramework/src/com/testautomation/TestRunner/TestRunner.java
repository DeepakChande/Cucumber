package com.testautomation.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions (
        features = "./features"
        ,glue = {"com.testautomation.StepDef"}
        ,tags = {"@Youtube"}
        ,monochrome = true)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {    	
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "features")    
    public void feature(CucumberFeatureWrapper cucumberFeature) {
    	testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	//testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
    }
    
    @DataProvider//(parallel=true)
    public Object[][] features() {
       return testNGCucumberRunner.provideFeatures();    	
    	 //return testNGCucumberRunner.provideScenarios();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}