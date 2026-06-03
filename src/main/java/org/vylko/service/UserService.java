package org.vylko.service;

import org.vylko.entity.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    void save(User user);
    void delete(Long id);
    void update(User user);
    List<User> findAll();
}
