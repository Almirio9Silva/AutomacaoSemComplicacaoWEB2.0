package br.com.chronosAcademy.automacaoWeb;

import br.com.chronosAcademy.core.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteWeb {
    WebDriver driver;
    Driver driverWeb;

    @Before
    public void inicializaTeste() {
        driverWeb = new Driver("CHROME");
        driver = driverWeb.getDriver();
        driver.get("https://www.chronosacademy.com.br");

    }


    @Test
    public void primeiroTeste() {

        String xpathTitulo = "//section[2]//h4";
                //"/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        assertEquals("Porque Tempo É Conhecimento", titulo);
    }

    //@Ignore
    @Test
    public void segundoTeste() {

        String xpathSpanButao = "//div[3]/div/div/div/div/div[2]//span[2]";
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
