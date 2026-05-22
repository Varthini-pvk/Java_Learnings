package collections.basics;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PollingTimes {
		
		public void pollingtimes(int[] times)
		{
			List<Integer> pollingTimes = new ArrayList<>();
			
			for (int i=0;i<times.length;i++)
			{
				pollingTimes.add(times[i]);
			}
		
			pollingTimes.add(1,750);
			
			int start = 0;
			int end = pollingTimes.size()-1;
			while(start<end)
			{
				int temp = pollingTimes.get(start);
				pollingTimes.set(start, pollingTimes.get(end));
				pollingTimes.set(end, temp);
				start++;
				end--;
				
			}
			int total = 0;
			for(Integer time:pollingTimes )
			{
				total = total+time;
			}
			int average = total/pollingTimes.size();
			List<Integer> immutable = List.copyOf(pollingTimes);
		
		}
		
		@Test
		public void dataSet()
		{
			int[] dc = {500, 1000, 1500, 2000};
			pollingtimes(dc);
		}

	}

