package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
features = {"D:\\eclipse\\LinkedIn\\Sign.feature"},
glue = {"StepDefination"},
dryRun = false,
monochrome= true,
publish= true,
plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

		
public class Runnersignin {

}


