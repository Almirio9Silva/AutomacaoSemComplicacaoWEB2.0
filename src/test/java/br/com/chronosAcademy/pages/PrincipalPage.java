package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrincipalPage {

    private WebDriver driver;

    public PrincipalPage(WebDriver driver){
        this.driver = driver;
    }

     public String getTitulo() {
        String xpathTitulo = "//section[2]//h4";
        //"/html/body/div/div/div/div/div/section[2]/div[3]/div/div/div/div/div[1]/div/h4";
        WebElement txtTitulo = driver.findElement(By.xpath(xpathTitulo));
        String titulo = txtTitulo.getText();
        return titulo;
    }

    public void clickBotao() {
        String xpathSpanButao = "//section[2]/div[3]//a";
        WebElement btnConhecaNossosCursos = driver.findElement(By.xpath(xpathSpanButao));
        btnConhecaNossosCursos.click();
    }
}
