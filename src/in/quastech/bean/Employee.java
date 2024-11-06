package in.quastech.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	private int empId;
	private String name;
	@Autowired
	private Address add;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Address getAdd() {
//		return add;
//	}
//	public void setAdd(Address add) {
//		this.add = add;
//	}
	
	public void display() {
		System.out.println("EmpId:"+empId);
		System.out.println("EmpName:"+name);
		System.out.println("EmpAddress:"+add);
	}

}
