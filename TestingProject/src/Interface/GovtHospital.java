package Interface;

public class GovtHospital implements Hospital{
	
	@Override
	public void operate() {
		System.out.println("GovtHospital Operating");
	}

	@Override
	public void doScan() {
		System.out.println("GovtHospital scanning");		
	}
	
	@Override
	public void doVaccination() {
		System.out.println("GovtHospital Vaccination");		
	}
}
