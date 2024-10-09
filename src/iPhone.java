public class iPhone extends Telephone{
    private int vipCode;
    private String owner;


    public iPhone(String name, String owner, int vipCode) {
        super(name);
        this.owner = owner;
        this.vipCode = vipCode;
    }
    public void print() {
        System.out.println("VipCode: "+ vipCode+
                "\n Owner: "+ owner+
                "\n IPhone: "+ getName()) ;
    }
}
