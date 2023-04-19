package Zivotinja;

public class Pas extends Zivotinja {
	
	private String ime, rasa;
	
	Pas(String ime){
		super("pas ");
		this.ime = ime;
		rasa = "bernardinac";
	}
	
	Pas(String ime, String rasa){
		super("pas ");
		this.ime = ime;
		this.rasa = rasa;
	}
	
	public String toString() {
		return super.toString() + ime + " rase " + rasa;
	}


}
