package Zivotinja;

public class Zivotinja {
	
	private String vrsta;
	
	Zivotinja(){}
	
	Zivotinja(String vrsta){
		this.vrsta = vrsta;
	}
	
	public String toString() {
		return "Ovo je " + vrsta;
	}

}
