class YouTubeRunner{
	public static void main(String [] args)
	{
		YouTube tube=new YouTube();
		boolean log=tube.login("Vidyashree H S","vidya@123");
		System.out.println(log);
		String msg=tube.login("vidyashree@gmail.com","vidya2123","34Acrt5");
		System.out.println(msg);
		String msg1=tube.search("kantara");
		System.out.println(msg1);
		String msg2=tube.search("kantara","Rishab shetty");
		System.out.println(msg2);
	}
}