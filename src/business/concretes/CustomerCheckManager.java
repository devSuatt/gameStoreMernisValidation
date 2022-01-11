package business.concretes;

import business.abstracts.CustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public Boolean checkIfRealPerson(Customer customer) {
        return true;
    }

}
