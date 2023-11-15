package org.generation.italy;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> mazzoDiCarte=new HashSet<>();
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" bastoni");
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" spade");
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" coppe");
		for(int i=1; i<11; i++)
			mazzoDiCarte.add(i+" denari");
			

	}

}
