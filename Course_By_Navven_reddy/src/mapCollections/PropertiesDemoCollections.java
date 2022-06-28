package mapCollections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemoCollections {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("maitri.properties");
		p.load(fis);
		
		System.out.println(p);
		
		String s = p.getProperty("venki");
		
		System.out.println(s);
		
		p.setProperty("nag", "88888");
		
		FileOutputStream fos = new FileOutputStream("maitri.properties");
		
		p.store(fos, "updated properties");
		

	}

}
