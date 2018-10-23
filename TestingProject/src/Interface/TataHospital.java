package Interface;

public class TataHospital implements Hospital, Hospital1{

	@Override
	public void billing() {
		System.out.println("TataHospital Billing");	
	}

	@Override
	public void xray() {
		System.out.println("TataHospital Xray");	
	}

	@Override
	public void operate() {
		System.out.println("TataHospital Operating");	
	}

	@Override
	public void doScan() {
		System.out.println("TataHospital Scanning");		
	}

	@Override
	public void doVaccination() {
		System.out.println("TataHospital Vaccinating");	
	}

}
