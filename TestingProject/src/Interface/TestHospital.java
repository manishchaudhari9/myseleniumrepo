package Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital f = new FortisHospital();
		f.doScan();
		f.doVaccination();
		f.operate();
		f.phoneConsultation();
		
		System.out.println("----------------");
		
		GovtHospital g = new GovtHospital();
		g.doScan();
		g.doVaccination();
		g.operate();
		
		System.out.println("----------------");
		
		//With obj h, you can access only the functions which are available in Hospital interface.
		Hospital h = new FortisHospital();	//Creating an obj of FortisHospital class but the ref of hospital interface is pointing towards it. 
		h.doScan();
		h.doVaccination();
		h.operate();
		
		System.out.println("----------------");
		
		Hospital h1 = new GovtHospital();	//Creating an obj of GovtHospital class but the ref of hospital interface is pointing towards it. 
		h1.doScan();
		h1.doVaccination();
		h1.operate();
		
		System.out.println("----------------");
		
		h1 = new FortisHospital();
		h1.doScan();
		h1.doVaccination();
		h1.operate();
		
		System.out.println("----------------");
		Hospital x = null;
		x = new FortisHospital();
		x.doScan();
		x.doVaccination();
		x.operate();
		
		x = new GovtHospital();
		x.doScan();
		x.doVaccination();
		x.operate();

	}

}
