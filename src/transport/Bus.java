package transport;

public class Bus extends Transport {

    private String fuelType;

    public Bus(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, String fuelType, double fuelPercentage) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed, fuelPercentage);
        if (fuelType == null || fuelType.isEmpty() || fuelType.isBlank()) this.fuelType = "Unknown fuel type";
        else this.fuelType = fuelType;
    }

    public Bus(String brand, String model, String color, int productionYear, String productionCountry, String fuelType) {
        this(brand, model, color, productionYear, productionCountry, 0, fuelType, 0);
    }

    @Override
    public void refill() {
        System.out.println("Для заправки автобуса " + getBrand() + " был использован тип топлива: " + fuelType);
        setFuelPercentage(100);
    }

    @Override
    public String toString() {
        return "Bus { " + getBrand() + " " + getModel() + ", сборка: " + getProductionCountry() + ", " + getProductionYear() +
                " год, цвет: " + getColor() + ", тип топлива: " + fuelType + ", заполненность бака " + getFuelPercentage() + "% }";
    }
}
