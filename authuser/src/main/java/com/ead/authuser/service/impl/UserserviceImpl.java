package com.ead.authuser.service.impl;

import com.ead.authuser.domain.model.UserModel;
import com.ead.authuser.repository.UserRepository;
import com.ead.authuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserserviceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<UserModel> getFindAll() {
        return userRepository.findAll();
    }

    @Override
    public UserModel findById(UUID userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public void delete(UserModel userModel) {

    }
}
