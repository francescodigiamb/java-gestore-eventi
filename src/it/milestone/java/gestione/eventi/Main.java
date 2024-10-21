package it.milestone.java.gestione.eventi;

import java.time.LocalDate;

public class Main {

	public static void main(String [] args) {
		
		Evento primoEvento = new Evento ("Concerto", LocalDate.of(2024, 12, 25), 150);
		System.out.println (primoEvento);
		
		primoEvento.prenotaPosto();
		primoEvento.prenotaPosto();
		
		primoEvento.disdiciPosto();
		
		primoEvento.getNumeroPostiPrenotati();
		
		Evento eventoPassato = new Evento ("Ferragosto", LocalDate.of(2024, 8, 15), 200);
		System.out.println (eventoPassato);
	}
	
}
