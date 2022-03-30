package src.main.models;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class Dealership {
    ArrayList<Car> cars;

    public Dealership() {
        this.cars = new ArrayList<Car>();
    }

    public Car getCar(int index) {
        return new Car(this.cars.get(index));
    }

    public void setCar(int index, Car car) {
        this.cars.set(index, new Car(car));
    }

    public void addCar(Car car) {
        this.cars.add(new Car(car));
    }

    public boolean contains(Car car) {
        return this.cars.contains(car);
    }

    public void sellCar(Car car) {
        this.cars.remove(car);
    }

    public String toString(){
        String allCars = "";
        for (Car car : cars) {
            allCars += car.getColor() + " " + car.getBrand() + "\n";
        }

        return "All cars: \n" + allCars;
    }
    
    
}




