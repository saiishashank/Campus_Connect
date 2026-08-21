package com.CampusConect.util;

import com.CampusConect.entity.User;
import com.CampusConect.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailsIServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByEmail(username).orElseThrow(()->new RuntimeException("user not found"));
        return new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPasswordHash(), List.of(new SimpleGrantedAuthority("ROLE_"+user.getRole())));
    }
}
