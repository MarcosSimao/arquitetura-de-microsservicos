package com.ead.authuser.service;

import com.ead.authuser.domain.model.UserModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface UserService {
     List<UserModel> getFindAll();
     UserModel findById(UUID userId);
     void delete(UserModel userModel);
}
