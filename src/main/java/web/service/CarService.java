package web.service;
import java.util.List;

import org.springframework.stereotype.Service;
import web.model.Car;

public interface CarService {
    List<Car> getCars(int count);
}
