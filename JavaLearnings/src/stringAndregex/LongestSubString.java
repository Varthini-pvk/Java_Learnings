package stringAndregex;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubString {
	
	public String longestSubStringNoRepeatation(String input)
	{
		if (input == "") return "";
		int startIndex = 0;
		int maxLength = 0;
		int left = 0;
		Set<Character> set = new HashSet<>();
		for(int right =0; right<input.length(); right++)
		{
			char current = input.charAt(right);
			while(set.contains(current))
			{
				set.remove(input.charAt(left));
				left++;
			}
			set.add(current);
			int currentLength = right-left+1;
			if(maxLength<currentLength)
			{
				maxLength = currentLength;
				startIndex = left;
			}
		}
		return input.substring(startIndex, startIndex+maxLength);
	}
	
	@Test
	public void dataSetOne()
	{
		String input="abcdefgadffg";
		System.out.println("One: "+longestSubStringNoRepeatation(input));
	}
	
	@Test
	public void dataSetTwo()
	{
		String input="1111111";
		System.out.println("Two: "+longestSubStringNoRepeatation(input));
	}
	
	@Test
	public void dataSetThree()
	{
		String input="";
		System.out.println("Three: "+longestSubStringNoRepeatation(input));
	}
	
	@Test
	public void dataSetFour()
	{
		String input="abdcfreght";
		System.out.println("Four: "+longestSubStringNoRepeatation(input));
	}
	
	@Test
	public void dataSetFive()
	{
		String input="abdcfreghta";
		System.out.println("Five: "+longestSubStringNoRepeatation(input));
	}
	
	@Test
	public void dataSetSix()
	{
		String input="abdraeaghtxyc";
		System.out.println("Six: "+longestSubStringNoRepeatation(input));
	}

}



