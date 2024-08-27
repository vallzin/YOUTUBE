package br.com.vallzin.todosimples.services.execptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.vallzin.todosimples.models.User;
import br.com.vallzin.todosimples.repositories.UserRepository;
import br.com.vallzin.todosimples.security.UserSpringSecurity;

import java.util.*;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = this.userRepository.findByUsername(username);
        if(Objects.isNull(user))
            throw new UsernameNotFoundException("Usuário não encontrado: "+username);
    
        return new UserSpringSecurity(user.getId(), user.getUsername(), user.getPassword(), user.getProfile());
    
        
       
    }

}
