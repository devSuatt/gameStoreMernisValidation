package business.concretes;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import dataAccess.concretes.HibernateGameDao;
import entities.Game;

import java.util.List;

public class GameManager implements GameService {

    private GameDao gameDao = new HibernateGameDao();

    @Override
    public void add(Game game) {
        gameDao.add(game);
    }

    @Override
    public void delete(Game game) {
        gameDao.delete(game);
    }

    @Override
    public void update(Game game) {
        gameDao.update(game);
    }

    @Override
    public Game getById(int id) {
        return gameDao.getById(id);
    }

    @Override
    public List<Game> getAll() {
        return gameDao.getAll();
    }
}
