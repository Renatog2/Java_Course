package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Employee> list = new ArrayList<>();
		
		
		System.out.print("Enter the number of employees: ");
		int number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			
			// Dessa forma consigo obter apenas uma letra
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			
			if(op == 'y') {
				System.out.print("Additional charge: ");
				double add = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, hours, value, add));
			} else {
				list.add(new Employee(name, hours, value));
			}
		}

		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ - " + String.format("%.2f",  emp.payment()));
		}
		
		
		sc.close();
	}
}
