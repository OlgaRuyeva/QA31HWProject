import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartHWProj {
    WebDriver wd;
    @Test
    public void Start1(){
        wd=new ChromeDriver();
        //wd.get();
        wd.navigate().to("https://gidonline.io/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();

    }
}
