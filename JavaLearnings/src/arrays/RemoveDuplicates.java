package arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicates {
	
	public int[] removeDuplicates(int[] array)
	{
		 if (array == null || array.length == 0) 
		 {
		        return new int[0];
		 }
		ArrayList<Integer> result = new ArrayList<>();
		result.add(array[0]);
		int arrayPointer = 1;
		while(arrayPointer<array.length)
		{
			if(result.get(result.size() - 1)!=array[arrayPointer])
			{
				result.add(array[arrayPointer]);
				
			}
			arrayPointer++;
				
				
		}
		return result.stream().mapToInt(Integer::intValue).toArray(); 
	}
	
	public int countUnique(int[] array)
	{
		 if (array == null || array.length == 0) 
		 {
		        return 0;
		 }
		int readPointer =1;
		int writePointer = 1;
		while(readPointer<array.length)
		{
			if(array[readPointer]!=array[readPointer-1])
			{
				array[writePointer]=array[readPointer];
				writePointer++;
				
			}
			readPointer++;
				
				
		}
		return writePointer; 
	}
	
	
	@Test
	public void dataSetOne() {
	int[] ds = {1,1,2,3,3,4,5};
	int validLength = countUnique(ds);

    assertEquals(5, validLength);

    assertArrayEquals(
        new int[]{1,2,3,4,5},
        Arrays.copyOf(ds, validLength)
    );
	}

}
