public class Main {

    public static Telephone createObject(String className) {
        switch (className){
            case "2nd":
                return new Samsung("Galaxy S24 Ultra","Samsung");

                case "3rd":
                    return new Xiaomi("Xiaomi Mi Max","Black",123456);

                    case "4th":
                        return new iPhone("iPhone 15","Ularbek",1234567890);
            default:
                System.out.println("Invalid className");
                return null;

        }

    }
    public static void main(String[] args) {

        Telephone samsung = createObject("2nd");
        Telephone xiaomi = createObject("3rd");
        Telephone iPhone = createObject("4th");

        Telephone[] printable = {samsung, xiaomi, iPhone};

        for(int i = 0; i < printable.length; i++){
            printable[i].print();
            System.out.println("--------------------");
            System.out.println();
        }

        Engine engine = new Engine(" V6");
        CarModel carModel = new CarModel(1, " Америка", " G63", Cartype.HATCHBACK, 2019, engine);
        System.out.println(carModel.getInfo());
        carModel.makeVoice();
        carModel.makeVoice("Beep");

        System.out.println("------------");

        Transport transport = new Transport(2," Китай"," G80",Cartype.SEDAN, 2020, engine, " BMW", 300);
        System.out.println(transport.getInfo());
        carModel.makeVoice();
        carModel.makeVoice("Paaap");
        System.out.println("------------");

        Transport transport1 = new Transport(3," Япония"," G30",Cartype.SUV,2000, engine, " BMW",200);
        System.out.println(transport1.getInfo());
        carModel.makeVoice();
        carModel.makeVoice("Piiip");
        System.out.println("------------");
    }
}
/*
Factory: 1
Model:  G63
Year: 2019
Location:  Америка
Beep Beep
Beep
------------
Factory: 2
Model:  G80
Year: 2020
Location:  Китай
Name:  BMW
Speed: 300
Location:  Китай
Beep Beep
Paaap
------------
Factory: 3
Model:  G30
Year: 2000
Location:  Япония
Name:  BMW
Speed: 200
Location:  Япония
Beep Beep
Piiip
------------
Process finished with exit code 0
*/