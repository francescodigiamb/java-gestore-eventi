package it.milestone.java.gestione.eventi;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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


public class Concerto extends Evento {

	private LocalTime ora;
	private double prezzo;
	
	// Costruttore 
	public Concerto(String titolo, LocalDate data, int postiTotale) {
		super(titolo, data, postiTotale);
		this.ora = getOra();
		this.prezzo = getPrezzo();
	}
	// Metodo get per l'ora
	public LocalTime getOra () {
		return ora;
	}
	// Metodo set per l'ora 
	public void setOra (LocalTime ora) {
		this.ora = ora;
	}
	// Metodo get per il prezzo 
	public double getPrezzo () {
		return prezzo;
	}
	// Metodo set per il prezzo
	public void setPrezzo (double prezzo) {
		this.prezzo = prezzo;
	}
	// Metodo per formattare la data e l'ora e restituirlo formato data 
	public String formattaDataOra () {
    DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formOra = DateTimeFormatter.ofPattern("HH:mm");
	return  data.format(formatData) + "-" + getOra().format(formOra);
	}
	// Metodo per formattare il prezzo e restituirlo formato stringa
    public String formattaPrezzo() {
        DecimalFormat formatPrezzo = new DecimalFormat("##,##0.00€");
        return formatPrezzo.format(prezzo);
    }
	
	@Override 
	public String toString () {
		return formattaDataOra() + " - " + titolo + " - " + formattaPrezzo();
	}
}
