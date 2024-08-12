package br.com.vallzin.todosimples.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.vallzin.todosimples.models.Task;

public interface TaskRepositries extends JpaRepository<Task, Long>{

    List<Task> findByUser_Id(Long id);

    // @Query(value = "SELECT t FROM Task WHERE t.user.id = :id")
    // List<Task> findByUse_Id(@Param ("id") Long id);

    // @Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)
    // List<Task> findByUse_Id(@Param ("id") Long id);
    
}
