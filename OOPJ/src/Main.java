public class Main {
    public static void main(String[] args) {
        // Car myCar = new Car();
        // myCar.model = "Sedan";
        // myCar.color = "Blue";
        // myCar.year = 2020;
        // myCar.displayInfo();

        // Car anotherCar = new Car();
        // anotherCar.model = "SUV";
        // anotherCar.color = "Red";
        // anotherCar.year = 2021;
        // anotherCar.displayInfo();

        // Car.displayNumberOfCars();

        Person person1 = new Person("Alice", 30);
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        person1.setAge(35);
        System.out.println("Updated Age: " + person1.getAge());

        person1.setAge(-5); // Invalid age, should print an error message
        System.out.println("Age after invalid update: " + person1.getAge());

        // person2
        Person person2 = new Person("Bob", -23);
        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
    }
}
