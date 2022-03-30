package src.main.models;

public class Car {
    private String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    public Car(Car source) {
        this.brand = source.brand;
        this.color = source.color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "\t Brand: " + this.brand + "\n" +
               "\t Color: " + this.color + "\n";
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Car)) {
            return false;
        }

        Car car = (Car)obj;
        return this.brand.equals(car.brand) &&
            this.color.equals(car.color);

    }
    
}


