package inside_anything_inside_concept;

import inside_anything_inside_concept.Vehicle.DefaultVehicle;

public class Test_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
		System.out.println(d.getNoOfVehicle());
		
		Bus b = new Bus();
		System.out.println(b.getNoOfVehicle());
		
		DefaultVehicle d1 = new DefaultVehicle();
		//d1.getNoOfVehicle()
		System.out.println(d1.getNoOfVehicle());

	}

}
