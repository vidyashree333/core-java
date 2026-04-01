class  FlipkartRunner{
	public static void main(String [] args)
	{
		Flipkart flip=new Flipkart();
		
		boolean login=flip.login("Vidyashree H S","vidya@123");
		System.out.println(login);
		System.out.println("---------------------");
		
		String login1=flip.login("vidyashree@gmail.com","vidya2123","34Acrt5");
		System.out.println(login1);
		System.out.println("---------------------");
		
		String message=flip.search("Dell");
		System.out.println(message);
		System.out.println("---------------------");
		
		String message1=flip.search("Dell","Delli7");
		System.out.println(message1);
		System.out.println("---------------------");
		
		String message2=flip.search("Dell","Delli7","black");
		System.out.println(message2);
		System.out.println("---------------------");
		
		String message3=flip.search("Dell","Delli7","black","electric showroom");
		System.out.println(message3);
		System.out.println("---------------------");
		
		String message4=flip.search("Dell","Delli7","black","electric showroom","India");
		System.out.println(message4);
		System.out.println("---------------------");
	}
}