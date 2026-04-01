class Amazon{
	public boolean login(String username,String psw)
	{
		System.out.println("Invoking login using username :" +username+  " and password : " +psw);
		boolean isLogin=false;
		String regusername="Vidyashree H S";
		String regpsw="vidya@123";
		
		if(username == regusername && psw == regpsw)
		{
			isLogin=true;
		}
		else
		{
			isLogin=false;
		}
		return isLogin;
	}
	
	public String login(String emailId,String psw,String captcha)
	{
		System.out.println("Invoking login using email id :" +emailId+ " and password :" +psw);
		String message=null;
		String regemailId="vidyashree@gmail.com";
		String regpsw="vidya2123";
		
		if(emailId == regemailId && psw == regpsw)
		{
			message="login successful";
		}
		else
		{
			message="login failed";
		}
		return message;
	}
	
	public String search(String prodactName)
	{
		System.out.println("Invoking search by prodact Name :" +prodactName);
		String message=null;
		
		if( prodactName!=null)
		{
			message="Searched prodact Name :" +prodactName+ " is available";
		}
		return message;
	}
	
	
	public String search(String prodactName,String prodactBrand)
	{
		System.out.println("Invoking search by prodac name :" +prodactName+ " and prodact brand :" +prodactBrand);
		String message=null;
		
		if(prodactName!=null && prodactBrand!=null)
		{
			message="searched prodact Name :" +prodactName+ " and prodact Brand :" +prodactBrand+ " is available";
		}
		return message;	
	}
	
	
		public String search(String prodactName,String prodactBrand,String prodactcolor)
	{
		System.out.println("Invoking search by prodact Name :" +prodactName+ "and prodact Brand :" +prodactBrand+ "and prodact color :"+prodactcolor);
		String message=null;
		
		if(prodactName!=null && prodactBrand!=null && prodactcolor!=null)
		{
			message="searched  prodact Name :" +prodactName+ " and prodact Brand :" +prodactBrand+ "  and prodact color :"+prodactcolor+" is available";
		}
		return message;	
	}
	
	
	
		public String search(String prodactName,String prodactBrand,String prodactcolor,String prodactManufacture)
	{
		System.out.println("Invoking search by  prodact Name :" + prodactName+ " and prodact Brand :" +prodactBrand+ " and prodact color :" + prodactcolor+ " and prodact manufacture :" +prodactManufacture);
		String message=null;
		
		if(prodactName!=null && prodactBrand!=null && prodactcolor!=null && prodactManufacture!=null)
		{
			message="searched  prodact Name :" + prodactName+ " and prodact Brand :" +prodactBrand+ " and prodact color :"+prodactcolor+ " and prodact Manufacture :"+prodactManufacture+"  is available";
		}
		return message;	
	}
	
	
	
		public String search(String prodactName,String prodactBrand,String prodactcolor,String prodactManufacture,String prodactorigin)
	{
		System.out.println("Invoking search by  prodact Name :" + prodactName+ " and prodact Brand :" +prodactBrand+ " and prodact color :" + prodactcolor+ " and prodact manufacture :" +prodactManufacture+ " and prodact origin :"+prodactorigin);
		String message=null;
		
		if( prodactName!=null && prodactBrand!=null && prodactcolor!=null && prodactManufacture!=null && prodactorigin!=null)
		{
 	message="searched  prodact Name :" + prodactName+ " and prodact Brand :" +prodactBrand+ " and prodact color :"+prodactcolor+ " and prodact Manufacture :"+prodactManufacture+" and prodact origin :"+prodactorigin+" is available";

		}
		return message;	
	}
}