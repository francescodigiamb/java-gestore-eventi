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
	// Costruttore
	public ProgrammaEventi (String titolo) {
		this.titolo = titolo;
		this.eventi = new ArrayList<>();
	}
	// Metodo get per il titolo
	public String getTitolo () {
		return titolo;
	}
	// Metodo get per l'array
	public List<Evento> getEventi () {
		return eventi;
	}
	// Metodo per aggiungere un evento all'arraylist
	public void aggiungiEvento (Evento evento) {
		eventi.add(evento);
	} 
	// Metodo che restituisce gli eventi presenti in una determinata data
    public List<Evento> getEventiData(LocalDate data) {
        List<Evento> eventiInData = new ArrayList<>();
        for (Evento evento : eventi) {
            if (evento.getData().equals(data)) {
                eventiInData.add(evento);
            }
        }
        return eventiInData;
    }
	// Metodo che restituisce il totale degli eventi presenti	
    public int getNumeroEventi() {
        return eventi.size();
    }
    // Metodo che svuota l'array
    public void svuotaEventi() {
        eventi.clear();
    }
    // Metodo che restituisce una stringa che mostra il titolo del programma
//    e tutti gli eventi ordinati per data
    public String toString() {
        StringBuilder dataTitolo = new StringBuilder("Programma: " + titolo + "\n");
//       Ordina gli eventi per data, la doppia punteggiatura sta ad indicare
//		 l'operatore di method reference in Java è una scorciatoia che indica 
//       usa il metodo getData di Evento per ogni oggetto della lista.
        Collections.sort(eventi, Comparator.comparing(Evento::getData)); 
//     for-each, è come se gli stiamo dicendo: per ogni evento nella lista eventi, appendi data e evento 
        for (Evento evento : eventi) {
            dataTitolo.append(evento.getData()).append(" - ").append(evento.getTitolo()).append("\n");
        }
        
        return dataTitolo.toString();
    }
    
}
