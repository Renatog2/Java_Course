package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private static SimpleDateFormat sdfP = new SimpleDateFormat("dd/MM/yyyy");
	
	
	private String name;
	private String email;
	private Date birthDate;
	
	
	//Constructors
	public Client() {
		
	}
	
	public Client(String name, String email, Date birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
	//Methods
	@Override
	public String toString() {
		return "Client: " + name + "("+ sdfP.format(birthDate) +") - "+ email;
	}
	
}
