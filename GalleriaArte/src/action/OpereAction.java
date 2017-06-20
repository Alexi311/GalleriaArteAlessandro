package action;

import java.util.List;

import com.opensymphony.xwork2.*;

import bean.Navigazione;
import bean.Quadro;
import dao.AutoriDao;
import dao.OpereDao;

public class OpereAction extends ActionSupport 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Navigazione navigazione;
	private Quadro quadro;
	
	public String getElencoOpere() throws Exception
	{
		try
		{
			navigazione = new Navigazione();
			OpereDao opereDao = new OpereDao();
			List<Quadro> listaQuadri = opereDao.getElencoQuadri();
			navigazione.setListaQuadri(listaQuadri); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String getElencoOpereOrdineAlfabetico() throws Exception
	{
		try
		{
			navigazione = new Navigazione();
			OpereDao opereDao = new OpereDao();
			List<Quadro> listaQuadri = opereDao.getElencoQuadriOrdineAlfabetico();
			navigazione.setListaQuadri(listaQuadri); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String getElencoOpereOrdineAnnoRealizzazione() throws Exception
	{
		try
		{
			navigazione = new Navigazione();
			OpereDao opereDao = new OpereDao();
			List<Quadro> listaQuadri = opereDao.getElencoQuadriOrdineAnnoRealizzazione();
			navigazione.setListaQuadri(listaQuadri); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	
	public String insertQuadro()
	{
		try
		{
			quadro = getQuadro();
			OpereDao opereDao = new OpereDao();
			quadro.setId(opereDao.maxId());
			opereDao.insertQuadro(quadro);
			getElencoOpere();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String modificaQuadro()
	{
		try
		{
			quadro = getQuadro();
			navigazione = new Navigazione();
			navigazione.setListaAutori(new AutoriDao().getElencoAutori());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String updateQuadro()
	{
		try
		{
			quadro = getQuadro();
			OpereDao opereDao = new OpereDao();
			opereDao.updateQuadro(quadro);
			getElencoOpere();
		}
		catch(Exception e)
		{
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String cancellaQuadro()
	{
		try
		{
			quadro = getQuadro();
			OpereDao opereDao = new OpereDao();
			opereDao.deleteQuadro(quadro);
			getElencoOpere();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public Navigazione getNavigazione()
	{
		return this.navigazione;
	}
	
	public void setNavigazione(Navigazione navigazione)
	{
		this.navigazione = navigazione;
	}
	
	public Quadro getQuadro()
	{
		return this.quadro;
	}
	
	public void setQuadro(Quadro quadro)
	{
		this.quadro = quadro;
	}

}
