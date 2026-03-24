public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Sedan";
        myCar.color = "Blue";
        myCar.year = 2020;
        myCar.displayInfo();

        Car anotherCar = new Car();
        anotherCar.model = "SUV";
        anotherCar.color = "Red";
        anotherCar.year = 2021;
        anotherCar.displayInfo();

        Car.displayNumberOfCars();
    }
}
