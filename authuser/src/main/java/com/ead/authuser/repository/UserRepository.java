package com.ead.authuser.repository;

import com.ead.authuser.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

    List<UserModel> findAll();

    Optional<UserModel> findById(UUID uuid);

    void delete(UserModel userModel);
}
