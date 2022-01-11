package business.abstracts;

import entities.Campaign;

import java.time.LocalDate;
import java.util.List;

public interface CampaignService {

    public void add(Campaign campaign);
    public void delete(Campaign campaign);
    public void update(Campaign campaign);
    public Campaign getById(int id);
    public List<Campaign> getAll();

    public double calculatePrice(double priceOfGame, int percentOfDiscount);
    public Boolean checkExpirationTime(LocalDate expirationTime);

}
