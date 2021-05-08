package Adapters;

import Abstracts.CustomerCheckService;
import Entities.Customer;
import MernisService.EVPKPSPublicSoap;

import java.security.spec.ECField;


public class MernisServiceAdapters implements CustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {
        MernisService.EVPKPSPublicSoap client = new EVPKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDate().getYear());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }
}
