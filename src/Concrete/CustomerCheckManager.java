package Concrete;

import Abstracts.CustomerCheckService;
import Abstracts.CustomerService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
   return true;
    }
}
