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
	 
	public String formattaDataOra () {
    DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formOra = DateTimeFormatter.ofPattern("HH:mm");
	return  getData().format(formatData) + "-" + getOra().format(formOra);
	}
	
    public String formattaPrezzo() {
        DecimalFormat formatPrezzo = new DecimalFormat("##,##0.00€");
        return formatPrezzo.format(prezzo);
    }
	
	@Override 
	public String toString () {
		return formattaDataOra() + " - " + getTitolo() + " - " + formattaPrezzo();
	}
}
