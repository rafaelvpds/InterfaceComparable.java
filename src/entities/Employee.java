package entities;

public class Employee implements Comparable<Employee> {
	private String name;
	private Double salary;

	public Employee() {

	}

	public Employee(String name, Double salary) {

		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	// comparar um objeto com outro
	public int compareTo(Employee outher) {
		// ordernar por nome
		// return name.compareTo(outher.getName());

		// Ordernar por salario crescente
		// return salary.compareTo(outher.getSalary());

		// Ordernar por salario decrescente
		return -salary.compareTo(outher.getSalary());
	}

}
