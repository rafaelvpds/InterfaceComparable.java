package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		String path = "D:\\Curso\\Curso Java\\1-Codigos Alula\\Temp\\names.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCSV = br.readLine();

			while (employeeCSV != null) {
				String[] fields = employeeCSV.split(",");
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCSV = br.readLine();
			}

			// Ordenar uma coleção
			Collections.sort(list);
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + "R$ " + emp.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}