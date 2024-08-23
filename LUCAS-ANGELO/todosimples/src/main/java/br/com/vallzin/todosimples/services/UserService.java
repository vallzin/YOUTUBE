package br.com.vallzin.todosimples.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vallzin.todosimples.repositories.UserRepository;
import br.com.vallzin.todosimples.services.execptions.DataBindingViolationException;
import br.com.vallzin.todosimples.services.execptions.ObjectNotFoundException;
import jakarta.transaction.Transactional;

import br.com.vallzin.todosimples.models.User;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;


    public User findById(Long id){
        Optional<User> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException(
            "Usuário não encontrado! Id: " + id + ", Tipo: "+ User.class.getName()));
    }

    @Transactional
    public User create(User obj){
        obj.setId(null);
        obj = this.userRepository.save(obj);
        return obj;
    }

    @Transactional
    public User update(User obj){
        User newObj = findById(obj.getId());
        newObj.setPassword(obj.getPassword());
        return this.userRepository.save(newObj);
    }

    public void delete(Long id){
        findById(id);
        try {
            this.userRepository.deleteById(id);;
        } catch (Exception e) {
            throw new DataBindingViolationException( "Não é possível excluir pois há entidades relacionadas !");
        }
    }
    

}
