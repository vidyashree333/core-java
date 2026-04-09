class Foodpanda{

    public double getPriceByFoodName(String foodName) {
        System.out.println("invoking getPriceByFoodName: " + foodName);
        double price = 0.0;

        if (foodName=="chiken biriyani") {
            price =120;
        } else if (foodName=="chiken tikka") {
            price = 200.99;
        } else if (foodName=="chilli chiken") {
            price = 80.21; 
        } else if (foodName=="chiken manuriyan") {
            price = 120;
        } else if (foodName=="chiken lalipap") {
            price = 100;
        }else if (foodName=="fish cury"){
             price=180;
		} else if (foodName=="fish kabab"){
             price=100;
		}else if (foodName=="mutton carry"){
             price=130;
		}else if (foodName=="fish palav"){
             price=240;
		}else if (foodName=="mutton sambar"){
             price=160;
	    }else {
            price = 0.0;
        }

        System.out.println("end of getPriceByFoodName");
        return price;
    }

   
    public double getTotalAmountByPriceAndQuantity(double price, int quantity) {
        System.out.println("invoking getTotalAmountByPriceAndQuantity");

        double totalPrice = price * quantity;

        return totalPrice;
    }

    
    public double applyDiscount(double totalAmount, double discountPercent) {
        System.out.println("..Applying discount...");

        double discount = (totalAmount * discountPercent) / 100;
        double finalAmount = totalAmount - discount;

        return finalAmount;
    }
}