package locale_Concept;

import java.util.Locale;

public class Part1 {

	public static void main(String[] args) {

		Locale l1 = Locale.getDefault();

		System.out.println(l1.getCountry() + "..." + l1.getLanguage()); // CA...en
		System.out.println(l1.getDisplayCountry() + "..." + l1.getDisplayLanguage()); // Canada...English

		Locale l2 = new Locale("pa", "IN");
		Locale.setDefault(l2);

//		System.out.println(l2.getCountry()+"..."+l2.getLanguage()); //IN...pa
//		System.out.println(l2.getDisplayCountry()+"..."+l2.getDisplayLanguage()); //Canada...English

		System.out.println(Locale.getDefault().getDisplayLanguage());

		String[] s1 = Locale.getISOLanguages();
		for (String a : s1) {
		//	System.out.println(a);
		}
		
		String[] s2 = Locale.getISOCountries();
		for(String b: s2) {
			//System.out.println(b);
		}
		
		Locale s3[] = Locale.getAvailableLocales();
		
		for(Locale c1 : s3) {
			System.out.println(c1.getDisplayCountry()+ "...." + c1.getCountry());
		}
		
//		Locale locale1 = new Locale("EN","IN");
//		System.out.println(locale1.getLanguage());
		

	}

}
