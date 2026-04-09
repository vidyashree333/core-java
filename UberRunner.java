class   UberRunner{

    public static void main(String[] args) {

         Uber uber = new    Uber();
		double price = uber.getPriceByFoodName("chapatti");
	    System.out.println("Food price:"+price);
	   
        double totalAmount = uber.getTotalAmountByPriceAndQuantity(price,5);
	    System.out.println("Total Amount: " + totalAmount);
	   
        double finalAmount = uber.applyDiscount(totalAmount,10);
	    System.out.println("Final Amount after Discount: " + finalAmount);
		System.out.println("---------------------------------------");
		
		
		
		   Uber foods = new   Uber();
		double pricee = foods.getPriceByFoodName("karabath");
	    System.out.println("Food price:"+pricee);
	   
        double totalAmountt = foods.getTotalAmountByPriceAndQuantity(pricee,10);
	    System.out.println("Total Amount: " + totalAmountt);
	   
        double finalAmountt = foods.applyDiscount(totalAmountt,10);
	    System.out.println("Final Amount after Discount: " + finalAmountt);
		System.out.println("---------------------------------------");


		
		
		  Uber items = new    Uber();
		double priceee = items.getPriceByFoodName("gee rice");
	    System.out.println("Food price:"+priceee);
	   
        double totalAmounttt = items.getTotalAmountByPriceAndQuantity(priceee,3);
	    System.out.println("Total Amount: " + totalAmounttt);
	   
        double finalAmounttt = items.applyDiscount(totalAmounttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmounttt);
		System.out.println("---------------------------------------");


		
		
		
		 Uber veraitty = new    Uber();
		double priceeee = veraitty.getPriceByFoodName("poori");
	    System.out.println("Food price:"+priceeee);
	   
        double totalAmountttt = veraitty.getTotalAmountByPriceAndQuantity(priceeee,3);
	    System.out.println("Total Amount: " + totalAmountttt);
	   
        double finalAmountttt = veraitty.applyDiscount(totalAmountttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmountttt);
		System.out.println("---------------------------------------");


		
		
		
		 Uber veg = new    Uber();
		double priceeeee = veg .getPriceByFoodName("fried rice");
	    System.out.println("Food price:"+priceeeee);
	   
        double totalAmounttttt = veg .getTotalAmountByPriceAndQuantity(priceeeee,1);
	    System.out.println("Total Amount: " + totalAmounttttt);
	   
        double finalAmounttttt = veg .applyDiscount(totalAmounttttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmounttttt);
		System.out.println("---------------------------------------");
		


     
      }
}