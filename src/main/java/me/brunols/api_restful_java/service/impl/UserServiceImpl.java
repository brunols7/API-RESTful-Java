package me.brunols.api_restful_java.service.impl;

import me.brunols.api_restful_java.model.User;
import me.brunols.api_restful_java.repository.UserRepository;
import me.brunols.api_restful_java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userToCreate.getId() != null && repository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("This User ID already exists.");
        }
        return repository.save(userToCreate);
    }
}
