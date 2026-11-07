package in.sb.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoLAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoLAppApplication.class, args);
		System.out.println("Hello");
	}

}
