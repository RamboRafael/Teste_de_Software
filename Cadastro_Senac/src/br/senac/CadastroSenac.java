package br.senac;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CadastroSenac {
	
	WebDriver driver;
	
	@Before
	
	public void iniciar() {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://portal.senacrs.com.br/meusenac_login.asp");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		WebElement btnCad = driver.findElement(By.xpath("/html/body/div[5]/div[7]/div[3]/div/div[1]/form/div/div[4]/div[2]/a"));
		btnCad.click();
		
		Thread.sleep(5000);
		WebElement txtNome = driver.findElement(By.xpath("//*[@id=\"nome\"]"));
		txtNome.sendKeys("Rafael");
		
		WebElement radSex = driver.findElement(By.xpath("/html/body/div[5]/div[7]/div[3]/div/div[2]/form/div/div[2]/div[1]/div[3]/div[2]/div[2]"));
		radSex.click();
		
		WebElement txtDDD = driver.findElement(By.id("ddd"));
		txtDDD.sendKeys("51");
		
		WebElement txttelefone = driver.findElement(By.id("telefone"));
		txttelefone.sendKeys("65656565");
		
		WebElement selEstado = driver.findElement(By.id("uf"));
		selEstado.sendKeys(Keys.ARROW_UP);
		//selEstado.sendKeys(Keys.ARROW_DOWN);
		//selEstado.sendKeys(Keys.ARROW_DOWN);
		//selEstado.sendKeys(Keys.ARROW_DOWN);
		//selEstado.sendKeys(Keys.ARROW_DOWN);
		//selEstado.sendKeys(Keys.ENTER);
		selEstado.sendKeys("RIO GRANDE DO SUL");
		
		WebElement selCid = driver.findElement(By.id("cidade"));
		selCid.sendKeys("PORTO ALEGRE");
		
		WebElement txtData = driver.findElement(By.id("dataNascimento"));
		txtData.sendKeys("07091997");
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Rafael@email.com");
		
		WebElement txtSenha = driver.findElement(By.id("senha"));
		txtSenha.sendKeys("senha123");
		
		WebElement txtCpf = driver.findElement(By.id("cpf"));
		txtCpf.sendKeys("99999999999");
		
		WebElement btnCadastrar = driver.findElement(By.xpath("/html/body/div[5]/div[7]/div[3]/div/div[2]/form/div/div[3]/div[1]/a"));
		btnCadastrar.click();		
		
	
		
	}

}
