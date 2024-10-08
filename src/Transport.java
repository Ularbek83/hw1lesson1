public class Transport extends CarModel {
    private String name;
    private int speed;

    public Transport(int factoryId, String location, String model, Cartype cartype,
                     int year, Engine engine, String name, int speed) {
        super(factoryId, location, model, cartype, year, engine);
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public String getInfo(){
        return super.getInfo() +
                "\nName: " + name +
                "\nSpeed: " + speed+
                "\nLocation: " + getLocation();


    }
}
