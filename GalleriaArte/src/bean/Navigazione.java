package bean;

import java.util.List;

public class Navigazione 
{
	private List<Autore>listaAutori;
	private List<Quadro>listaQuadri;
	private List<Amministratore>listaAmministratori;
	
	public Navigazione()
	{
		super();
	}

	public List<Autore> getListaAutori() {
		return listaAutori;
	}

	public void setListaAutori(List<Autore> listaAutori) {
		this.listaAutori = listaAutori;
	}

	public List<Quadro> getListaQuadri() {
		return listaQuadri;
	}

	public void setListaQuadri(List<Quadro> listaQuadri) {
		this.listaQuadri = listaQuadri;
	}

	public List<Amministratore> getListaAmministratori() {
		return listaAmministratori;
	}

	public void setListaAmministratori(List<Amministratore> listaAmministratori) {
		this.listaAmministratori = listaAmministratori;
	}
	
	
	
	
	
}
