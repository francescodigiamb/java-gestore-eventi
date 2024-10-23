package it.milestone.java.gestione.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
/*		
 * 		PROVA STEP 1
 * 
		Evento primoEvento = new Evento ("Concerto", LocalDate.of(2024, 12, 25), 150);
		System.out.println (primoEvento);
		
		primoEvento.prenotaPosto();
		primoEvento.prenotaPosto();
		
		primoEvento.disdiciPosto();
		
		primoEvento.getNumeroPostiPrenotati();
		
		Evento eventoPassato = new Evento ("Ferragosto", LocalDate.of(2024, 8, 15), 200);
		System.out.println (eventoPassato);
*/
	
// 		STEP 2
		
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
		
		boolean rispostaPosti = false;
		
		while (!rispostaPosti) {
			System.out.println("Sono disponibili dei posti, vuoi prenotarli? (si/no)");
			String risposta = scan.next();
		if (risposta.equalsIgnoreCase("si")) {
			System.out.println("Quanti posti vuoi prenotare?");
        	int postiDaPrenotare = scan.nextInt();
        	for (int i = 0; i < postiDaPrenotare; i++) {
        		nuovoEvento.prenotaPosto();
        	}
        	System.out.println ("Posto/i prenotato/i con successo!" + " Sono rimasti: " + (postiTotali - postiDaPrenotare) + " posti disponibili!");
        	rispostaPosti = true;
        	} else if (risposta.equalsIgnoreCase("no")) {
        		System.out.println("Sono disponibili ancora: " + postiTotali);
        		rispostaPosti = true;
        	} else {
        		System.out.println("Errore! C'è stato un'errore nella digitazione, riprova!");
        	}
		
		}
		
		System.out.println("Sono stati prenotati: " + nuovoEvento.getNumeroPostiPrenotati() + " posti");
		System.out.println("Sono disponibili ancora: " + nuovoEvento.postiDisponibili() + " posti");
		
		boolean postiDisdetti = false;
		
		while (!postiDisdetti) {
			System.out.println("Hai dei biglietti prenotati e vuoi disdirli? (si/no)");
			String disdetta = scan.next();
		if (disdetta.equalsIgnoreCase("si")) {
			System.out.println("Quanti posti vuoi disdire?");
        	int postiDaDisdire = scan.nextInt();
        	for (int i = 0; i < postiDaDisdire; i++) {
        		nuovoEvento.prenotaPosto();
        	}
        		System.out.println ("Posto/i disdetto/i con successo!" + " Attualmente ci sono ancora " + (nuovoEvento.postiDisponibili() + postiDaDisdire) + " posti disponibili!");
        		postiDisdetti= true;
        	} else if (disdetta.equalsIgnoreCase("no")) {
        		System.out.println("Sono disponibili ancora: " + postiTotali);
        		postiDisdetti = true;
        	} else {
        		System.out.println("Errore! C'è stato un'errore nella digitazione, riprova!");
        	}
		}
		
		System.out.println("Sono stati prenotati: " + nuovoEvento.getNumeroPostiPrenotati() + " posti");
		System.out.println("Sono disponibili ancora: " + nuovoEvento.postiDisponibili() + " posti");
		
     } 
}
	
