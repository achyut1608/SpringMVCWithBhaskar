package org.learn.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.learn.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

@Repository

public class UserDao {

    @Autowired
    SessionFactory sessionFactory;

    public void saveUser(User user){
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(user);
    }


}
