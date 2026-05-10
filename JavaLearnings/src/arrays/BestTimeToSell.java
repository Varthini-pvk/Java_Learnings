package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class BestTimeToSell {
	
	
	public int bestTimetoBuyandSell(int[] array)
	{
		
		if(array == null || array.length < 2)
		{
		    return 0;
		}
		int buyDayPrice = array[0];
		int maxProfit = 0;
		
		for(int i=1; i<array.length;i++)
		{
			buyDayPrice = Math.min(buyDayPrice, array[i]);
			maxProfit =  Math.max(maxProfit, array[i]-buyDayPrice);
			
		}
		return maxProfit;
		
	}

	
	@Test
	public void dataSetOne() {
	int[] ds = {1,1,2,3,3,4,5};
    assertEquals(4, bestTimetoBuyandSell(ds));

	}
	@Test
	public void dataSetTwo() {
	int[] ds = {7,6,5,4};
    assertEquals(0, bestTimetoBuyandSell(ds));

	}
	
	@Test
	public void dataSetThree() {
	int[] ds = {};
    assertEquals(0, bestTimetoBuyandSell(ds));

	}
	
	@Test
	public void dataSetFour() {
	int[] ds = {3,3,3};
    assertEquals(0, bestTimetoBuyandSell(ds));

	}
}
