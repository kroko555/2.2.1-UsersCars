package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void add(User user, Car car);
   @SuppressWarnings("unchecked")
   User getUserByCar(String model, int series);

}
