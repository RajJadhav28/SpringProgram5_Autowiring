package in.quastech.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.quastech.bean.Employee;
import in.quastech.resource.SpringConfigFile;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Employee emp=(Employee)context.getBean("empObj");
		Employee emp1=context.getBean(Employee.class);//second method
		emp1.display();

	}

}
