
package in.sb.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.sb.main.models.Task;
import in.sb.main.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String titleString) {
        Task task = new Task();

        task.setTitleString(titleString);
        task.setCompleted(false);

        taskRepository.save(task);
    }

    public void deleteTasks(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggletask(Long id) {

        Task task = taskRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid task id"));

        task.setCompleted(!task.isCompleted());

        taskRepository.save(task);
    }
}
