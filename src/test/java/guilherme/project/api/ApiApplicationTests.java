package guilherme.project.api;

import guilherme.project.api.Model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApiApplicationTests {

	@Test
	void contextLoads() {
	}




		@Test
		void deveCriarUsuario() {
			User user = new User(1, "Guilherme", "gui", "123");

			System.out.println(user);
		}
	}

