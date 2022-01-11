package dataAccess.abstracts;

import entities.Game;

import java.util.List;

public interface GameDao {

    public void add(Game game);

    public void delete(Game game);

    public void update(Game game);

    public Game getById(int id);

    List<Game> getAll();

}
