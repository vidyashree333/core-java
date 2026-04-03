class CarRunner {

    public static void main(String[] args) {
		Car c10=new Car();
		c10.carName="Kushaq";
		c10.brand="skoda";
		c10.manufacturer="skoda ltd";
		c10.warranty="3 years";
		c10.fuelType="petrol";
		c10.displayCarDetails();

        Car c1 = new Car("Swift", "Maruti", "Maruti Ltd", "2 Years", "Petrol");
		c1.displayCarDetails();
		
        Car c2 = new Car("i20", "Hyundai", "Hyundai Ltd", "2 Years", "Petrol");
		c2.displayCarDetails();
		
        Car c3 = new Car("City", "Honda", "Honda Ltd", "3 Years", "Petrol");
		c3.displayCarDetails();
		
        Car c4 = new Car("Creta", "Hyundai", "Hyundai Ltd", "3 Years", "Diesel");
		c4.displayCarDetails();
		
        Car c5 = new Car("Fortuner", "Toyota", "Toyota Ltd", "3 Years", "Diesel");
		c5.displayCarDetails();
		
        Car c6 = new Car("Nexon", "Tata", "Tata Ltd", "3 Years", "Electric");
		c6.displayCarDetails();
		
        Car c7 = new Car("Thar", "Mahindra", "Mahindra Ltd", "3 Years", "Diesel");
		c7.displayCarDetails();
		
        Car c8 = new Car("Baleno", "Maruti", "Maruti Ltd", "2 Years", "Petrol");
		 c8.displayCarDetails();
		 
        Car c9 = new Car("Verna", "Hyundai", "Hyundai Ltd", "3 Years", "Petrol");
		c9.displayCarDetails();     
    }
}