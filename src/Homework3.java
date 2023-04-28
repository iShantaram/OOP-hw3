import transport.*;

public class Homework3 {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.6, "желтый", 2015, "Россия", 177,"бензин",
                20.5, "", 4, "manual","P123OX150", Boolean.FALSE, null);
        Car audi = new Car("Audi", "A8 50L TDI Quattro", 3.0, "желтый", 2020, "Германия",
                250,"бензин", 20.5, "", 4, "auto","P321OX199",
                false, new Key(true, false));
        Car bmw = new Car("BMW", "Z8", 3.0, "", 1980, "Германия",250, "бензин",
                20.5, "", 2, "auto", "", false, null);

        Bus mb = new Bus("Mercedes-Benz", "Tourismo", "белый", 2015, "Германия", 140, "бензин", 20);
        Bus man = new Bus("MAN", "Lion's Coach", "бордовый", 2018, "Германия", "дизель");
        Bus scania = new Bus("Scania", "Irizar I6", "серый", 2018, "Швеция", 100, "бензин", 55.2);

        System.out.println();
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);

        System.out.println();
        System.out.println(mb);
        System.out.println(man);
        System.out.println(scania);

        System.out.println();
        bmw.setRegistrationNumber("H123AX199");
        bmw.refill();
        man.refill();
        scania.refill();

        System.out.println();
        System.out.println(bmw);
        System.out.println(man);
    }
}