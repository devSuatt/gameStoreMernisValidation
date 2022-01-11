package dataAccess.abstracts;

import entities.Campaign;

import java.util.List;

public interface CampaignDao {

    public void add(Campaign campaign);

    public void delete(Campaign campaign);

    public void update(Campaign campaign);

    public Campaign getById(int id);

    List<Campaign> getAll();

}
