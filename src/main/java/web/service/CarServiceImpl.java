package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List <Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Kia", 1, "blue"));
        cars.add(new Car("BMW", 12, "red"));
        cars.add(new Car("Porshe", 78, "yellow"));
        cars.add(new Car("Lada", 456, "black"));
        cars.add(new Car("Nissan", 13, "white"));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
