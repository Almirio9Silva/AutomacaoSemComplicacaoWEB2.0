package br.com.chronosAcademy.automacaoWeb;

import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    ChromeDriver driver;

    @Before
    public void inicializaTeste(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chronosacademy.com.br");
    }

    @Test
    public void primeiroTeste() {

        String xpathTitulo = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);
    }

    @Ignore
    @Test
    public void segundoTeste() {

        String xpathSpanButao = "/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[2]/div/div/a/span/span[2]";
        WebElement btnConhecaNossosCursos = driver.findElement(By.xpath(xpathSpanButao));
        btnConhecaNossosCursos.click();

        String xpathDivTitulo = "/html/body/div/div[1]/section[4]/div/div/div/div[1]/div/div";
        WebElement txtDivTitulo = driver.findElement(By.xpath(xpathDivTitulo));
        String titulo = txtDivTitulo.getText();
        assertEquals("Conheça todos os nossos cursos", titulo);
    }

    @After
    public void finalizaTeste(){
        driver.quit();
    }
}
