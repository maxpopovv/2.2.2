package service;

import model.TheCar;
import service.TheCarService;

import java.util.ArrayList;
import java.util.List;

public class TheCarServiceImpl implements TheCarService {
    private List<TheCar> carList = new ArrayList<>();

    public TheCarServiceImpl() {

        carList.add(new TheCar(1, "Toyota", "Camry"));
        carList.add(new TheCar(2, "Honda", "Accord"));
        carList.add(new TheCar(3, "Ford", "Fusion"));
        carList.add(new TheCar(4, "Toyota", "Mark2"));
        carList.add(new TheCar(5, "Nissan", "Сube"));
        carList.add(new TheCar(6, "Hyundai", "Sonata"));
        carList.add(new TheCar(7, "Kia", "Optima"));
    }

    @Override
    public void addCar(TheCar car) {
        carList.add(car);
    }

    @Override
    public TheCar getCarById(long id) {
        for (TheCar car : carList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null;
    }

    @Override
    public List<TheCar> getAllCars() {
        return carList;
    }

    @Override
    public List<TheCar> getCars(int count) {
        if (count >= carList.size() || count == 5) { // Возвращаем весь список, если count >= размера списка или count == 5
            return carList;
        }
        return carList.subList(0, count);
    }
}