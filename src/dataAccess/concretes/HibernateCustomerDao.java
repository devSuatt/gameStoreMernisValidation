package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

import java.util.List;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println(customer.getFirstName() + " customer added to DB with Hibernate");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getFirstName() + " customer deleted from DB with Hibernate");
    }

    @Override
    public void update(Customer customer) {
        System.out.println(customer.getFirstName() + " customer updated and saved to DB with Hibernate");
    }

    @Override
    public Customer getById(int id) {
        return null;
    }

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
