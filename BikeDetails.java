class BikeDetails{

    static int bikeQuantity[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

    static float bikePrice[] = {10000.00f,110000.00f,12000.00f,130000.00f,140000.00f,15000.00f,160000.00f,17000.00f,18000.00f,190000.00f,200000.00f,21000.00f,22000.00f,23000.00f,240000.00f};

    static byte reviews[] = {110,120,110,110,121,122,111,108,107,106,103,120,109,117,100};
	
	static String purchasersnames[] = {"Ram","Sita","Ravi","Anu","Kiran","Maya","Arun","Sneha","Ajay","Divya","Vijay","Pooja","Rahul","Manu","Latha"};


   
    public static void main(String args[]) {

        System.out.println("Even Bikequantity:");
        for(int i=0; i<bikeQuantity.length; i++) {
            if(i%2==0)
                System.out.println(bikeQuantity[i]);
        }

        System.out.println("\nEven bike price:");
        for(int i=0; i<bikePrice.length; i++) {
            if(i%2==0)
                System.out.println(bikePrice[i]);
        }

        System.out.println("\nEven reviews:");
        for(int i=0; i<reviews.length; i++) {
            if(i%2==0)
                System.out.println(reviews[i]);
        }

        System.out.println("\nEven purchasersnames:");
        for(int i=0; i<purchasersnames.length; i++) {
            if(i%2==0)
                System.out.println(purchasersnames[i]);
        }
		}
}