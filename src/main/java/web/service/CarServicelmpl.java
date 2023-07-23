package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CarServicelmpl implements CarService {
    public List<Car> carList;

    @Override
    public List<Car> carList(Integer count) {
        carList = new ArrayList<>();
        carList.add(new Car("Lada", 66, "Brown"));
        carList.add(new Car("Ford", 911, "Blue"));
        carList.add(new Car("Porsche", 780, "Yellow"));
        carList.add(new Car("Ferrari", 102, "Red"));
        carList.add(new Car("Mercedes", 606, "Black"));
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
