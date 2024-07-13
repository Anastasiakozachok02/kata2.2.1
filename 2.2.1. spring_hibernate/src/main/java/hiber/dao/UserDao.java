package hiber.dao;

import hiber.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    void add(User user);

    Optional<User> getUserByModelAndSeries(String model, int series);

    List<User> listUsers();
}
