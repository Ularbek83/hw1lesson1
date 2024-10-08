public class CarModel extends CarFactory {
    private String model;
    private int year;

    public CarModel(int factoryId, String location, String model,
                    Cartype cartype,  int year, Engine engine) {
        super(factoryId, location);
        this.model = model;
        this.year = year;
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
    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public String getInfo() {
        return "Factory: " + getFactoryId() +
                "\nModel: " + model+
                "\nYear: " + year+
                "\nLocation: " + getLocation();
    }
}
