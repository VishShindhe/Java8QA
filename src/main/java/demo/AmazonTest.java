package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.co.in");
        /* Older way
        String mytext;
        List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
        List<String> text = new ArrayList<>();
        Set<String> uniqueLinks2 = new TreeSet<String>();
        for(WebElement link: allLinks){
            mytext = link.getText();
            if(!mytext.isBlank()){
                text.add(mytext);
                uniqueLinks2.add(mytext);
            }
        }
        Set<String> uniqueLinks = new HashSet<String>(text);
        for(String s: uniqueLinks2){
            if(s.startsWith("C") || s.startsWith("D")){
                System.out.println(s);
            }
        }*/
        //uniqueLinks2.forEach(System.out::println);

        // JAVA 8 WAY
        driver.findElements(By.xpath("//a")).stream()
                .map(WebElement::getText)
                .filter(s->!s.isBlank())
                .distinct()
                .sorted()
                .filter(s->s.startsWith("C") || s.startsWith("D"))
                .forEach(System.out::println);
//e->e.getText()
        driver.quit();
    }
}
