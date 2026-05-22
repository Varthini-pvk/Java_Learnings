package collections.basics;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AutomationRetrySystem {
	
	public void retryCases(String[] failedCaseIds)
	{
		List<String> retryCases = new ArrayList<>(100);
		for (int i=0;i<failedCaseIds.length;i++)
		{
			if(!retryCases.contains(failedCaseIds[i])) retryCases.add(failedCaseIds[i]);
		}
		retryCases.add(2, "TC99");
		retryCases.remove("TC03");
		if(retryCases.indexOf("TC05")!= -1) retryCases.set(retryCases.indexOf("TC05"), "TC05_RETRY");
		System.out.print(retryCases);
		
		
	}
	
	@Test
	public void dataSet()
	{
		String[] TC = {"TC01", "TC02", "TC03", "TC02", "TC05"};
		retryCases(TC);
	}
	

}
