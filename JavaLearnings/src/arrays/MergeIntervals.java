package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
	
	public int[][] mergeIntervals(int[][] array)
	
	{
		
		if(array == null || array.length == 0)
	    {
	        return new int[0][];
	    }

		Arrays.sort(array,(a,b) -> Integer.compare(a[0],b[0]));
		int currentStart = array[0][0];
		int currentEnd = array[0][1];
		ArrayList<int[]> result = new ArrayList<>();
		
		for(int i =1; i<array.length;i++)
		{ 
			
			int nextStart= array[i][0];
			int nextEnd = array[i][1];
			
			if(nextStart<=currentEnd)
			{
				currentEnd = Math.max(currentEnd, nextEnd);
			}
			else
			{
				result.add(new int[] {currentStart,currentEnd});
				currentStart = nextStart;
				currentEnd = nextEnd;
			}
			
		}

		result.add(new int[] {currentStart,currentEnd});
	
		return result.toArray(new int[result.size()][]);
	}

}
