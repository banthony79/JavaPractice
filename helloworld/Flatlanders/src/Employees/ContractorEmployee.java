package Employees;

import Accounts.Accountlist;
import Accounts.Customer;

public class ContractorEmployee {

    public ContractorEmployee(Customer customer, String firstname, String lastname, String employeephonenumber, String email) {
        this.customer = customer;
        this.firstname = firstname;
        this.lastname = lastname;
        this.employeephonenumber = employeephonenumber;
        this.email = email;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmployeephonenumber() {
        return employeephonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmployeephonenumber(String employeephonenumber) {
        this.employeephonenumber = employeephonenumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Customer customer;
    private String firstname;
    private String lastname;
    private String employeephonenumber;
    private String email;




}

