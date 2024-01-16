package entities;

import entities.enums.WorkerLevel;

public class Employee {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	public Employee() {
		
	}
	
	public Employee (String name, WorkerLevel level, Double baseSalary) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	


}
