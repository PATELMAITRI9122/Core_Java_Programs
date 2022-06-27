package tutorial_3;

/**
 * Enumeration are constant which define it's type and data by the enum class it's self
 * @author Maitri
 * when enum define java automatically define as a built in array of the constants
 *
 */

public enum Enumeration {
	
	Maitri("IT ENGINEER","27-10"),
	Harsh("BSC IT","03-10"),
	Pinky("missing her","24-03"),
	Brijesh("Mechanical","18-09"),
	Krishna("doo","01-01"),
	Devu("Sister","12-12");
	
	
	private final String desc;
	private final String birthday;
	
	
	//ENumeration Constructor
	private Enumeration(String desc, String birthday) {
		// TODO Auto-generated constructor stub
		
		this.desc = desc;
		this.birthday = birthday;
		
	}

	public String getDesc() {
		return desc;
	}
	
	public String getBirthday() {
		return birthday;
	}
}
