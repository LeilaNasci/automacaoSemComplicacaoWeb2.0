package br.com.chronosacademy.automacaoWeb;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TesteWeb {
	@Test
	public void primeiroTeste() {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chronosacademy.com.br/");
		String txtTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
		WebElement h4Titulo = driver.findElement(By.xpath(txtTitulo));
		String titulo = h4Titulo.getText();
		assertEquals("Porque Tempo É Conhecimento", titulo);
		driver.quit();
	
	}                                           
	

}
