import Abstracts.BaseCustomerManager;
import Abstracts.CustomerService;
import Adapters.MernisServiceAdapters;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapters());
        customerManager.save(new Customer(1,"Şebnem","Güneş",new Date(1999),"36208694604"));
    }
}
