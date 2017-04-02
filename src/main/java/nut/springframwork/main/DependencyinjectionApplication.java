package nut.springframwork.main;

import nut.springframwork.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("nut.springframwork") //ใส่เมื่อย้ายไฟล์ main เพราะจะหา compoent ไม่เจอ
public class DependencyinjectionApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);

		GreetingController controller = (GreetingController) ctx.getBean("greetingController");

		controller.sayHello();
	}
}
