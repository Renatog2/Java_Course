package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entites.Department;
import entites.HourContract;
import entites.Worker;
import entites.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String departmentName;
		String workerName;
		String workerLevel;
		Double baseSalary;
		int quantity;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String mY;
		
		
		System.out.print("Enter department's name: ");
		departmentName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		workerName = sc.nextLine();
		System.out.print("Level: ");
		workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		System.out.print("How many contracts to this worker? ");
		quantity = sc.nextInt();
		for(int i=1; i<=quantity; i++) {
			System.out.println("Enter contract #"+ i +" data:");
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.printf("\nEnter month and year to calculate income (MM/YYYY): ");
		mY = sc.next();
		int month = Integer.parseInt(mY.substring(0, 2));
		int year = Integer.parseInt(mY.substring(3));
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for " + mY + ": " + String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}
}
