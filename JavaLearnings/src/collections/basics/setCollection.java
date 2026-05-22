package collections.basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class setCollection {
	
	public void failedCases()
	{
		Set<String> failures = new HashSet<>();
		System.out.println(failures.add("Login"));
		failures.add("Cart");
		System.out.println(failures.add("Login"));
		failures.add("Search");
		
		System.out.println(failures);
		
		
	}
	
	public void orderedAPIUniqueAPICalls()
	{
		Set<String> apiCalls = new LinkedHashSet<>();
		apiCalls.add("/login");
		apiCalls.add("/products");
		apiCalls.add("/login");
		apiCalls.add("/cart");
		
		for(String apicall: apiCalls)
		{
			System.out.println("if "+apicall+" exists: "+apiCalls.contains(apicall));
		}
		apiCalls.add("/payment");
		System.out.println(apiCalls);
		
	}
	
	public void environmentSorting()
	{
		TreeSet<String> environments = new TreeSet<>();
		environments.add("prod");
		environments.add("dev");
		environments.add("qa");
		environments.add("stage");
		environments.add("dev");
		System.out.println(environments.descendingSet());
		System.out.println(environments.first());
		System.out.println(environments.last());
		System.out.println(environments.higher("dev"));
		System.out.println(environments.lower("qa"));
		
		
	}
	@Test
	public void dataSet() {
	    failedCases();
	    orderedAPIUniqueAPICalls();
	    environmentSorting();
	}

}
