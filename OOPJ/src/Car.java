public class Car {

    static int numberOfCars = 0;

    public String color;
    public String model;
    public int year;

    public Car() {
        numberOfCars++;
    }   

    public void displayInfo(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    static void displayNumberOfCars() {
        System.out.println("Total number of cars: " + numberOfCars);
    }
}