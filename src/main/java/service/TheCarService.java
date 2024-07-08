package service;

import model.TheCar;

import java.util.List;

public interface TheCarService {
    void addCar(TheCar car);
    TheCar getCarById(long id);
    List<TheCar> getAllCars();
    List<TheCar> getCars(int count);
}