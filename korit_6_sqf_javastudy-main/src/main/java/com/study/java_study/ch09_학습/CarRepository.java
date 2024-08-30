//package com.study.java_study.ch09_학습;
//
//public class CarRepository {
//    private int carId;
//    private CarEntity[] cars;
//
//    public CarRepository() {
//        cars = new CarEntity[0];
//    }
//    public int crementCarId() {
//        return ++carId;
//    }
//    private void extendCars() {
//        CarEntity[] newCars = new CarEntity[cars.length + 1];
//        for(int i = 0; i < cars.length; i++) {
//            newCars[i] = cars[i];
//        }
//        cars = newCars;
//    }
//    private int getLastIndex() {
//        return cars.length - 1;
//    }
//    public void saveCar(CarEntity car) {
//        extendCars();
//        cars[getLastIndex()] = car;
//    }
//    public CarEntity findCarByCarId(int carId) {
//        CarEntity findCar = null;
//    for(CarEntity car : cars) {
//        if(car.getCarId() == carId) {
//            findCar = car;
//            break;
//        }
//    }
//    return findCar;
//    }
//    public CarEntity findCarByCarName(String carName) {
//        CarEntity findCar = null;
//        for(CarEntity car : cars){
//            if(car.getCarName().equals(carName)) {
//                findCar = car;
//                break;
//            }
//        }
//        return findCar;
//    }
//    private int getNewArraySize(int option, String searchText) {
//        int newArraySize = 0;
//
//        switch (option) {
//            case 1:
//
//        }
//    }
//}
