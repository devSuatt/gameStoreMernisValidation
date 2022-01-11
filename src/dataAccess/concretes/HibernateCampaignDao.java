package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.Campaign;

import java.util.List;

public class HibernateCampaignDao implements CampaignDao {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getName() + " campaign added to DB with Hibernate");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getName() + " campaign deleted from DB with Hibernate");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getName() + " campaign updated and saved to DB with Hibernate");
    }

    @Override
    public Campaign getById(int id) {
        return null;
    }

    @Override
    public List<Campaign> getAll() {
        return null;
    }
}
