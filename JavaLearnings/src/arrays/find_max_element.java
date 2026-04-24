package arrays;

import org.junit.Test;

public class find_max_element {

	@Test
	public void datasetOne()
	{
		int[] array = {-9,30,4943543,34};
		System.out.println(maxElement(array));
		System.out.println(sum(array));
	}
	
	
	
	//Bruteforce
	public int maxElement(int[] array)

	{
		if (array == null || array.length == 0)
	    {
	        throw new IllegalArgumentException("Array must not be null or empty");
	    }

		int max = Integer.MIN_VALUE ;
		for (int i =0;i<array.length;i++)
		{
			max = Integer.max(max,array[i]);
		}
		return max;
	}
	
	public int sum(int[] array)
	{
		if (array == null)
	    {
	        throw new IllegalArgumentException("Array must not be null");
	    }
	    
		int sum = 0;
		for (int i =0;i<array.length;i++)
		{
			sum += array[i];
		}
		return sum;
	}
}
