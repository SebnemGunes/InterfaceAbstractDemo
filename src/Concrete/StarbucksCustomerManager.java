package Concrete;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Abstracts.CustomerService;
import Entities.Customer;
public class StarbucksCustomerManager extends BaseCustomerManager {  //need verification
    private CustomerCheckService _customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    @Override
    public void save(Customer customer) {
        if(_customerCheckService.checkIfRealPerson(customer)){  //customer verification
            super.save(customer);
        }
     else {
         System.out.println("Not a valid person");
        }
    }
   /* public void checkIfRealPerson(Customer customer){*/


}
