package com.nag;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramArrayCode {

	public static void main(String[] args) {
		// String arr[] = { "tea", "ate", "eat", "lol", "oll", "mob" };
		String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<ArrayList<String>> ll = Anagram(words);
		for (ArrayList<String> s : ll)
			System.out.println(s);

	}

	private static List<ArrayList<String>> Anagram(String[] arr) {
		List<ArrayList<String>> wordList = new ArrayList<ArrayList<String>>();
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();

		for (String word : arr) {
			
			int sum = 0;
			for (char c : word.toCharArray())
				sum = sum + c;

			if (map.containsKey(sum)) {
				map.get(sum).add(word);
			} else {
				ArrayList<String> ll = new ArrayList<String>();
				ll.add(word);
				map.put(sum, ll);
			}
		}
		for (ArrayList<String> n : map.values())
			wordList.add(n);
		System.out.println(wordList);
		return wordList;

	}

}
