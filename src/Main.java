import adapters.MernisServiceAdapter;
import business.abstracts.CustomerService;
import business.abstracts.SaleService;
import business.concretes.CustomerCheckManager;
import business.concretes.CustomerManager;
import business.concretes.SaleManager;
import entities.Campaign;
import entities.Customer;
import entities.Game;
import mernisService.USMKPSPublicSoap;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        USMKPSPublicSoap client = new USMKPSPublicSoap();
        Customer customer1 = new Customer(1, "suat", "TÜRKOĞLU", 1996,
                "TC_KIMLIK_NO", 38.50);
        Game game1 = new Game(1, "League of Legends", 29.90);
        Campaign campaign1 = new Campaign(1, "newyear2022", 15,
                LocalDate.of(2021, 12, 26), LocalDate.of(2022, 01, 12));

        CustomerService customerService = new CustomerManager(new MernisServiceAdapter());
        customerService.add(customer1);

        SaleService saleService = new SaleManager();
        saleService.gameSale(customer1, game1, campaign1);

    }

}
