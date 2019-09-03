package main.service.impl;

import main.dao.UserDAO;
import main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import main.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public void regist(User user) {
        userDAO.insert(user);
    }
}
