package adapters;

import business.abstracts.CustomerCheckService;
import entities.Customer;
import mernisService.USMKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

    @Override
    public Boolean checkIfRealPerson(Customer customer) {
        USMKPSPublicSoap client = new USMKPSPublicSoap();

        try {
            return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),
                    customer.getFirstName(),
                    customer.getLastName(),
                    customer.getDateOfBirth());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
