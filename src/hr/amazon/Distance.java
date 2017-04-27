package hr.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Distance {

	public static void main(String... args) {
		String[] words = { "dd", "cc", "aa", "bb", "cc", "dd", "ee", "aa", "dd", "cc", "aa", "cc", "bb", "cc", "dd",
				"aa", "ee", "aa", "cc" };
		
		List<String> l = Arrays.asList(words);
		int limit = 4;

		distance(l, limit);
	}

	public static void distance(List<String> words, int limit) {

		Map<String, Integer> map = new HashMap<>();
		
		Map<String, Integer> result = new TreeMap<>();

		for (int i = 0; i < words.size(); i++) {
			if (map.containsKey(words.get(i))) {
				
				if (result.get(words.get(i)).intValue() > i - map.get(words.get(i)).intValue() && i - map.get(words.get(i)).intValue() <= limit){
					result.put(words.get(i), i - map.get(words.get(i)).intValue());
				}
				map.put(words.get(i), i);

			} else {
				map.put(words.get(i), i);
				result.put(words.get(i), Integer.MAX_VALUE);
			}
		}
		

		Iterator<Entry<String, Integer>> it = result.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> a = it.next();
			
			if(a.getValue() < Integer.MAX_VALUE)
				System.out.println(a.getKey() + " " + a.getValue());
		}

	}

}
