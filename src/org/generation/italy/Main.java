package org.generation.italy;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> mazzoDiCarte=new ArrayList<>();
		Random r= new Random();
	    int estrazione;
		
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" bastoni");
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" spade");
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" coppe");
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" denari");
		
		estrazione=r.nextInt(mazzoDiCarte.size());
		System.out.println(mazzoDiCarte.get(estrazione));
	
		
		
		
		
			

	}

}
