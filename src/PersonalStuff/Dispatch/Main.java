package PersonalStuff.Dispatch;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Transport transport = new Transport();


    public static void main(String[] args) {

        //adding owners

        transport.newHauler("Tyler Mark LTD", "Tyler Mark", "306-230-4672");
        transport.newHauler("101034182 Sask LTD", "Alex Bon", "306-227-0335");
        transport.newHauler("Brayban Enterprises", "Lawney Leffler", "306-230-8776");
        transport.newHauler("BBC Trucking", "Gary Sanderson", "306-241-8029");
        transport.newHauler("Geransky Bros", "Mr Geransky", "306-220-2912");
        transport.newHauler("Larry Grunow", "Larry Grunow", "306-280-6767");
        transport.newHauler("William P Kavanaugh", "William Kavanaugh", "306-227-3116");
        transport.newHauler("TRN Trucking", "Travis Nuefeld", "306-220-1238");
        transport.newHauler("Upstart Enterprises", "Brett Dyck", "306-230-1827");
        transport.newHauler("Albivic", "Victor Rotaru", "306-292-7081");
        transport.newHauler("Witch Way Trucking", "Lorena Silzer", "306-281-7233");
        transport.newHauler("Hub Enterprises", "Roy", "306-262-5800");
        transport.newHauler("KRV Holdings", "Ron Keuvers", "306-231-2025");
        transport.newHauler("AllRotaru Construction", "Alex", "306-280-3031");
        transport.newHauler("101259393 Sask LTD", "Chuck", "306-250-5235");
        transport.newHauler("Hemsing & Sons", "Kayne Hemsing", "306-681-8662");
        transport.newHauler("Chakkar Express", "Harry Sidhu", "306-341-1677");
        transport.newHauler("Komondor Transport", "John", "306-230-4355");
        transport.newHauler("Canways Transport", "Gray Singh", "306-999-0735");
        transport.newHauler("JHD Trucking", "Jason Dyck", "306-222-7081");
        transport.newHauler("MT Pockets", "Leonard Ens", "306-222-7190");
        transport.newHauler("Blanford Trucking", "Leonard Blanford", "306-222-8630");

        //adding drivers

        transport.newDriver("Gurmeet Singh", "39253950", "306-287-7780");
        transport.newDriver("Harry Singh", "37408572", "306-341-1677");
        transport.newDriver("Shane Heppner", "31926686", "306-717-0690");
        transport.newDriver("Garry Parenteau", "07733462", "306-715-2956");
        transport.newDriver("Tony Newton", "32916601", "396-361-6405");
        transport.newDriver("Gary Lindberg", "02235685", "306-717-9252");
        transport.newDriver("Larry Grunow", "08535130", "306-280-6767");
        transport.newDriver("Amanda Mark", "30330062", "306-260-7021");
        transport.newDriver("Stan Jickling", "09770983", "306-290-6562");
        transport.newDriver("Tyler Mark", "30346662", "306-230-4672");


        transport.newTruck(255, "Geransky Bros", "Tony Newton", 17100);
        transport.newTruck(192, "JHD Trucking", "Shane Heppner", 16500);
        transport.newTruck(84, "BBC Trucking", "Gary Lindberg", 17600);
        transport.newTruck(120, "Tyler Mark LTD", "Amanda Mark", 9500);
        transport.newTruck(58, "101034182 Sask LTD", "Stan Jickling", 16500);

        transport.displayTrucks(transport.getTruckList());
        transport.displayDrivers(transport.getTruckDrivers());
        transport.displayOwners(transport.getHaulers());
        Customer customer = new Customer("Brunners", false, 1);
        customer.addEmployee("Jimmy", "306-291-8096");
        customer.addEmployee("Scott", "306-280-5146");
        customer.printEmployees();


    }
}
