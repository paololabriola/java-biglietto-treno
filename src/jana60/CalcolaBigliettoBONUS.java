package jana60;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalcolaBigliettoBONUS {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat(".00");
	
	float chilometriDaPercorrere, prezzoBigliettoScontato;
	int etaPasseggero;
	
	System.out.print("Inserisci il numero di chilometri da percorrere: ");
	chilometriDaPercorrere = scan.nextFloat();
	System.out.print("Inserisci l'età del passeggero: ");
	etaPasseggero = scan.nextInt();
	
	float prezzoBiglietto = chilometriDaPercorrere * 0.21f;
	float scontoMinorenni = (prezzoBiglietto * 20) / 100;
	float scontoOver65 = (prezzoBiglietto * 40) / 100;
	
	if(etaPasseggero < 18) {
		prezzoBigliettoScontato = prezzoBiglietto - scontoMinorenni;
	}else if(etaPasseggero > 65){
		prezzoBigliettoScontato = prezzoBiglietto - scontoOver65;
	}else {
		prezzoBigliettoScontato = prezzoBiglietto;
	}
	
	System.out.println("Il prezzo finale del biglietto scontato è di: " + df.format(prezzoBigliettoScontato) + "€");
	
	scan.close();
	
	}
}
