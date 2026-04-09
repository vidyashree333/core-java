class   FoodpandaRunner{

    public static void main(String[] args) {

        Foodpanda  food = new   Foodpanda();
		double price = food.getPriceByFoodName("chikeen tikka");
	    System.out.println("Food price:"+price);
	   
        double totalAmount = food.getTotalAmountByPriceAndQuantity(price,3);
	    System.out.println("Total Amount: " + totalAmount);
	   
        double finalAmount = food.applyDiscount(totalAmount,10);
	    System.out.println("Final Amount after Discount: " + finalAmount);
		System.out.println("---------------------------------------");
		
		
		
		Foodpanda food1 = new   Foodpanda();
		double pricee = food1.getPriceByFoodName("fish kabab");
	    System.out.println("Food price:"+pricee);
	   
        double totalAmountt = food1.getTotalAmountByPriceAndQuantity(pricee,2);
	    System.out.println("Total Amount: " + totalAmountt);
	   
        double finalAmountt = food1.applyDiscount(totalAmountt,10);
	    System.out.println("Final Amount after Discount: " + finalAmountt);
		System.out.println("---------------------------------------");


		
		
		 Foodpanda items = new    Foodpanda();
		double priceee = items.getPriceByFoodName("fish palav");
	    System.out.println("Food price:"+priceee);
	   
        double totalAmounttt = items.getTotalAmountByPriceAndQuantity(priceee,4);
	    System.out.println("Total Amount: " + totalAmounttt);
	   
        double finalAmounttt = items.applyDiscount(totalAmounttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmounttt);
		System.out.println("---------------------------------------");


		
		
		
		Foodpanda veraitty = new   Foodpanda();
		double priceeee = veraitty.getPriceByFoodName("chiken biriyani");
	    System.out.println("Food price:"+priceeee);
	   
        double totalAmountttt = veraitty.getTotalAmountByPriceAndQuantity(priceeee,3);
	    System.out.println("Total Amount: " + totalAmountttt);
	   
        double finalAmountttt = veraitty.applyDiscount(totalAmountttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmountttt);
		System.out.println("---------------------------------------");


		
		
		
		Foodpanda veg = new   Foodpanda();
		double priceeeee = veg .getPriceByFoodName("mutton sambar");
	    System.out.println("Food price:"+priceeeee);
	   
        double totalAmounttttt = veg .getTotalAmountByPriceAndQuantity(priceeeee,1);
	    System.out.println("Total Amount: " + totalAmounttttt);
	   
        double finalAmounttttt = veg .applyDiscount(totalAmounttttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmounttttt);
		System.out.println("---------------------------------------");
		


     
      }
}