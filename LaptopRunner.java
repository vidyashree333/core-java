class LaptopRunner{

    public static void main(String[] args) {
		Laptop lap=new Laptop();
		lap.laptopName="legion";
		lap.brand="lenova";
		lap.manufacturer="lenova ltd";
		lap.warranty="1 year";
		lap.processor="ryzon";
				                                                  
		lap.displayLaptopDetails();
        System.out.println("-----------------------------");		

        Laptop l1 = new Laptop("Inspiron 15", "Dell", "Dell Ltd", "1 Year", "i5");
		l1.displayLaptopDetails();
		 System.out.println("-----------------------------");
		 
        Laptop l2 = new Laptop("Pavilion", "HP", "HP Ltd", "1 Year", "i7");
		l2.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l3 = new Laptop("MacBook Air", "Apple", "Apple Inc", "1 Year", "M1");
		l3.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l4 = new Laptop("ThinkPad", "Lenovo", "Lenovo Ltd", "1 Year", "i5");
		l4.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l5 = new Laptop("Aspire 7", "Acer", "Acer Ltd", "1 Year", "Ryzen 5");
		l5.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l6 = new Laptop("ROG Strix", "Asus", "Asus Ltd", "1 Year", "i7");
		l6.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l7 = new Laptop("Surface Laptop", "Microsoft", "Microsoft Ltd", "1 Year", "i5");
		l7.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l8 = new Laptop("Chromebook", "Google", "Google Inc", "1 Year", "Celeron");
		l8.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l9 = new Laptop("Vostro", "Dell", "Dell Ltd", "1 Year", "i3");
		l9.displayLaptopDetails();
		 System.out.println("-----------------------------");
		
        Laptop l10 = new Laptop("Legion 5", "Lenovo", "Lenovo Ltd", "1 Year", "Ryzen 7");
		l10.displayLaptopDetails();
        System.out.println("-----------------------------");		
	}

	}