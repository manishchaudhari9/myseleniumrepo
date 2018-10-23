package Interface;

public class FortisHospital implements Hospital{

	@Override
	public void operate() {
		System.out.println("Fortis Operating");
	}

	@Override
	public void doScan() {
		System.out.println("Fortis scanning");		
	}

	@Override
	public void doVaccination() {
		System.out.println("Fortis Vaccination");		
	}
	
	public void phoneConsultation() {
		System.out.println("Fortis phone Consultation");		
	}

}