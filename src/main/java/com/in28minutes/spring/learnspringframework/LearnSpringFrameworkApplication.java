package com.in28minutes.spring.learnspringframework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.spring.learnspringframework.enterprise.example.bussiness.BussinessService;
import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		// MarioGame game=new MarioGame();
		// SuperContraGame game=new SuperContraGame();
		// Pacman game=new Pacman();

		GameRunner runner = context.getBean(GameRunner.class);
		// GameRunner runner=new GameRunner(game);
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBussinessService());
		
		
		BussinessService bean = context.getBean(BussinessService.class);
		
		
		
	

	}
 
}
