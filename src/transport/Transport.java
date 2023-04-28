package transport;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;
    private double fuelPercentage;

    public Transport(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, double fuelPercentage) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) this.brand = "Unknown brand";
        else this.brand = brand;

        if (model == null || model.isEmpty() || model.isBlank()) this.model = "Unknown model";
        else this.model = model;

        if (color == null || color.isEmpty() || color.isBlank()) this.color = "Unknown color";
        else this.color = color;

        if (productionYear > LocalDate.now().getYear()) this.productionYear = LocalDate.now().getYear();
        else this.productionYear = Math.max(productionYear, 2000);

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) this.productionCountry = "Unknown country";
        else this.productionCountry = productionCountry;

        if (maxSpeed < 0) maxSpeed = 0;
        else this.maxSpeed = maxSpeed;

        setFuelPercentage(fuelPercentage);
        /*if (fuelPercentage > 100) this.fuelPercentage = 100;
        else if (fuelPercentage < 0) this.fuelPercentage = 0;
        else this.fuelPercentage = fuelPercentage;*/
    }

    public Transport(String brand, String model, String color, int productionYear, String productionCountry) {
        this(brand, model, color, productionYear, productionCountry, 0, 0);
    }

    public void setFuelPercentage(double fuelPercentage) {
        if (fuelPercentage > 100) this.fuelPercentage = 100;
        else if (fuelPercentage < 0) this.fuelPercentage = 0;
        else this.fuelPercentage = fuelPercentage;
    }

    public abstract void refill();
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public int getAge() {
        return LocalDate.now().getYear() - productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }

    @Override
    public String toString() {
        return "Transport { " + brand + " " + model + ", сборка: " + productionCountry + ", " + productionYear + " год, цвет: " + color + " }";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport car = (Transport) o;
        return productionYear == car.productionYear && brand.equals(car.brand) &&
                model.equals(car.model) && productionCountry.equals(car.productionCountry);
    }
    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, productionYear, productionCountry);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) this.color = "Unknown color";
        else this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > 0) this.maxSpeed = maxSpeed;
    }

    public double getFuelPercentage() {
        return fuelPercentage;
    }
}
