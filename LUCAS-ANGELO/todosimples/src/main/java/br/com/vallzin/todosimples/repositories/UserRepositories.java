package br.com.vallzin.todosimples.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.vallzin.todosimples.models.User;


@Repository
public interface UserRepositories extends JpaRepository<User, Long>{

    
}
