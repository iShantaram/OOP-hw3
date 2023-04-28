package transport;

public class Train extends Transport{

    String fuelType = "дизель";
    public Train(String brand, String model, String color, int productionYear, String productionCountry, int maxSpeed, double fuelPercentage) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed, fuelPercentage);
    }

    public Train(String brand, String model, String color, int productionYear, String productionCountry) {
        this(brand, model, color, productionYear, productionCountry, 0, 0);
    }

    @Override
    public void refill() {
        System.out.println("Для заправки поезда " + getModel() + " используется топливо:" + fuelType);
        setFuelPercentage(100);
    }
}
