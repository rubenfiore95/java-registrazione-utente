package registrazione.utente;

public class Utente {
	
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;
	
	public Utente(String nome,String cognome, String email, String password, int eta) throws Exception {
		
		
		if (nome.isBlank()){
			
			throw new Exception ("Il campo nome deve contenere almeno un carattere.");
		
		}
		
		if (cognome.isBlank()){
			
			throw new Exception ("Il campo cognome deve contenere almeno un carattere");
		}
		
		if (!(email.contains("@") && email.contains("."))) {
			
			throw new Exception ("Una mail valida deve contenere la @ ed il punto.");
			
		}
		
		if (password.length() < 8 || password.length() > 12){
			
			throw new Exception ("La password deve essere compresa tra gli 8 ed i 12 caratteri.");
		}
		
        if (eta < 18){
			
			throw new Exception ("Registrazione abilitata solo ai maggiorenni.");
		}
		
		
		this.nome=nome;
		this.cognome=cognome;
		this.email=email;
		this.password=password;
		this.eta=eta;
		
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public int getEta() {
		return eta;
	}
	
}
