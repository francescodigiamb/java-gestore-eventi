package it.milestone.java.gestione.eventi;

import java.time.LocalDate;
import java.time.LocalTime;
/*
 * Step 3
 * Creare una classe Concerto che estende Evento, che ha anche gli attributi :
 * ora (LocalTime)
 * prezzo
 * Aggiungere questi attributi nel costruttore e implementarne getter e setter.
 * Aggiungere i metodi per restituire data e ora formattata e prezzo formattato (##,##€)
 *  Fare l’ override del metodo toString()
 *   in modo che venga restituita una stringa del tipo: data e ora formattata - titolo - prezzo formattato
 */
import java.time.format.DateTimeFormatter;


public class Concerto extends Evento {

	private LocalTime ora;
	private double prezzo;
	
	
	public Concerto(String titolo, LocalDate data, int postiTotale) {
		super(titolo, data, postiTotale);
		this.ora = getOra();
		this.prezzo = getPrezzo();
	}
	
	public LocalTime getOra () {
		return ora;
	}
	
	public void setOra (LocalTime ora) {
		this.ora = ora;
	}
	
	public double getPrezzo () {
		return prezzo;
	}
	
	public void setPrezzo (double prezzo) {
		this.prezzo = prezzo;
	}
	
	

}
