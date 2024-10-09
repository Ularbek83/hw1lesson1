public class CarModel extends CarFactory {
    private String model;
    private int year;
    private Cartype cartype;

    public CarModel(int factoryId, String location, String model,
                    Cartype cartype, int year, Engine engine) {
        super(factoryId, location);
        this.model = model;
        this.year = year;
        this.cartype = cartype;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void makeVoice() {
        System.out.println("Beep Beep");
    }

    public final void makeVoice(String voice) {
        System.out.println(voice);
    }

    public String getInfo() {
        return "Factory: " + getFactoryId() +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nCartype: " + cartype +
                "\nLocation: " + getLocation();
    }
}
