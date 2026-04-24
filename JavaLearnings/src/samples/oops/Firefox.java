package samples.oops;

public class Firefox implements WebDriver {

@Override
public void get(String url)
{
    System.out.println("launched the browser in firefox");
}

 
@Override
public String findElement(String Selector){
    String element  =  Selector;
    System.out.println("Element found in firefox");
    return element ;

}
 
@Override
public void close(){

System.out.println("Browser closed in firefox");

}
}
