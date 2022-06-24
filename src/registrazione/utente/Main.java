package registrazione.utente;

import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan= new Scanner(System.in); 
	
    try {
	System.out.println("Inserisci i dati richiesti:");
	System.out.print("Inserire nome: ");
	String regnome=scan.nextLine();
	System.out.print("Inserire cognome: ");
	String regcognome=scan.nextLine();
	System.out.print("Inserire e-mail: ");
	String regmail=scan.nextLine();
	System.out.print("Inserire password 8 - 12 caratteri: ");
	String regpass= scan.nextLine();
	System.out.print("Inserire età: ");
	int regeta= scan.nextInt();
	
   
	
		Utente prova = new Utente(regnome, regcognome, regmail, regpass, regeta);
		
		System.out.println("Il seguente utente e' stato creato: ");
		System.out.println(prova.getNome() + "\n" +prova.getCognome()+ "\n" + prova.getEmail() + "\n" +prova.getEta() +" anni");
	}   
    catch (NumberFormatException nfe) {
	      System.out.println("L'input non è un numero valido");
	      System.out.println(nfe.getMessage());
    } catch (Exception e) {
	      System.out.println("Impossibile completare la registrazione");
	      System.out.println(e.getMessage()); 
	}
    
    System.out.println("Grazie ed arrivederci.");
    scan.close();
	}
}
