package business.concretes;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import dataAccess.concretes.HibernateCampaignDao;
import entities.Campaign;
import java.time.LocalDate;
import java.util.List;

public class CampaignManager implements CampaignService {

    private CampaignDao campaignDao = new HibernateCampaignDao();

    @Override
    public void add(Campaign campaign) {
        campaignDao.add(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        campaignDao.delete(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        campaignDao.update(campaign);
    }

    @Override
    public Campaign getById(int id) {
        return campaignDao.getById(id);
    }

    @Override
    public List<Campaign> getAll() {
        return campaignDao.getAll();
    }

    public double calculatePrice(double priceOfGame, int percentOfDiscount) {
        return priceOfGame - priceOfGame * percentOfDiscount / 100;
    }

    public Boolean checkExpirationTime(LocalDate expirationTime) {
        LocalDate today = LocalDate.now();
        return today.isAfter(expirationTime);
    }

}
