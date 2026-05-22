package arrays;

import java.util.Arrays;

import org.junit.Test;

public class ProductOfArray {
	
//	public int[] productExceptSelf(int[] input)
//	{
//		int product = 1;
//		int[] result = new int[input.length];
//		for(int i =0; i<input.length;i++ )
//		{
//			product = product*input[i];
//		}
//		for(int i =0; i<input.length;i++ )
//		{
//			result[i]=product/input[i];
//		}
//		return result;
//	}

	public int[] productExceptSelf(int[] input)
	{
		
		int[] result = new int[input.length];
		result[0] = 1;
		//Add left products
		for(int i =1; i<input.length;i++ )
		{
			result[i] = result[i-1]*input[i-1];
		}
	
		//Add right products
		int rightProduct = 1;
		for(int i =input.length-1; i>=0;i-- )
		{
			result[i]=result[i]*rightProduct;
			rightProduct = rightProduct*input[i];
			
		}
		return result;
	}


@Test
public void dataSetOne()
{
	int[] array = {1,2,3,4};
	System.out.println(Arrays.toString(productExceptSelf(array)));
}
@Test
public void dataSettwo()
{
	int[] array = {1,2,3,-4};
	System.out.println(Arrays.toString(productExceptSelf(array)));
}
@Test
public void dataSetThree()
{
	int[] array = {2,2,2,2};
	System.out.println(Arrays.toString(productExceptSelf(array)));
}
@Test
public void dataSetFour()
{
	int[] array = {1,2,3,4,0};
	System.out.println(Arrays.toString(productExceptSelf(array)));
}
@Test
public void dataSetFive()
{
	int[] array = {5,2,3,4,1};
	System.out.println(Arrays.toString(productExceptSelf(array)));
}
}
