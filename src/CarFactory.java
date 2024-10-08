public class CarFactory {
    private int factoryId;
    private String location;

    public CarFactory(int factoryId, String location) {
        this.factoryId = factoryId;
        this.location = location;
    }

    public int getFactoryId() {
        return factoryId;
    }

    public String getLocation() {
        return location;
    }
}

