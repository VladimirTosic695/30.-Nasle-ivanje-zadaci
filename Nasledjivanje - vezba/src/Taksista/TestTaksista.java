package Taksista;

public class TestTaksista {

	public static void main(String[] args) {
		
		HonorarniTaksista hr = new HonorarniTaksista();
		hr.setIme("Vlada");
		System.out.println(hr.getIme());
		hr.zadajHonorarneSate(20);
		System.out.println(hr.uzmiHonorarneSate());

	}

}
