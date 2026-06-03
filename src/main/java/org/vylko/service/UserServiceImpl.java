package org.vylko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.vylko.dao.UserDAO;
import org.vylko.entity.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public void delete(Long id) {
        userDAO.delete(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
