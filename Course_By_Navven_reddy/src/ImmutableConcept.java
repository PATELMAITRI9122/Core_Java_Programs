import java.util.HashMap;
import java.util.Map;

public final class ImmutableConcept {

	private final String name;
	private final int regNo;
	private final Map<String, String> metadata;

	public ImmutableConcept(String name, int regNo, Map<String, String> metadata) {
		this.name = name;
		this.regNo = regNo;
		// this.metadata = metadata;

		Map<String, String> tempMap = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}

		this.metadata = tempMap;

	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public Map<String, String> getMetadata() {

		Map<String, String> tempMap = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : metadata.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}

		return tempMap;

	}

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1", "first");
		map.put("2", "second");
		
		ImmutableConcept ic = new ImmutableConcept("ABC", 101, map);
		
		System.out.println(ic.getName());
		System.out.println(ic.getRegNo());
		System.out.println(ic.getMetadata());
		
		map.put("3","Third");
		System.out.println(ic.getMetadata());
		
		ic.getMetadata().put("4", "Fourth");
		
		System.out.println(ic.getMetadata());
		

	}

}
