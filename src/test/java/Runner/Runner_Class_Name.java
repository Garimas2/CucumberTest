package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="com.csg.taucucumber.Cucumber_Project")

public class Runner_Class_Name {

}
