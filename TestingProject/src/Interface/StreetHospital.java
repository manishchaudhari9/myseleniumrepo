package Interface;

public abstract class StreetHospital implements Hospital{

	@Override
	public void doVaccination() {
		System.out.println("StreetHospital doVaccination");	
	}

}
