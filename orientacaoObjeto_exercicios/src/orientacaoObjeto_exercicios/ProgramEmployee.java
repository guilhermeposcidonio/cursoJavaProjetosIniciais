package orientacaoObjeto_exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name :");
		employee.name = sc.nextLine();
		
		System.out.println("Gross salary :");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax :");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee :" + employee);
		
		//adiciona um percentual ao salario
		System.out.println("Which percentage to increase salary?");
		Double percentage = sc.nextDouble();
		employee.increseSalary(percentage);
		
		System.out.println("Update salary: " + employee);
		sc.close();
	}

}
