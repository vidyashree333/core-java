class DoorDashRunner{

    public static void main(String[] args) {

        DoorDash door = new DoorDash();
		double price = door.getPriceByFoodName("chapatti");
	    System.out.println("Food price:"+price);
	   
        double totalAmount = door.getTotalAmountByPriceAndQuantity(price,3);
	    System.out.println("Total Amount: " + totalAmount);
	   
        double finalAmount = door.applyDiscount(totalAmount,10);
	    System.out.println("Final Amount after Discount: " + finalAmount);
		System.out.println("---------------------------------------");
		
		
		
		DoorDash food = new DoorDash();
		double pricee = food.getPriceByFoodName("chiken");
	    System.out.println("Food price:"+pricee);
	   
        double totalAmountt = food.getTotalAmountByPriceAndQuantity(pricee,2);
	    System.out.println("Total Amount: " + totalAmountt);
	   
        double finalAmountt = food.applyDiscount(totalAmountt,10);
	    System.out.println("Final Amount after Discount: " + finalAmountt);
		System.out.println("---------------------------------------");


		
		
		DoorDash items = new DoorDash();
		double priceee = items.getPriceByFoodName("gee rice");
	    System.out.println("Food price:"+priceee);
	   
        double totalAmounttt = items.getTotalAmountByPriceAndQuantity(priceee,4);
	    System.out.println("Total Amount: " + totalAmounttt);
	   
        double finalAmounttt = items.applyDiscount(totalAmounttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmounttt);
		System.out.println("---------------------------------------");


		
		
		
		DoorDash veraitty = new DoorDash();
		double priceeee = veraitty.getPriceByFoodName("poori");
	    System.out.println("Food price:"+priceeee);
	   
        double totalAmountttt = veraitty.getTotalAmountByPriceAndQuantity(priceeee,3);
	    System.out.println("Total Amount: " + totalAmountttt);
	   
        double finalAmountttt = veraitty.applyDiscount(totalAmountttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmountttt);
		System.out.println("---------------------------------------");


		
		
		
		DoorDash veg = new DoorDash();
		double priceeeee = veg .getPriceByFoodName("rotti");
	    System.out.println("Food price:"+priceeeee);
	   
        double totalAmounttttt = veg .getTotalAmountByPriceAndQuantity(priceeeee,1);
	    System.out.println("Total Amount: " + totalAmounttttt);
	   
        double finalAmounttttt = veg .applyDiscount(totalAmounttttt,10);
	    System.out.println("Final Amount after Discount: " + finalAmounttttt);
		System.out.println("---------------------------------------");
		


     
      }
}