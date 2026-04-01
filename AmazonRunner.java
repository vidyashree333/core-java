class  AmazonRunner{
	public static void main(String [] args)
	{
		Amazon amaz=new Amazon();
		
		boolean login=amaz.login("Vidyashree H S","vidya@123");
		System.out.println(login);
		System.out.println("---------------------");
		
		String login1=amaz.login("vidyashree@gmail.com","vidya2123","34Acrt5");
		System.out.println(login1);
		System.out.println("---------------------");
		
		String message=amaz.search("air canditioner");
		System.out.println(message);
		System.out.println("---------------------");
		
		String message1=amaz.search("air canditioner","MarqMatric");
		System.out.println(message1);
		System.out.println("---------------------");
		
		String message2=amaz.search("air canditioner","MarqMatric","white");
		System.out.println(message2);
		System.out.println("---------------------");
		
		String message3=amaz.search("air canditioner","MarqMatric","white","electric enovative");
		System.out.println(message3);
		System.out.println("---------------------");
		
		String message4=amaz.search("air canditioner","MarqMatric","white","electric enovative","India");
		System.out.println(message4);
		System.out.println("---------------------");
	}
}