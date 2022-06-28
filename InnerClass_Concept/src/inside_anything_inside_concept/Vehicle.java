package inside_anything_inside_concept;

public interface Vehicle {

	public int getNoOfVehicle();

	 class DefaultVehicle implements Vehicle {

		@Override
		public int getNoOfVehicle() {
			return 2;
		}

	}
}

class Bus implements Vehicle{

	@Override
	public int getNoOfVehicle() {
		return 6;
	}	
}


