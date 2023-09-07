package HomeWork7.Garages;

import HomeWork7.Garages.Cars.Car;

import java.util.ArrayList;
import java.util.HashMap;

public class Garage {

    HashMap<Integer, ArrayList<Car>> garage = new HashMap<>();



    public void parking(Car car){
        ArrayList<Car> cars = new ArrayList<>();
        if (!garage.containsKey(car.hashCode())){
            cars.add(car);
            garage.put(car.hashCode(),cars);
        } else {
            cars = garage.get(car.hashCode());
            cars.add(car);
            garage.replace(garage.hashCode(), cars);
        }

    }
    public void deParking(Car car){
        if (garage.containsKey(car.hashCode())) {
            ArrayList<Car> cars = garage.get(car.hashCode());
            cars.remove(car);
            garage.replace(garage.hashCode(), cars);
        }
    }
    public void isContain(Car car){
        ArrayList<Car> cars = garage.get(car.hashCode());
        System.out.println("В гараже " + cars.size() + " автомобилей " + car.toString());
    }
}
