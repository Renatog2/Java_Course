package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();

		//Data no fuso horário de Londres (GMT)
		Instant d03 = Instant.now();
		
		//Formata textos para data ISO-8601
		LocalDate d04 = LocalDate.parse("2024-08-20");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-20T14:36:49");
		Instant d06 = Instant.parse("2024-08-20T14:36:49Z");
		
		//Consegue também converter do GMT -3 para o horário de Londres 
		Instant d07 = Instant.parse("2024-08-20T14:36:49-03:00");
		
		//Indicando um formato customizado para data ISO-8601
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("14/08/2024", dtf1);
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("14/08/2024 14:49", dtf2);
		LocalDate d10 = LocalDate.of(2024, 8, 14);
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 14, 14, 52);
		
		//Transformar uma data ISO-8601 para um formato custom
		String d12 = (LocalDate.now().format(dtf1));
		LocalDateTime d13 = LocalDateTime.now();
		LocalDateTime d14 = LocalDateTime.now();
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		Instant d15 = Instant.now();
		
		//Convertendo um horário de Londres para o fuso atual, note que o dia/mês muda devido a diferença de fuso
		Instant temp = Instant.parse("2024-08-01T01:02:03Z");
		LocalDate d16 = LocalDate.ofInstant(temp, ZoneId.systemDefault());
		LocalDateTime d17 = LocalDateTime.ofInstant(temp, ZoneId.systemDefault());
		
		//Convertendo um horário de Londres para o fuso de Portugal
		LocalDate d18 = LocalDate.ofInstant(temp, ZoneId.of("Portugal"));
		LocalDateTime d19 = LocalDateTime.ofInstant(temp, ZoneId.of("Portugal"));
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);
		System.out.println("d12: " + d12);
		System.out.println("d13: " + dtf2.format(d13));
		System.out.println("d14: " + d14.format(dtf2));
		System.out.println("d15: " + dtf3.format(d15));
		System.out.println("d16: " + d16);
		System.out.println("d17: " + d17);
		System.out.println("d18: " + d18);
		System.out.println("d19: " + d19);
		System.out.println("- - - - - - - - - - ");
		
		
		//Obter partes das Datas
		System.out.println("d19 dia do mês: " + d19.getDayOfMonth());
		System.out.println("d19 dia do ano: " + d19.getDayOfYear());
		System.out.println("d19 mês: " + d19.getMonthValue());
		System.out.println("d19 ano: " + d19.getYear());
		System.out.println("d19 hora: " + d19.getHour());
		System.out.println("d19 minuto: " + d19.getMinute());
		System.out.println("d19 segundo: " + d19.getSecond());
		System.out.println("- - - - - - - - - - ");
		
		
		//Operações com Datas
		//Reduz 7 dias
		LocalDate d20 = d01.minusDays(7);
		
		//Adiciona 7 dias
		LocalDate d21 = d01.plusDays(7);
		
		//Adiciona 30 Minutos
		LocalDateTime d22 = d02.plusMinutes(30);
		
		//Reduz 3 dias
		Instant d23 = d03.minus(3, ChronoUnit.DAYS);
		
		//Diferença entre 2 Datas, impresso em dias
		Duration d24 = Duration.between(d02, d05);
		
		System.out.println("d20: " + d20);
		System.out.println("d21: " + d21);
		System.out.println("d22: " + d22);
		System.out.println("d23: " + d23);
		System.out.println("d24: " + d24.toDays());
	}
}
