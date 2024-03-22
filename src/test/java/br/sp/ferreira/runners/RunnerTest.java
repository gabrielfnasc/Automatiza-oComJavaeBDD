package br.sp.ferreira.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
                 tags = {"~@ignore"},
                 glue = "br.sp.ferreira.steps",
                 plugin = "pretty", 
                 monochrome = true, 
                 snippets = SnippetType.CAMELCASE,
                 strict = true,
                 dryRun = false

)

public class RunnerTest {
	
	@BeforeClass
	public static void reset() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
		driver.findElement(By.id("email")).sendKeys("gabriel@ferreira");
		driver.findElement(By.id("senha")).sendKeys("123");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}

}