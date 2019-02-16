package com.sunilkumar.server.dao;

import com.sunilkumar.server.model.Users;
import com.sunilkumar.server.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDAO {

    @Autowired
    UserRepository userRepository;

    @Transactional
    public Users addUser(Users users) {
        return userRepository.save(users);
    }
}
