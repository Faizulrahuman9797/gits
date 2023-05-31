package com.google.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\HotelLogin.feature",glue = "com\\google\\main",dryRun = true)
public class Runner {

}
