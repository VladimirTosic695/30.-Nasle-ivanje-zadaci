package Stack;

public class Pravougaonik extends Oblik {

	double duzina, sirina;
	
	public Pravougaonik(double d, double s) {
		duzina = d;
		sirina = s;
	}
	
	public double uzmiPovrsinu() {
		 povrsina = duzina * sirina;
		 return povrsina;
	}
	
	
}
