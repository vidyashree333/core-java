class  SwiggyRunner{
	public static void main(String [] args)
	{
		Swiggy swig=new Swiggy();
		
		boolean login=swig.login("Vidyashree H S","vidya@123");
		System.out.println(login);
		System.out.println("---------------------");
		
		String login1=swig.login("vidyashree@gmail.com","vidya2123","34Acrt5");
		System.out.println(login1);
		System.out.println("---------------------");
		
		String message=swig.search("pizza");
		System.out.println(message);
		System.out.println("---------------------");
		
		String message1=swig.search("pizza","i002TRQ001");
		System.out.println(message1);
		System.out.println("---------------------");
		
		String message2=swig.search("pizza","i002TRQ001","sahana");
		System.out.println(message2);
		System.out.println("---------------------");
		
		String message3=swig.search("pizza","i002TRQ001","sahana","pizzaHut");
		System.out.println(message3);
		System.out.println("---------------------");
		
		String message4=swig.search("pizza","i002TRQ001","sahana","pizzaHut","Mandya");
		System.out.println(message4);
		System.out.println("---------------------");
	}
}