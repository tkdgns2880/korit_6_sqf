package com.study.java_study.ch09_학습;

public class CarEntity {
    private int carId;
    private String carKind;
    private String carName;
    private String carMasterName;

    public CarEntity () {
    }

    public CarEntity(int carId, String carKind, String carName, String carMasterName) {
        this.carId = carId;
        this.carKind = carKind;
        this.carName = carName;
        this.carMasterName = carMasterName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarKind() {
        return carKind;
    }

    public void setCarKind(String carKind) {
        this.carKind = carKind;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarMasterName() {
        return carMasterName;
    }
    public void setCarMasterName(String carMasterName) {
        this.carMasterName = carMasterName;
    }
    @Override
    public String toString() {
        return "CarEntity{" +
                "carId=" + carId +
                ", carKind='" + carKind + '\'' +
                ", carName='" + carName + '\'' +
                ", carMasterName='" + carMasterName + '\'' +
                '}';
    }
}
