package com.personal.keeper.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.personal.keeper.entity.User;
import com.personal.keeper.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private UserRepository repository;

    public CustomUserDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = repository.findUserByUsername(username)
        
                .orElseThrow(() -> new UsernameNotFoundException("User not present"));
        return user;
    }
    public void createUser(UserDetails user) {
        repository.save((User) user);
    }
}
