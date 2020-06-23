package com.springbootTemplate20.config.security;

import com.springbootTemplate20.model.User;
import com.springbootTemplate20.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(userName);
        if (user.isPresent()) {
            return user.get();
        }
        throw new UsernameNotFoundException("User not found.");
    }

}
