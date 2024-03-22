package bddcomcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeAmbiente {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seubarriga.wcaquino.me/");
	}
}
