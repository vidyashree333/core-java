class Zomato{

    public double getPriceByFoodName(String foodName) {
        System.out.println("invoking getPriceByFoodName: " + foodName);
        double price = 0.0;

        if (foodName=="biriyani") {
            price =120;
        } else if (foodName=="fried rice") {
            price = 90.99;
        } else if (foodName=="aloo paratha") {
            price = 80.21;
        } else if (foodName=="gee rice") {
            price = 120;
        } else if (foodName=="masrum biriyani") {
            price = 100;
        }else if (foodName=="palav"){
             price=45;
		} else if (foodName=="bisibele bath"){
             price=100;
		}else if (foodName=="karabath"){
             price=30;
		}else if (foodName=="chapatti"){
             price=40;
		}else if (foodName=="poori"){
             price=60;
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