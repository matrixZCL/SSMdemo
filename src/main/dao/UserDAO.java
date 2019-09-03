package main.dao;

import main.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    void insert(User user);
}
