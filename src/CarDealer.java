public class CarDealer {
    private Car[] cars;
    private int carCount;

    public CarDealer(int capacity) {
        this.cars = new Car[capacity];
        this.carCount = 0;
    }

    public void addCar(Car car) {
        if (carCount < cars.length) {
            cars[carCount] = car;
            carCount++;
        }
    }

    public int getCarCount() {
        return carCount;
    }

    public Car getCarByModel(String model) {
        for (int i = 0; i < carCount; i++) {
            if (cars[i].getModel().equals(model)) {
                return cars[i];
            }
        }
        return null;
    }

    public Car[] getCarsByManufacturer(String manufacturer) {
        Car[] tempCars = new Car[carCount];
        int count = 0;

        for (int i = 0; i < carCount; i++) {
            if (cars[i].getManufacturer().equals(manufacturer)) {
                tempCars[count] = cars[i];
                count++;
            }
        }

        Car[] result = new Car[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempCars[i];
        }

        return result;
    }

    public Car[] getCarsUnderAverageConsumption(double consumption) {
        Car[] tempCars = new Car[carCount];
        int count = 0;

        for (int i = 0; i < carCount; i++) {
            if (cars[i].getConsumption().getAverage() < consumption) {
                tempCars[count] = cars[i];
                count++;
            }
        }

        Car[] result = new Car[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempCars[i];
        }

        return result;
    }

    public Car[] getCarsByFuel(Fuel fuel) {
        Car[] tempCars = new Car[carCount];
        int count = 0;

        for (int i = 0; i < carCount; i++) {
            if (cars[i].getFuel() == fuel) {
                tempCars[count] = cars[i];
                count++;
            }
        }

        Car[] result = new Car[count];
        for (int i = 0; i < count; i++) {
            result[i] = tempCars[i];
        }

        return result;
    }
}
