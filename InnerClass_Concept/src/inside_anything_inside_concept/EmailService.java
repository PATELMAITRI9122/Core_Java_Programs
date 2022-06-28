package inside_anything_inside_concept;

 interface EmailService {

	 public void sendEmail(EmailDetail e);
	 
	 class EmailDetail{
		 String fName;
		 String lName;
		 String subject;
	 }
}
