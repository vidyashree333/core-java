class Swiggy{
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
	
	public String search(String foodName)
	{
		System.out.println("Invoking search by food Name :" +foodName);
		String message=null;
		
		if( foodName!=null)
		{
			message="Searched foodName :" +foodName+ " is available";
		}
		return message;
	}
	
	
	public String search(String foodName,String foodOrderId)
	{
		System.out.println("Invoking search by food Name:" +foodName+ " and food OrderId :" +foodOrderId);
		String message=null;
		
		if(foodName!=null && foodOrderId!=null)
		{
			message="searched food Name :" +foodName+ " and food OrderId :" +foodOrderId+ " is available";
		}
		return message;	
	}
	
	
		public String search(String foodName, String foodOrderId, String CustmerName)
	{
		System.out.println("Invoking search by food Name :" +foodName+ "and food OrderId :" +foodOrderId+ "and Custmer Name :"+CustmerName);
		String message=null;
		
		if(foodName!=null && foodOrderId!=null && CustmerName!=null)
		{
			message="searched  prodact Name :" +foodName+ " and food OrderId :" +foodOrderId+ "  and CustmerName :"+CustmerName+" is available";
		}
		return message;	
	}
	
	
	
		public String search(String foodName, String foodOrderId, String CustmerName,String foodShopName)
	{
		System.out.println("Invoking search by  food Name :" + foodName+ " and food OrderId :" +foodOrderId+ " and Custmer Name :" + CustmerName+ " and foodShop Name :" +
		foodShopName);
		String message=null;
		
		if(foodName!=null && foodOrderId!=null && CustmerName!=null && foodShopName!=null)
		{
			message="searched  prodact Name :" + foodName+ " and food OrderId :" +foodOrderId+ " and Custmer Name :"+CustmerName+ " and prodact Manufacture :"+foodShopName+"  is available";
		}
		return message;	
	}
	
	
	
		public String search(String foodName, String foodOrderId, String CustmerName,String foodShopName,String orderplaceName)
	{
		System.out.println("Invoking search by  food Name :" + foodName+ " and foodOrderId :" +foodOrderId+ " and Custmer Name :" + CustmerName+ " and foodShop Name :" +foodShopName+ " and orderplace Name:"+orderplaceName);
		String message=null;
		
		if( foodName!=null && foodOrderId!=null && CustmerName!=null && foodShopName!=null && orderplaceName!=null)
		{
 	message="searched  foodName :" + foodName+ " and food OrderId :" +foodOrderId+ " and Custmer Namer :"+CustmerName+ " and food ShopName :"+foodShopName+" and orderplaceName :"+orderplaceName+" is available";

		}
		return message;	
	}
}