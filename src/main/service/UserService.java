package main.service;

import main.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    public void regist(User user);
}
