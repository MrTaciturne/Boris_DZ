package HomeWork7.Garages;

import HomeWork7.Garages.Cars.Gelic;
import HomeWork7.Garages.Cars.Lamba;

public class GarageRunner {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Gelic gelic1 = new Gelic("Torello", 1998, "Red");
        Lamba lamba1 = new Lamba("Teso", 2000, "Black");
        Gelic gelic2 = new Gelic("Torello", 1998, "Yellow");
        Gelic gelic3 = new Gelic("Torello", 2001, "Grey");

        garage.parking(gelic1);
        garage.parking(lamba1);
        garage.parking(gelic2);
        garage.isContain(gelic1);
        garage.parking(gelic3);
        garage.isContain(gelic3);
        garage.deParking(gelic1);
        garage.isContain(gelic1);

    }
}
