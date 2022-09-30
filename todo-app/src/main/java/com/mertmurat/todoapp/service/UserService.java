package com.mertmurat.todoapp.service;

import com.mertmurat.todoapp.models.User;
import com.mertmurat.todoapp.request.UserRegistrationRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationRequest userRegistrationRequest);
}
