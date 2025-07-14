package javapractices;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharacterCoutFromGivenString {

	public static void main(String[] args) {

		String s = "Welcome to codemind";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (!(map.containsKey(s.charAt(i)))) {
				map.put(s.charAt(i), 1);
			}

			else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}

		Set<Entry<Character, Integer>> ent = map.entrySet();

		for (Entry<Character, Integer> e : ent) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
