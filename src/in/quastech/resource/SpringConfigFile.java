package in.quastech.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.quastech.bean.Address;
import in.quastech.bean.Employee;

@Configuration
public class SpringConfigFile {
	
	@Bean
	Address addObj() {
		Address add=new Address();
		add.setLoc("Thane");
		add.setPin(421306);
		return add;
	}
	
	@Bean
	Employee empObj() {
		
		Employee emp=new Employee();
		emp.setEmpId(101);
		emp.setName("Quastech");
		//emp.setAdd(addObj());
		return emp;
		
	}

}
