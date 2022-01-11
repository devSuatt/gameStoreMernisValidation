package business.abstracts;

import entities.Campaign;
import entities.Customer;
import entities.Game;

public interface SaleService {

    public void gameSale(Customer customer, Game game, Campaign campaign);

}
