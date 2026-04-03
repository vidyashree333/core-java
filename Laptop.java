class Laptop {

    String laptopName;
    String brand;
    String manufacturer;
    String warranty;
    static int ramSize = 8;
    String processor;

    
    public Laptop() {
    }

    
    public Laptop(String laptopName, String brand, String manufacturer, String warranty, String processor) {
        this.laptopName = laptopName;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
        this.processor = processor;
    }

        public void displayLaptopDetails() {
        System.out.println("Laptop Name: " + laptopName);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty: " + warranty);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Processor: " + processor);
       
    }
}