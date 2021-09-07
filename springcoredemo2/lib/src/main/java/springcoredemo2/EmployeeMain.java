package springcoredemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.controller.EmployeeController;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
		
		EmployeeController controller = (EmployeeController) context.getBean("empController");
		
		controller.createEmployee();
		
		context.close();

	}

}
