package br.com.chronosAcademy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CursoPage {
    WebDriver driver;

    public CursoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitulo2() {
        String cssDivTitulo = "div.text-center > div.large-h1";
        WebElement txtDivTitulo = driver.findElement(By.cssSelector(cssDivTitulo));
        String titulo = txtDivTitulo.getText();
        return titulo;
    }
}
