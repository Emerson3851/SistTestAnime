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
    public void PagAnime(){
        webdriver.get("https://animesonline.org/");
        Assertions.assertEquals("https://animesonline.org/", webdriver.getCurrentUrl());
    }

    @Test
    public void abrirPaginaAnime(){
        System.setProperty("webDriver.chrome.driver","src\\test\\resources\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://animesonline.org/");
        Assertions.assertEquals("https://animesonline.org/", webDriver.getCurrentUrl());
    }

    @Test
    public void buttonTest(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://animesonline.org/");
        WebElement botao = webDriver.findElement(By.id("searchform"));
    }

    @Test
    public void TestPesquisaAnime() {
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://animesonline.org/");

        WebElement search = webDriver.findElement(By.id("s"));
        search.sendKeys("Naruto");

    }

    @Test
    public void abrirPaginaTest (){
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://animesonline.org/");
        Actions actions = new Actions(webDriver);
        WebElement botao = webDriver.findElement(
                By.id("s"));
        actions.moveToElement(botao).perform();
    }


}
