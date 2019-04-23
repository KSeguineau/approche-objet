package fr.diginamic.operations;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculMoyenne {

	List<Double> tab;

	
	public CalculMoyenne(int a){
		if(a>=0){
		tab = new ArrayList<>(a);
		}
		else{
			tab = new ArrayList<>(-a);
			System.out.println("valeur négative");
		}
	}
	
	public void ajout(double d){
		tab.add(d);
	}
	
	public double calcul(){
		double tmp=0;
		for (int i = 0; i < tab.size(); i++) {
			tmp += tab.get(i);
		}
		return tmp/tab.size();
	}
	
	
}
