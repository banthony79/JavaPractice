/*/
package July10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Bank {
    private Manager manager;
    private List <Employee> employees;
    private List<July5.Account> accounts;

    public Bank(Manager manager) {
        this.manager = manager;
        this.employees = new LinkedList<>();
        this.accounts = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);

    //public void fireEmployee(int employeeId) {
        //for (Employee e: employees) {
            //if (e.getId() == employeeId);
            //employees.remove(e);
        }



        }

    }

    public void addAccount(July5.Account account) {
        accounts.add(account);
    }

    public void removeAccount(int accountNumber) {
      for(July5.Account a: accounts) {
          if (a.getNumber() ==  accountNumber);
          accounts.remove(a);
      }
    }

}


/*/