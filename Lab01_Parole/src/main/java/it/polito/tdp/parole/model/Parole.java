package it.polito.tdp.parole.model;

import java.util.List;
import java.util.*;
public class Parole {
		
	TreeMap<String,String> mappaParole = new TreeMap<String, String>();
	
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		this.mappaParole.put(p, p);
	}
	
	public List<String> getElenco() {
		//TODO
		List<String> daRitornare = (List<String>) this.mappaParole.values();
		return daRitornare;
	}
	
	public void reset() {
		this.mappaParole.clear();
	}
	
	public boolean contiene(String s) {
		if (this.mappaParole.containsKey(s))
			return true;
		else
			return false;
	}
	
	public void cancella(String daCancellare) {
			this.mappaParole.remove(daCancellare);
	}
	
	public String toString() {
		String daRitornare ="";
		for (String s : this.mappaParole.values())
			daRitornare = daRitornare + s + "\n";
		return daRitornare;
	}

}
