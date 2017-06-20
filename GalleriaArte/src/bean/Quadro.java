package bean;

public class Quadro 
{
	private Integer id;
	private String titolo;
	private String descrizione;
	private Autore autore;
	private String tecnica;
	private String dimensioni;
	private String annoRealizzazione;
	private String path;
	private String titoloRiferimento;
	
	public Quadro() 
	{
	
	}
	
	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Autore getAutore() {
		return autore;
	}

	public void setAutore(Autore autore) {
		this.autore = autore;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}

	public String getAnnoRealizzazione() {
		return annoRealizzazione;
	}

	public void setAnnoRealizzazione(String annoRealizzazione) {
		this.annoRealizzazione = annoRealizzazione;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitoloRiferimento() {
		return titoloRiferimento;
	}

	public void setTitoloRiferimento(String titoloRiferimento) {
		this.titoloRiferimento = titoloRiferimento;
	}
	
	
	
	
	
	
}
