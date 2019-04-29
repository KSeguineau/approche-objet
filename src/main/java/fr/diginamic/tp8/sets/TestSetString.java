package fr.diginamic.tp8.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetString {

	public static String plusLong(Set<String> set) {
		Iterator<String> it = set.iterator();
		String plusLong = "";

		while (it.hasNext()) {
			String tmp = it.next();
			if (tmp.length() > plusLong.length()) {
				plusLong = tmp;
			}
		}
		return plusLong;
	}

	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<>();
		hashset.addAll(Arrays.asList("USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"));

		System.out.println(plusLong(hashset));
		System.out.println(hashset);
	}

}
