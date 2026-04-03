class Mobile{

    String mobileName;
    String brand;
    String manufacturer;
    String warranty;
    static int screenSize = 6;
    String type;

     public Mobile() {
    }

       public Mobile(String mobileName, String brand, String manufacturer, String warranty, String type) {
        this.mobileName = mobileName;
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.warranty = warranty;
        this.type = type;
    }

    
    public void displayMobileDetails() {
        System.out.println("Mobile Name: " + mobileName);
        System.out.println("Brand: " + brand);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Warranty: " + warranty);
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Type: " + type);
    }
}   