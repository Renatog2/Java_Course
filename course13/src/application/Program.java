package application;

import java.util.Date;

import entites.enums.OrderStatus;
import entities.Order;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		System.out.println(os1);
		
		//Aqui ele procura pelo nome no enum
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(os2);
	}
}
