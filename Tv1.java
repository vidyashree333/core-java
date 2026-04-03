class Tv1{

 String tvName;
 String tvBrand;
 String manufacture;
 String warranty;
 static int tvInches=22;
 String device;
 
 public Tv1(){
	  }
	  
  public Tv1(String tvName,String tvBrand,String manufacture,String warranty,String device){
	  this.tvName=tvName;
	  this.tvBrand=tvBrand;
	  this.manufacture=manufacture;
	  this.warranty=warranty;
	  this.device=device;
	  
	   }
	   
	   public void displayTv1Details(){
		   System.out.println("Tv Name:"+tvName);
		   System.out.println("tv Brand:"+tvBrand);
		   System.out.println("manufacture company:"+manufacture);
		   System.out.println("warranty:"+warranty);
		   System.out.println("tvInches:"+tvInches);
		   System.out.println("device Type:"+device);
}
}