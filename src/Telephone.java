public abstract class Telephone  {
    private String name;

    public Telephone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void print();

}
