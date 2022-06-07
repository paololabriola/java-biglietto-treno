package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float chilometriDaPercorrere, prezzoBigliettoScontato;
		int etaPasseggero;
		
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		chilometriDaPercorrere = scan.nextFloat();
		System.out.println("Inserisci l'età del passeggero: ");
		etaPasseggero = scan.nextInt();
		
		float prezzoBiglietto = chilometriDaPercorrere * 0.21f;
		
		if(etaPasseggero < 18) {
			prezzoBigliettoScontato = (prezzoBiglietto * 20) / 100;
		}else if(etaPasseggero>65){
			prezzoBigliettoScontato = (prezzoBiglietto * 40) /100;
		}else {
			prezzoBigliettoScontato = prezzoBiglietto;
		}
		
		System.out.println("Il prezzo finale del biglietto è di: " + prezzoBigliettoScontato);
		
		scan.close();
		
	}

}
