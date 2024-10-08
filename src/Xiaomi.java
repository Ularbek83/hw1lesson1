public class Xiaomi extends Telephone{
    private int idCode;
    private String color;

    public Xiaomi(String name, String color, int idCode) {
        super(name);
        this.color = color;
        this.idCode = idCode;
    }
    public void print() {
        System.out.println("IdCode: "+idCode+
                "\n Color: "+color+
                "\nXiaomi: "+super.getName());
    }
}
