package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class ReservationGood {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	
	// Constructors
	public ReservationGood(Integer roomNumber, Date checkIn, Date checkOut) {
		// Tratamento caso a data final for menor que a data inicial
		if(!checkOut.after(checkIn)) {
			throw new IllegalArgumentException("Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	
	// Getters and Setters
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	
	// Methods
	// Esse método transforma as datas em milisegundos e retorna a diferença entre eles convertendo em dias novamente
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	// Agora utilizando throw para retornar qualquer erro
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		
		// 1º Validação, data inicial/final ser menor que a hoje
		if(checkIn.before(now) || checkOut.before(now)) {
			//Dessa forma eu estou usando um pacote padrão do Java para tratar a exceção que pode ser gerada
			throw new IllegalArgumentException("Reservation dates for update must be future dates");
		}
		
		// 2º Validação, data final ser menor que a inicial
		if(!checkOut.after(checkIn)) {
			//Dessa forma eu estou usando um pacote próprio para tratar a exceção
			throw new DomainException("Check-out date must be after check-in date");
		}
		
		// Somente se passar pelas 2 condições acima é que vai realizar a operação abaixo
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber + ", check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut) + ", " + duration() + " nights";
	}
}
