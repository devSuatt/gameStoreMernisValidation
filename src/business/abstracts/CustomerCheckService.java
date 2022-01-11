package business.abstracts;

import entities.Customer;

public interface CustomerCheckService {
    Boolean checkIfRealPerson(Customer customer);
}
