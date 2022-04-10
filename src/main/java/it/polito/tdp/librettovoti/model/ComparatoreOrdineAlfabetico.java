package it.polito.tdp.librettovoti.model;

import java.util.Comparator;

public class ComparatoreOrdineAlfabetico implements Comparator <Voto>{

	@Override
	public int compare(Voto o1, Voto o2) {	
		return o1.getNome().compareTo(o2.getNome());
	}



}
