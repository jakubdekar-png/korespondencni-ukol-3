public class Main {
    public static void main(String[] args) {
        CarDealer dealer = new CarDealer(10);

        Car car1 = new Car("Civic", "Honda", 45000, new Consumption(6.8, 5.2, 6.0), 320000, Fuel.Petrol);
        Car car2 = new Car("Accord", "Honda", 75000, new Consumption(7.5, 5.8, 6.7), 420000, Fuel.Hybrid);
        Car car3 = new Car("A4", "Audi", 55000, new Consumption(7.2, 5.5, 6.4), 480000, Fuel.Diesel);
        Car car4 = new Car("3 Series", "BMW", 90000, new Consumption(8.0, 6.2, 7.1), 550000, Fuel.Petrol);
        Car car5 = new Car("Corolla", "Toyota", 35000, new Consumption(5.5, 4.2, 4.9), 290000, Fuel.Hybrid);
        Car car6 = new Car("Model 3", "Tesla", 20000, new Consumption(0.0, 0.0, 0.0), 850000, Fuel.Hybrid);
        Car car7 = new Car("C-Class", "Mercedes", 65000, new Consumption(7.8, 6.0, 6.9), 620000, Fuel.Diesel);

        dealer.addCar(car1);
        dealer.addCar(car2);
        dealer.addCar(car3);
        dealer.addCar(car4);
        dealer.addCar(car5);
        dealer.addCar(car6);
        dealer.addCar(car7);

        System.out.println("Celkovy pocet aut: " + dealer.getCarCount());
        System.out.println();

        System.out.println("Auto podle modelu 'Civic' ");
        Car foundCar = dealer.getCarByModel("Civic");
        if (foundCar != null) {
            System.out.println("Model: " + foundCar.getModel());
            System.out.println("Vyrobce: " + foundCar.getManufacturer());
            System.out.println("Kilometry: " + foundCar.getKilometers());
            System.out.println("Cena: " + foundCar.getPrice() + " Kc");
            System.out.println("Palivo: " + foundCar.getFuel());
        }
        System.out.println();

        System.out.println("Auta znacky 'Honda' ");
        Car[] vwCars = dealer.getCarsByManufacturer("Honda");
        for (int i = 0; i < vwCars.length; i++) {
            System.out.println("- " + vwCars[i].getModel() + " (" + vwCars[i].getPrice() + " Kc)");
        }
        System.out.println();

        System.out.println("Auta s prumernou spotrebou pod 6.5 l/100km ");
        Car[] economicCars = dealer.getCarsUnderAverageConsumption(6.5);
        for (int i = 0; i < economicCars.length; i++) {
            System.out.println("- " + economicCars[i].getModel() + " (spotreba: " + economicCars[i].getConsumption().getAverage() + " l/100km)");
        }
        System.out.println();

        System.out.println("Auta na benzin (Petrol) ");
        Car[] petrolCars = dealer.getCarsByFuel(Fuel.Petrol);
        for (int i = 0; i < petrolCars.length; i++) {
            System.out.println("- " + petrolCars[i].getManufacturer() + " " + petrolCars[i].getModel());
        }
        System.out.println();

        System.out.println("Auta na naftu (Diesel) ");
        Car[] dieselCars = dealer.getCarsByFuel(Fuel.Diesel);
        for (int i = 0; i < dieselCars.length; i++) {
            System.out.println("- " + dieselCars[i].getManufacturer() + " " + dieselCars[i].getModel());
        }
        System.out.println();

        System.out.println("Hybridni auta ");
        Car[] hybridCars = dealer.getCarsByFuel(Fuel.Hybrid);
        for (int i = 0; i < hybridCars.length; i++) {
            System.out.println("- " + hybridCars[i].getManufacturer() + " " + hybridCars[i].getModel());
        }
    }
}
