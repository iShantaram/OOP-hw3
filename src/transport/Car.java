package transport;

import java.util.Objects;

public class Car extends Transport {
    private final String bodyType;
    private final int seatsNumber;
    private final String fuelType;
    private double engineVolume;
    private String transmission;
    private String registrationNumber;
    private boolean winterTiers;
    private final Key key;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed,
               String fuelType,
               double fuelPercentage,
               String bodyType,
               int seatsNumber,
               String transmission,
               String registrationNumber,
               boolean winterTiers,
               Key key) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed, fuelPercentage);


        if (fuelType == null || fuelType.isEmpty() || fuelType.isBlank()) this.fuelType = "Unknown fuelType";
        else this.fuelType = fuelType;

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) this.bodyType = "Unknown bodyType";
        else this.bodyType = bodyType;

        this.seatsNumber = Math.abs(seatsNumber);

        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) this.registrationNumber = "Unknown registrationNumber";
        else this.registrationNumber = registrationNumber;

        this.winterTiers = winterTiers;

        this.engineVolume = Math.abs(engineVolume);

        if (transmission == null|| transmission.isEmpty() || transmission.isBlank()) this.transmission = "Unknown transmission";
        else this.transmission = transmission;

        if (key == null) this.key = new Key();
        else this.key = key;
    }

    public String getBodyType() {
        return bodyType;
    }
    public int getSeatsNumber() {
        return seatsNumber;
    }

    @Override
    public void refill() {
        System.out.println("Для заправки авто " + getBrand() + " " + getModel() + " был использован тип топлива: " + fuelType);
        setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return "Car { " + getBrand() + " " + getModel() + ", сборка: " + getProductionCountry() + ", " + getProductionYear() +
                " год, цвет: " + getColor() + ", объем двигателя: " + engineVolume + "L, кузов " + bodyType +
                ", кол-во мест " + seatsNumber + ", " + transmission + ", " + registrationNumber + ", " + getWinterTiers() +
                ", тип топлива: " + fuelType + ", заполненность бака " + getFuelPercentage() + "% }";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getProductionYear() == car.getProductionYear() && getBrand().equals(car.getBrand()) &&
                getModel().equals(car.getModel()) && getProductionCountry().equals(car.getProductionCountry()) &&
                registrationNumber.equals(car.registrationNumber);
    }
    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), engineVolume, getColor(), getRegistrationNumber(), getProductionCountry());
    }
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) this.transmission = "Unknown transmission";
        else this.transmission = transmission;
    }

    public boolean isWinterTiers() {
        return winterTiers;
    }

    private String getWinterTiers() {
        if (isWinterTiers()) return "зимние шины";
        else return "летние шины";
    }

    public void changeTiers(){
        winterTiers = !winterTiers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) this.registrationNumber = "Unknown registrationNumber";
        else this.registrationNumber = registrationNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = Math.abs(engineVolume);
    }

}

