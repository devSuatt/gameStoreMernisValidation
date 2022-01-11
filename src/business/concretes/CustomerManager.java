package business.concretes;

import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import dataAccess.abstracts.CustomerDao;
import dataAccess.concretes.HibernateCustomerDao;
import entities.Customer;

import java.util.List;

public class CustomerManager implements CustomerService {

    private CustomerDao customerDao = new HibernateCustomerDao();
    private CustomerCheckService customerCheckService;

    public CustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void add(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)) {
            customerDao.add(customer);
        }
        else System.out.println("no valid person");
    }

    @Override
    public void delete(Customer customer) {
        customerDao.delete(customer);
    }

    @Override
    public void update(Customer customer) {
        if (customerCheckService.checkIfRealPerson(customer)) {
            customerDao.update(customer);
        }
        else System.out.println("no valid person");
    }

    @Override
    public Customer getById(int id) {
        return customerDao.getById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerDao.getAll();
    }
}
