package web.model;



import java.util.Objects;

public class Car {
    private String model;
    private int power;
    private String color;


    public Car(String model, int power, String color) {
        this.model = model;
        this.power = power;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getColor() {
        return color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return power == car.power && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, color);
    }
}