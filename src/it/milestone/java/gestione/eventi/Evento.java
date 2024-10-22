package it.milestone.java.gestione.eventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

	private String titolo;
	private LocalDate data;
	private int postiTotale;
	private int postiPrenotati;
	
	public Evento (String titolo, LocalDate data, int postiTotale) {
		this.titolo = titolo;
		this.data = data;
		this.postiTotale = postiTotale;
		this.postiPrenotati = 0;
		
		if (postiTotale <= 0) {
			throw new IllegalArgumentException("Errore, il numero di posti non può essere 0!");
		}
		
        if (data.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La data dell'evento non può essere passata!");
        }
		
	}
	
	public String getTitolo () {
		return titolo;
	}
	
	public void setTitolo (String titolo) {
		this.titolo = titolo;
	}
	
	public LocalDate getData () {
		return data;
	}
	
	public void setData (LocalDate data) {
		this.data = data;
	}
	
	public int getNumeroPostiTotale () {
		return postiTotale;
	}
	
	public int getNumeroPostiPrenotati () {
		return postiPrenotati;
	}
	
	public void prenotaPosto () {
		
		if (data.isBefore(LocalDate.now())) {
			System.out.println ("Mi dispiace non è possibile prenotare, l'evento è già passato!");
		}
		
		if (postiPrenotati > postiTotale) {
			System.out.println ("Mi dispiace non è possibile prenotare, l'evento è SOLD OUT!");
		}
		
		postiPrenotati ++;
		System.out.println ("Posto prenotato con successo!" + " Sono rimasti: " + (postiTotale - postiPrenotati) + " posti disponibili!");
	}
	
	public void prenotaPosto (int posti) {
		
		if (data.isBefore(LocalDate.now())) {
			System.out.println ("Mi dispiace non è possibile prenotare, l'evento è già passato!");
		}
		
		if (postiPrenotati > postiTotale) {
			System.out.println ("Mi dispiace non è possibile prenotare, l'evento è SOLD OUT!");
		}

	}
	
	public void disdiciPosto () {
		
		if (data.isBefore(LocalDate.now())) {
			System.out.println ("Mi dispiace non è possibile annullare, l'evento è già passato!");
		}
		
		if (postiPrenotati <= 0) {
			System.out.println ("Mi dispiace non ci sono prenotazioni da annullare per questo evento!");
		}
		
		postiPrenotati = postiPrenotati - 1;
		System.out.println ("Prenotazione annullata con successo!" + " Sono rimasti: " + (postiTotale - postiPrenotati) + " posti disponibili!");
	}
	
    private String formattaData() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formatter);
    }
	
	@Override 
	public String toString () {
		return formattaData () + " - " + titolo;
	}
}
