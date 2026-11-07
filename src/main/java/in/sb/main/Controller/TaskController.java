
package in.sb.main.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sb.main.Service.TaskService;
import in.sb.main.models.Task;

@Controller
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/")
    public String getTasks(Model model) {
        List<Task> alltasks = taskService.getAllTasks();
        model.addAttribute("alltasks", alltasks);
        return "tasks";
    }

    @PostMapping("/")
    public String createTask(@RequestParam String titleString) {
        taskService.createTask(titleString);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTasks(id);
        return "redirect:/";
    }

    @GetMapping("/toggle/{id}")
    public String toggleTask(@PathVariable Long id) {
        taskService.toggletask(id);
        return "redirect:/";
    }
}
