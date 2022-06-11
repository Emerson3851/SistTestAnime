import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAnime {

    WebDriver webdriver;

    @BeforeEach
    public void inicio(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        webdriver = new ChromeDriver();
    }

    @Test
    public void abrirPaginaAnime(){ //Abrindo A Página//
        System.setProperty("webDriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        webdriver.manage().window().maximize();

        webdriver.get("https://animesonline.org/");
        Assertions.assertEquals("https://animesonline.org/", webdriver.getCurrentUrl());
    }

    @Test
    public void buttonTest(){ // Clicando No Botão Por Id//
        webdriver.manage().window().maximize();
        webdriver.get("https://animesonline.org/");
        WebElement botao = webdriver.findElement(By.id("searchform"));
    }

    @Test
    public void TestPesquisaAnime() { // Inserindo o nome especificado no campo de Pesquisa do site //
        webdriver.manage().window().maximize();
        webdriver.get("https://animesonline.org/");

        WebElement search = webdriver.findElement(By.id("s"));
        search.sendKeys("Naruto");

    }

    @Test
    public void MovElemtos (){ // Mover o mouse pra um elemento//
        webdriver.manage().window().maximize();
        webdriver.get("https://animesonline.org/");
        Actions actions = new Actions(webdriver);
        WebElement botao = webdriver.findElement(
                By.id("s"));
        actions.moveToElement(botao).perform();
    }

    @AfterEach
    public void finalizando() {
        webdriver.close();
    }

}
