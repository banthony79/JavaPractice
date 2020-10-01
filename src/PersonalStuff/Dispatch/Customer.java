package PersonalStuff.Dispatch;


import java.util.ArrayList;

public class Customer {

    private String customerName;
    private boolean needPO;
    private int category;
    private ArrayList<Employee> employeeList;
    private ArrayList<Order> orderList;

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public Customer(String customerName, boolean needPO, int category) {
        this.customerName = customerName;
        this.needPO = needPO;
        if (category <= 0 || category > 4) {
            System.out.println("Category must be between one and four");
        }
        this.category = category;
        this.employeeList = new ArrayList<>();
        this.orderList = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean hasPO() {
        return needPO;
    }

    public int getCategory() {
        return category;
    }

    public Employee findEmployee(String employeeName) {
        for (int i = 0; i < employeeList.size(); i++) {
            Employee testEmployee = employeeList.get(i);
            if (employeeList.get(i).getEmployeeName().equals(employeeName)) {
                return testEmployee;
            }
        }
        return null;
    }

    public boolean addEmployee(String employeeName, String phoneNumber) {
        if (findEmployee(employeeName) == null) {
            employeeList.add(new Employee(employeeName, phoneNumber));
            return true;

        }
        return false;
    }

    public void printEmployees() {
        System.out.println("");
        System.out.println(getCustomerName() + " Employee List");
        System.out.println("================");
        for (int i = 0; i < employeeList.size(); i++) {
            Employee testEmployee = employeeList.get(i);
            System.out.println(testEmployee.toString());
        }
        System.out.println("Employee Count - " + employeeList.size());
    }


    public class Employee {

        private String employeeName;
        private String phoneNumber;

        public Employee(String employeeName, String phoneNumber) {
            this.employeeName = employeeName;
            this.phoneNumber = phoneNumber;
        }

        public String getEmployeeName() {
            return employeeName;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        @Override
        public String toString() {
            return employeeName + " - " + phoneNumber;
        }
    }

}
