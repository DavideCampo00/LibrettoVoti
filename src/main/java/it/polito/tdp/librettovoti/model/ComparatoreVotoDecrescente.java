package it.polito.tdp.librettovoti.model;

import java.util.Comparator;

public class ComparatoreVotoDecrescente implements Comparator <Voto>{

	@Override
	public int compare(Voto o1, Voto o2) {
		
		return -(o1.getPunti()-o2.getPunti());
	}

	

}
