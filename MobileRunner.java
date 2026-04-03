 class MobileRunner{

    public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.mobileName="Nothing";
		mob.brand="Nothingaltra";
		mob.manufacturer="electric cart";
		mob.warranty="5 years";
		mob.type="Smartphone";
        		
		mob.displayMobileDetails();
		System.out.println("-----------------------------------------");
		
		
        Mobile m1 = new Mobile("Galaxy S21", "Samsung", "Samsung Ltd", "1 Year", "Smartphone");
		 m1.displayMobileDetails();
		 System.out.println("-----------------------------------------");
		 
		 		 
		 
        Mobile m2 = new Mobile("iPhone 14", "Apple", "Apple Inc", "1 Year", "Smartphone");
		m2.displayMobileDetails();
		System.out.println("-----------------------------------------");
		
		
        Mobile m3 = new Mobile("Redmi Note 12", "Xiaomi", "MI Ltd", "1 Year", "Smartphone");
		m3.displayMobileDetails();
		System.out.println("-----------------------------------------");
		 
        Mobile m4 = new Mobile("Realme Narzo", "Realme", "Realme Ltd", "1 Year", "Smartphone");
		m4.displayMobileDetails();
		System.out.println("-----------------------------------------");
		 
		 
        Mobile m5 = new Mobile("OnePlus 11", "OnePlus", "OnePlus Ltd", "1 Year", "Smartphone");
		m5.displayMobileDetails();
		System.out.println("-----------------------------------------");
		
        Mobile m6 = new Mobile("Vivo V27", "Vivo", "Vivo Ltd", "1 Year", "Smartphone");
		m6.displayMobileDetails();
		System.out.println("-----------------------------------------");
		
        Mobile m7 = new Mobile("Oppo F21", "Oppo", "Oppo Ltd", "1 Year", "Smartphone");
		m7.displayMobileDetails();
		System.out.println("-----------------------------------------");
		
		
        Mobile m8 = new Mobile("Nokia G21", "Nokia", "HMD Global", "1 Year", "Smartphone");
		m8.displayMobileDetails();
		System.out.println("-----------------------------------------");
		
        Mobile m9 = new Mobile("Moto G73", "Motorola", "Motorola Ltd", "1 Year", "Smartphone");
		 m9.displayMobileDetails();
		 System.out.println("-----------------------------------------");
        
   }
}