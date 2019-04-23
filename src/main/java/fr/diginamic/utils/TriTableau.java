package fr.diginamic.utils;

import java.util.List;

public class TriTableau {

	
	public static <T extends Comparable<T>> List<T> triTableau(List<T> l){
		
	 l.sort((e1,e2)->e1.compareTo(e2));
	 return l;
		
	}
}
