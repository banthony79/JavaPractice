package Accounts;

import Employees.ContractorEmployee;

public class Accountlist {

    public static void main(String[] args) {

        Customer brunners = new Customer(010, "Brunners Construction",
                "(306) 934-2021",  false, "2614 Wentz Ave",
                "Saskatoon", "S7K 2L1");
        Customer Paramount = new Customer(011, "Paramount Paving",
                "(306) 242-6964", false, "804 47th St E",
                "Saskatoon,", "S7K 0X4");
        Customer Northern = new Customer(012, "Northern Blacktop",
                "(306) 955-2624", false, "64th St E",
                "Saskatoon", "S7K 8G6");
        Customer Acadia = new Customer(013, "Acadia Paving",
                "(306) 374-4738", true, "334 105th St E",
                "Saskatoon", "S7N 1Z3");
        Customer Hamm = new Customer(014, "Hamm Construction",
                "(306) 931-6626", true, "126 English Cres",
                "Saskatoon", "S7K 8A5");
        Customer Saskcon = new Customer(015, "Saskcon",
                "(306) 933-4948", false, "3219 Wells Cres",
                "Saskatoon", "S7K 5W4" );
        Customer Wehage = new Customer(016, "Don Wehage",
                "(306) 373-8800", false, "349 103 St E",
                "Saskatoon", "S7N 1Y9");

    }


}
