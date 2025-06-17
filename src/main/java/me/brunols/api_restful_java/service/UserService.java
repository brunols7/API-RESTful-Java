package me.brunols.api_restful_java.service;

import me.brunols.api_restful_java.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
