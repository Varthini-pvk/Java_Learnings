package collections.basics;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class BrowserNavigationHsitory {
	
	public void browserHistory(String[] navigatedPages)
	{
		LinkedList<String> history = new LinkedList<>();
		for (int i=0;i<navigatedPages.length;i++)
		{
			history.add(navigatedPages[i]);
		}
		history.addFirst("OPEN_BROWSER");
		history.addLast("CLOSE_BROWSER");
		history.remove("SEARCH");
		
		Iterator<String> display =  history.iterator();
		while (display.hasNext())
		{
			System.out.print(display.next());
		}
		
		Iterator<String> rdisplay =  history.descendingIterator();
		while (rdisplay.hasNext())
		{
			System.out.print(rdisplay.next());
		}

		
		
	}
	
	@Test
	public void dataSet()
	{
		String[] TC = {"LOGIN", "SEARCH", "ADD_TO_CART", "PAYMENT"};
		browserHistory(TC);
	}

}
