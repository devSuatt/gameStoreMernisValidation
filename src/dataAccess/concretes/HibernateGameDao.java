package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.Game;

import java.util.List;

public class HibernateGameDao implements GameDao {

    @Override
    public void add(Game game) {
        System.out.println(game.getName() + " game added to DB with Hibernate");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName() + " game deleted from DB with Hibernate");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName() + " game updated and saved to DB with Hibernate");
    }

    @Override
    public Game getById(int id) {
        return null;
    }

    @Override
    public List<Game> getAll() {
        return null;
    }
}
