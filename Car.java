class Car {

    String carName;
    String brand;
    String manufacturer;
    String warranty;
    static int seatingCapacity = 5;
    String fuelType;

    
    public Car() {
    }

   
    public Car(String carName, String brand, String manufacturer, String warranty, String fuelType) {
        this.carName = carName;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
        this.fuelType = fuelType;
    }

    
    public void displayCarDetails() {
        System.out.println("Car Name: " + carName);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty: " + warranty);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("-----------------------------");
    }
}