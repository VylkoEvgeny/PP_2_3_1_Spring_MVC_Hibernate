package org.vylko.dao;

import org.vylko.entity.User;

import java.util.List;

public interface UserDAO {
    User findById(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
    List<User> findAll();
}
