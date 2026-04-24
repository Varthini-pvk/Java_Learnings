package samples.oops;

public class Chrome implements WebDriver {

@Override
public void get(String url)
{
    System.out.println("launched the browser in chrome");
}

 
@Override
public String findElement(String Selector){
    String element  =  Selector;
    System.out.println("Element found in chrome");
    return element ;

}
 
@Override
public void close(){

System.out.println("Browser closed in chrome");

}
}
