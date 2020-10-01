package PersonalStuff.Flatlanders;

public class Main {

    public static void main(String[] args) {


        Customer brunners = new Customer("Brunners", "306-934-1775", false);
        Product basegravel = new Product("Base", "Screened gravel", 1001);
        Product subbase = new Product("Subbase", "Screened gravel", 1002);
        Address elmSt = new Address("123 Elm St", "");
        Address weyakwin = new Address("100 SetMain St", "Langham");
        Employee jimmy = new Employee("Jimmy", "306-291-8096", brunners);
        Employee scott = new Employee("Scott", "306-280-5146", brunners);
        Truck T43 = new Truck(43, false);
        Truck T120 = new Truck(120, true);
        Order order = new Order(1001, brunners, jimmy, basegravel, elmSt, 120, "");
        Order order2 = new Order(1002, brunners, scott, basegravel, weyakwin, 30, "");
        order.orderReadOut();
        order.dispatched(T43);
        order.delivered(T43);
        order.delivered(T43);
        order.delivered(T43);
        order2.delivered(T43);
        order2.orderReadOut();
        order2.dispatched(T120);
        order2.delivered(T120);


    }
}
