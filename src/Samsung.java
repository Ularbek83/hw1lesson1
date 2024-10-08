public class Samsung extends Telephone {
    private String brend;

    public Samsung(String name, String brend) {
        super(name);
        this.brend = brend;
    }

    public void print() {
        System.out.println("Brend: " + brend+
                "\nSamsung: " + super.getName());
    }
}