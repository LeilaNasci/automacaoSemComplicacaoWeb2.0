package br.com.chronosacademy.automacaoWeb;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TesteWeb {
	
	WebDriver driver;
	
	@Before
	public void inicializaTeste() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.chronosacademy.com.br/");
		
	}
	
	
	@Test
	public void primeiroTeste() {
		
		String txtTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
		WebElement h4Titulo = driver.findElement(By.xpath(txtTitulo));
		String titulo = h4Titulo.getText();
		assertEquals("Porque Tempo É Conhecimento", titulo);
		
		
	}  
	
	@Test
	public void segundoTeste() {
		
		String xpathBotao = "//*[text()=\"Conheça Nossos Cursos\"]";
		WebElement btnTitulo = driver.findElement(By.xpath(xpathBotao));
		btnTitulo.click();
		String txtTitulo = "//*[text()=\"AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0\"]";
		WebElement h2Titulo = driver.findElement(By.xpath(txtTitulo));
		String titulo = h2Titulo.getText();
		assertEquals("AUTOMAÇÃO SEM COMPLICAÇÃO WEB 2.0", titulo);
	
		
		
	}  
	
	@After
	public void fechar() {
		driver.quit();	
		
	}
	

}
