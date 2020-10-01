package Lessons.Lesson43.BrycesOffice;

import java.util.*;

public class Main {

    private static Map<String, Department> employees = new HashMap<>();

    public static void main(String[] args) {

        Office office = new Office("Bryce's Office");

        Department hr = new Department("HR"); 


        office.addEmployee("Bryce Looyenga", 52000, hr);
        office.addEmployee("Sue Storm", 55000, hr);
        office.addEmployee("James Wilson", 50000, hr);
        office.addEmployee("Ben Grimm", 36000, hr);

        hr.applyRaise(1.5);

        office.assignManager("Bryce Looyenga");

        Department sales = new Department("Sales");

        office.addEmployee("Soren Parker", 60000, sales);
        office.addEmployee("Keely Chapman", 54000, sales);
        office.addEmployee("Raina Fuentes", 50000, sales);
        office.addEmployee("Connor Foley", 45000, sales);
        office.addEmployee("Kobe Jacobson", 45900, sales);
        office.addEmployee("Cristian Vazquez", 50300, sales);

        office.assignManager("Connor Foley");
        sales.applyRaise(3);

        Department accounting = new Department("Accounting");

        office.addEmployee("Irvin Huerta", 49500, accounting);
        office.addEmployee("Kim Smith", 51300, accounting);
        office.addEmployee("Jonah Powell", 38500, accounting);
        office.addEmployee("Taryn Gilbert", 50000, accounting);
        office.addEmployee("Carlie Burnett", 49500, accounting);

        office.assignManager("Kim Smith");
        accounting.applyRaise(2);



        Department IT = new Department("IT");

        office.addEmployee("Kyle Hess", 59000, IT);
        office.addEmployee("Kaley Sosa", 51000, IT);
        office.addEmployee("Elisabeth Jacobs", 57000, IT);
        office.addEmployee("Karlie Flowers", 55000, IT);
        office.addEmployee("Darrell Gallagher", 57000, IT);

        office.assignManager("Kyle Hess");
        IT.applyRaise(3);


        IT.listEmployees();

        employees.put(hr.findManager().getName(), hr);
        employees.put(sales.findManager().getName(), sales);
        employees.put(accounting.findManager().getName(), accounting);
        employees.put(IT.findManager().getName(), IT);


       office.listAllEmployees();

       listEmployees();




    }

    public static void listEmployees() {

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println();
            System.out.println("Please enter manager name");
            String managerName = sc.nextLine();
            if (managerName.equals("Q") || managerName.equals("Quit")) {
                break;
            }

            employees.get(managerName).listEmployees();
        }

    }

}
