package it.milestone.java.gestione.eventi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		
// 	 	PROVA STEP 1 
//		
//		try {
//			Evento primoEvento = new Evento ("Concerto di Natale", LocalDate.of(2024, 12, 25), 150);
//			System.out.println (primoEvento);
//			primoEvento.prenotaPosto();
//			primoEvento.prenotaPosto();
//			
//			primoEvento.disdiciPosto();
//			System.out.println("Sono stati prenotati n." + primoEvento.getNumeroPostiPrenotati() + " biglietti");
//			System.out.println("Ci sono ancora " + primoEvento.postiDisponibili() + " posti");
//		
//		} catch (Exception e) {
//			System.err.println ("Errore nella data, è passata!");
//		}
//		
//		try {
//		Evento eventoPassato = new Evento ("Ferragosto", LocalDate.of(2024, 8, 15), 200);
//		System.out.println (eventoPassato);
//		} catch (Exception e) {
//			System.err.println ("Errore nella data, è passata!");
//		}
//	
// 		STEP 2

//
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.println ("Ciao, sei stato scelto per la creazione di un nuovo Evento!");
//
//            // Inserimento dati evento dentro un blocco try-catch per gestire eventuali eccezioni
//		try {
//            System.out.println("Inserisci il titolo dell'evento");
//            String titolo = scan.nextLine();
//
//            System.out.println("Inserisci la data dell'evento (formato dd/MM/yyyy)");
//            String dataStr = scan.nextLine();
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDate data = LocalDate.parse(dataStr, formatter);
//
//            System.out.println("Inserisci il numero totale di posti");
//            int postiTotali = scan.nextInt();
//
//            Evento evento = new Evento(titolo, data, postiTotali);
//            System.out.println("Evento creato con successo: " + evento);
//
//            // Prenotazione posti
//            System.out.println("Vuoi effettuare delle prenotazioni? (sì/no)");
//            String risposta = scan.next();
//            if (risposta.equalsIgnoreCase("si")) {
//                System.out.println("Quante prenotazioni vuoi fare?");
//                int numPrenotazioni = scan.nextInt();
//
//
//                for (int i = 0; i < numPrenotazioni; i++) {
//                    evento.prenotaPosto();
//                                    }
//            }
//
//            // Visualizza posti prenotati e disponibili
//            System.out.println("Posti prenotati: " + evento.getNumeroPostiPrenotati());
//            System.out.println("Posti disponibili: " + (evento.getNumeroPostiTotale() - evento.getNumeroPostiPrenotati()));
//
//            // Disdetta posti
//            System.out.println("Vuoi effettuare delle disdette? (sì/no)");
//            String secondaRisposta = scan.next();
//            if (secondaRisposta.equalsIgnoreCase("si")) {
//                System.out.println("Quante disdette vuoi fare?");
//                int numDisdette = scan.nextInt();
//
//                for (int i = 0; i < numDisdette; i++) {
//                    evento.disdiciPosto();
//                    
//                }
//            }
//
//            // Visualizza posti prenotati e disponibili dopo le disdette
//            System.out.println("Posti prenotati: " + evento.getNumeroPostiPrenotati());
//            System.out.println("Posti disponibili: " + (evento.getNumeroPostiTotale() - evento.getNumeroPostiPrenotati()));
//
//        } catch (IllegalArgumentException e) {
//            System.err.println("Errore data o numero posti sbagliati");
//        } catch (Exception e) {
//            System.err.println("Errore generico");
//        } finally {
//            scan.close();
//        }
//
//		
//		STEP3
		try {
		Concerto evento = new Concerto("Concerto di Natale", LocalDate.of(2024, 12, 25), 200);
		evento.setOra(LocalTime.of(12, 00));
		System.out.println ("L'ora del concerto è: " + evento.getOra());

		evento.setPrezzo(5.00);
		System.out.println ("Il prezzo del biglietto è: " + evento.getPrezzo());
		
		System.out.println(evento);
		} catch (Exception e) {
			System.err.println("L'evento è passato!");
		}
//		
//		
//		STEP 4 BONUS
		
//        // Creazione di un programma di eventi
//        ProgrammaEventi programma = new ProgrammaEventi("Eventi invernali");
//
//        // Creazione di alcuni eventi
//        Evento evento1 = new Evento("Concerto di Natale", LocalDate.of(2024, 12, 23), 200);
//        Evento evento2 = new Evento("Mercatini di Natale", LocalDate.of(2024, 12, 8), 300);
//        Evento evento3 = new Evento("Capodanno", LocalDate.of(2024, 12, 31), 150);
//        
//        // Aggiunta degli eventi al programma
//        programma.aggiungiEvento(evento1);
//        programma.aggiungiEvento(evento2);
//        programma.aggiungiEvento(evento3);
//
//        // Visualizzazione del programma con tutti gli eventi ordinati per data
//        System.out.println(programma.toString());
//
//        // Test dei metodi di ProgrammaEventi
//        System.out.println("Numero di eventi: " + programma.getNumeroEventi());
//        
//        // Filtraggio degli eventi per una data specifica
//        System.out.println("Evento/i presenti in una determinata data");
//        for (Evento evento : programma.getEventiData(LocalDate.of(2024, 12, 25))) {
//            System.out.println("- " + evento.getTitolo());
        }
      
    
     
}
	
