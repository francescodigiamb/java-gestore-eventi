package it.milestone.java.gestione.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
/*		
		Evento primoEvento = new Evento ("Concerto", LocalDate.of(2024, 12, 25), 150);
		System.out.println (primoEvento);
		
		primoEvento.prenotaPosto();
		primoEvento.prenotaPosto();
		
		primoEvento.disdiciPosto();
		
		primoEvento.getNumeroPostiPrenotati();
		
		Evento eventoPassato = new Evento ("Ferragosto", LocalDate.of(2024, 8, 15), 200);
		System.out.println (eventoPassato);
*/
	
/*
 * Creare una classe Main di test, in cui si chiede all’utente di inserire un nuovo evento con tutti i parametri. 
 * Dopo che l’evento è stato istanziato, chiedere all’utente se e quante prenotazioni vuole fare e provare ad effettuarle, implementando opportuni controlli
 * Stampare a video il numero di posti prenotati e quelli disponibili
 * Chiedere all’utente se e quanti posti vuole disdire
 * Provare ad effettuare le disdette, implementando opportuni controlli
 * Stampare a video il numero di posti prenotati e quelli disponibili
*/
		Scanner scan = new Scanner (System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println ("Ciao, sei stato scelto per la creazione di un nuovo Evento!");

		System.out.println ("Inserisci il titolo dell'Evento");
		String nome = scan.nextLine();

        LocalDate dataEvento = null;
        boolean dataValida = false;

        while (!dataValida) {
            System.out.print("Inserisci la data dell'evento (formato: gg/mm/aaaa): ");
            String data = scan.nextLine();

            try {
                dataEvento = LocalDate.parse(data, formatter);
                dataValida = true;
            } catch (DateTimeParseException e) {
                System.out.println("Formato della data non valido. Riprova.");
            }
        }
        
        int postiTotali = 0;
        boolean postiValidi = false;
        
        while (!postiValidi) {
        	System.out.println ("Inserisci la capienza massima dell'Evento");
        	int posti = scan.nextInt();
        	
        		if (posti > postiTotali) {
        			postiTotali = posti;
        			postiValidi = true;
        		} else {
        			System.out.println("Numero posti inserito sbagliato, riprova!");
        		}
        }
		
		
		Evento nuovoEvento = new Evento(nome, dataEvento, postiTotali);
		System.out.println ("Il titolo dell'Evento è: " + nuovoEvento.getTitolo());
		System.out.println ("La data dell'Evento è il: " + nuovoEvento.getData());
		System.out.println ("La capienza massima dell'Evento è: " + nuovoEvento.getNumeroPostiTotale());
		
		System.out.println("Sono disponibili dei posti, vuoi prenotarli?");
		String risposta = scan.next();
		
		if (risposta.equalsIgnoreCase("si")) {
			System.out.println("Quanti posti vuoi prenotare?");
        	int postiDaPrenotare = scan.nextInt();
        	nuovoEvento.prenotaPosto(postiDaPrenotare);
        	System.out.println ("Posto prenotato con successo!" + " Sono rimasti: " + (postiTotali - postiDaPrenotare) + " posti disponibili!");
        	} else {
        		System.out.println("Sono disponibili ancora: " + postiTotali);
        	}
		
        } 
}
	
