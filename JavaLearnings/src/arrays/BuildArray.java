package arrays;

import java.util.Arrays;

import org.junit.Test;

public class BuildArray {

	@Test
	public void dataSetOne()
	{
		int[] array = {0,2,1,5,3,4};
		buildNewArray(array);
	}
	
	@Test
	public void dataSetTwo()
	{
		int[] array = {5,0,1,2,3,4};
		buildNewArray(array);
	}
	
	
	public void buildNewArray(int[] input)
	
	{
		int[] result = new int[input.length];
		for (int i=0; i<input.length; i++)
		{
			result[i]= input[input[i]];
		}
		
		System.out.println(Arrays.toString(result));
	}

}
