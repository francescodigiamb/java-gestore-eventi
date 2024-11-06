package it.milestone.java.gestione.eventi;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Creare una classe ProgrammaEventi con i seguenti attributi: 
 * - titolo: String
 * - eventi: List<Evento>
 * Nel costruttore valorizzare il titolo, passato come parametro,
 *  e inizializzare la lista di eventi come una nuova ArrayList
 * Aggiungere i seguenti metodi :
 * un metodo che aggiunge alla lista un Evento, passato come parametro
 * un metodo che restituisce una lista con tutti gli eventi presenti in una certa data
 * un metodo che restituisce quanti eventi sono presenti nel programma
 * un metodo che svuota la lista di eventi
 * un metodo che restituisce una stringa che mostra il titolo del programma
 *  e tutti gli eventi ordinati per data nella forma: 
 * data1 - titolo1
 * data2 - titolo2 
 * …
*/

public class ProgrammaEventi  {

	private String titolo;
	private List<Evento> eventi;
	
	public ProgrammaEventi (String titolo) {
		this.titolo = titolo;
		this.eventi = new ArrayList<>();
	}
	
	public String getTitolo () {
		return titolo;
	}
	
	public List<Evento> getEventi () {
		return eventi;
	}
	
	public void aggiungiEvento (Evento evento) {
		eventi.add(evento);
	} 
	
    public List<Evento> getEventiData(LocalDate data) {
        List<Evento> eventiInData = new ArrayList<>();
//      Per ogni elemento di tipo Evento presente nella collezione eventi, esegui il blocco di codice che segue
        for (Evento evento : eventi) {
            if (evento.getData().equals(data)) {
                eventiInData.add(evento);
            } 
        }
        if (eventiInData.isEmpty()) {
        	System.out.println("Nessun evento trovato.");
        }
        return eventiInData;
    }
		
    public int getNumeroEventi() {
        return eventi.size();
    }
    
    public void svuotaEventi() {
        eventi.clear();
    }
    
    @Override
    public String toString() {
        // Ordina gli eventi per data
        Collections.sort(eventi, (e1, e2) -> e1.getData().compareTo(e2.getData()));

        StringBuilder dataTitolo = new StringBuilder(titolo + ":\n");

        if (eventi.isEmpty()) {
            dataTitolo.append("Nessun evento trovato.");
        } else {
            for (Evento evento : eventi) {
                dataTitolo.append("- ").append(evento.toString()).append("\n");
            }
        }
        return dataTitolo.toString();
    }
    
}
