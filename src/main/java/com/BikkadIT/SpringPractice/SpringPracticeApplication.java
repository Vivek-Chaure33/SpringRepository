package com.BikkadIT.SpringPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SpringPractice.Controller.ReportController;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringPracticeApplication.class, args);
		ReportController controller = ctx.getBean(ReportController.class);
		String report = controller.generateReport();
		System.out.println(report);
	}

}
