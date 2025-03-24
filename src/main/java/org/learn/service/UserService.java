package org.learn.service;

import org.learn.dao.UserDao;
import org.learn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    @Transactional
    public void save(User user)
    {
        userDao.saveUser(user);

    }


}
