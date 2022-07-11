package io.getarrays.userservice;

import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.domain.User;
import io.getarrays.userservice.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class UserserviceApplication {

	public static void main(String[] args) {

		SpringApplication.run(UserserviceApplication.class, args);

		/*System.out.println("Yes! A weekend well spent. Thank You Jesus!");*/

	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_MANAGER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));
			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,
					"Victor Shaviya",
					"shavic",
					"shavic@gmail.com",
					"123456",
					new ArrayList<>()
					));
			userService.saveUser(new User(null,
					"Josphine Mbaisi",
					"jomba",
					"jomba@gmail.com",
					"123456",
					new ArrayList<>()
			));
			userService.saveUser(new User(null,
					"Norris Ambune",
					"norra",
					"norra@gmail.com",
					"123456",
					new ArrayList<>()
			));
			userService.saveUser(new User(null,
					"Lloyd McBean",
					"mc",
					"mc@gmail.com",
					"123456",
					new ArrayList<>()
			));

			userService.addRoleToUser("shavic", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("shavic", "ROLE_ADMIN");
			userService.addRoleToUser("jomba", "ROLE_ADMIN");
			userService.addRoleToUser("jomba", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("norra", "ROLE_MANAGER");
			userService.addRoleToUser("mc", "ROLE_USER");
			userService.addRoleToUser("norra", "ROLE_SUPER_ADMIN");
			userService.addRoleToUser("shavic", "ROLE_USER");

		};
	}

}
