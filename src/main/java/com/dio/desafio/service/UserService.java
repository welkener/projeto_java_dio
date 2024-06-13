package com.dio.desafio.service;

import com.dio.desafio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
