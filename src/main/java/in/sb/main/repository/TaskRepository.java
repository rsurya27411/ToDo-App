package in.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sb.main.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
