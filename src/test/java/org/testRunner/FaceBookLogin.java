package org.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\src\\test\\resources\\fab2.feature"
,glue="org.step",monochrome=true,tags="not @smoke" )
//plugin="junit:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\scenario.xml"
//plugin="html:C:\\Users\\ELCOT\\eclipse-workspace\\Cucumber\\target\\scnar")
public class FaceBookLogin {

}
