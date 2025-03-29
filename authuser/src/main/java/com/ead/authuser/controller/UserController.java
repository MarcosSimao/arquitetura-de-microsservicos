package com.ead.authuser.controller;

import com.ead.authuser.domain.model.UserModel;
import com.ead.authuser.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<List<UserModel>> getFindAll(){
        return ResponseEntity.ok().body(userService.getFindAll());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserModel>BuscarUserId(@PathVariable(value="userId")UUID userId){
        return ResponseEntity.ok().body(userService.findById(userId));
    }
}
