package Stack;

public class Krug extends Oblik {
	
	double poluprecnik;
	
	Krug(double r){
		poluprecnik = r;
	}
	
	public double uzmiPovrsinu() {
		povrsina = poluprecnik * poluprecnik * 3.14;
		return povrsina;
	}

}
