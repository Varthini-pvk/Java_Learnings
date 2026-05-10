package stringAndregex;

import java.util.Arrays;
import java.util.HashMap;

public class P003_anagram {

	public boolean isValidAnagram_1(String one, String two)
	{
		if (one.length()!=two.length()) return false;
		char[] a = one.toCharArray();
		char[] b = two.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		return Arrays.equals(a,b);
	}
	
	public boolean isValidAnagram_2(String one, String two)
	
	{
		if (one.length()!=two.length()) return false;
		char[] a = one.toCharArray();
		char[] b = two.toCharArray();
		
		HashMap<Character,Integer> frequencyOne = new HashMap<>();
		for (int i=0; i<one.length();i++)
		{
			frequencyOne.put(a[i],frequencyOne.getOrDefault(a[i], 0)+1);
			frequencyOne.put(b[i],frequencyOne.getOrDefault(b[i], 0)-1);
		}
		
		for(int count : frequencyOne.values())
		{
			if (count!=0) return false;
		}
		return true;
		
	}
}
