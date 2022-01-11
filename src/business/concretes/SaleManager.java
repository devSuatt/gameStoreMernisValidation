package business.concretes;

import business.abstracts.CampaignService;
import business.abstracts.SaleService;
import entities.Campaign;
import entities.Customer;
import entities.Game;

public class SaleManager implements SaleService {

    CampaignService campaignService = new CampaignManager();

    @Override
    public void gameSale(Customer customer, Game game, Campaign campaign) {
        double discountedPrice = campaignService.calculatePrice(game.getPrice(), campaign.getPercentOfDiscount());
        if (campaignService.checkExpirationTime(campaign.getExpirationTime())) {
            System.out.println("!!! The campaign has EXPIRED !!!");
        }
        else if (customer.getBalanceInAccount() < discountedPrice) {
            System.out.println("!!! There is not enough money in the bank account !!!");
        }
        else System.out.println(customer.getFirstName() + " bought " + game.getName() + " for " +
                    discountedPrice + " $");
    }

}
