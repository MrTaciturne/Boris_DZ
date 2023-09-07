package HomeWork7.Garages.Cars;

import java.util.Objects;

public abstract class Car {

    private String mark;
    private String model;
    private int year;
    private String color;

    Car(String mark, int year,String color){
        this.model = this.getClass().getSimpleName();
        this.mark = mark;
        this.year = year;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(mark, car.mark) && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, year);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year + '\'' +
                '}';
    }
}
