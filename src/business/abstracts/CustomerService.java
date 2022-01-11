package business.abstracts;

import entities.Customer;

import java.util.List;

public interface CustomerService {

    public void add(Customer customer);
    public void delete(Customer customer);
    public void update(Customer customer);
    public Customer getById(int id);
    public List<Customer> getAll();

}
