class  CarInformation{

   
    static long carPrice[] = {500000, 650000, 720000, 800000, 900000,550000, 670000, 750000, 820000, 950000,600000, 700000, 780000, 850000, 990000 };

    static short carEngineCC[] = {800, 1000, 1200, 1400, 1500,1600, 1800, 2000, 2200, 2400,2600, 2800, 3000, 3200, 3500};

    static char carGrade[] = {'A','B','A','C','B','A','B','C','A','B','A','C','B','A','B'};

    static double carMileage[] = {18.5, 20.2, 17.8, 16.4, 15.9,19.3, 21.0, 14.8, 13.6, 12.5,22.4, 18.9, 17.5, 16.7, 15.2};

    public static void main(String[] args) {

        System.out.println("Car Prices:");
        for(int i = 0; i < carPrice.length; i++) {
			if(i%2!=0)
            System.out.println(carPrice[i]);
        }

        System.out.println("\nCar Engine CC:");
        for(int i = 0; i < carEngineCC.length; i++) {
			if(i%2!=0)
            System.out.println(carEngineCC[i]);
        }

        System.out.println("\nCar Grade:");
        for(int i = 0; i < carGrade.length; i++) {
			if(i%2!=0)
            System.out.println(carGrade[i]);
        }

        System.out.println("\nCar Mileage:");
        for(int i = 0; i < carMileage.length; i++) {
			if(i%2!=0)
            System.out.println(carMileage[i]);
        }
    }
}