package action;

import java.util.List;

import com.opensymphony.xwork2.*;

import bean.Autore;
import bean.Navigazione;
import dao.AutoriDao;

public class AutoriAction extends ActionSupport
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Navigazione navigazione;
	private Autore autore;
	
	
	public String getElencoAutori() throws Exception
	{
		try
		{
			
			navigazione = new Navigazione();
			AutoriDao autoriDao = new AutoriDao();
			List<Autore> listaAutori = autoriDao.getElencoAutori();
			navigazione.setListaAutori(listaAutori);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String getElencoAutoriOrdineAlfabetico() throws Exception
	{
		try
		{
			navigazione = new Navigazione();
			AutoriDao autoriDao = new AutoriDao();
			List<Autore> listaAutori = autoriDao.getElencoAutoriOrdineAlfabetico();
			navigazione.setListaAutori(listaAutori); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String getElencoAutoriOrdineDataNascita() throws Exception
	{
		try
		{
			navigazione = new Navigazione();
			AutoriDao autoriDao = new AutoriDao();
			List<Autore> listaAutori = autoriDao.getElencoAutoriOrdineDataNascita();
			navigazione.setListaAutori(listaAutori); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String caricaCombo()
	{
		try
		{
			navigazione = new Navigazione();
			AutoriDao autoriDao = new AutoriDao();
			navigazione.setListaAutori(autoriDao.getElencoAutori());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
		
	}
	
	public String insertAutore()
	{
		try
		{
			autore = getAutore();
			AutoriDao autoriDao = new AutoriDao();
			autore.setId(autoriDao.maxId());
			autoriDao.insertAutore(autore);
			getElencoAutori();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String modificaAutore()
	{
		autore = getAutore();
		return SUCCESS;
	}
	
	public String updateAutore()
	{
		try
		{
			autore = getAutore();
			AutoriDao autoriDao = new AutoriDao();
			autoriDao.updateAutore(autore);
			getElencoAutori();
		}
		catch(Exception e)
		{
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String cancellaAutore()
	{
		try
		{
			autore = getAutore();
			AutoriDao autoriDao = new AutoriDao();
			autoriDao.deleteAutore(autore);
			getElencoAutori();
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
	
	public Autore getAutore()
	{
		return this.autore;
	}
	
	public void setAutore(Autore autore)
	{
		this.autore = autore;
	}




}
