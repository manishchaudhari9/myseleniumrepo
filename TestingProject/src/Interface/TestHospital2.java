package Interface;

public class TestHospital2 {

	public static void main(String[] args) {

		Hospital h = new CityHospital();
		
		h.doScan();
		h.doVaccination();
		h.operate();

	}

}
