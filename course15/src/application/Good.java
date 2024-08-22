package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.ReservationGood;
import model.exceptions.DomainException;

public class Good {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		// O código dessa forma fica extremamente limpo e com melhor performance
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			ReservationGood reservation = new ReservationGood(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
		
		// Tratamento para erros de digitação
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Room format");
		
		// Retorno dos tratamentos na Classe Reservation
		} catch (IllegalArgumentException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		
		// Utilizando o pacote prórpio no tratamento
		} catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		
		// Tratamento geral para qualquer erro que venha a ocorrer não visto anteriormente
		} catch (RuntimeException e) {
			 System.out.println("Unexpected error: " + e.getMessage());
		}
		 
		
		sc.close();
	}
}
