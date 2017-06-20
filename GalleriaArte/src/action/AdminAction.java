package action;

import com.opensymphony.xwork2.ActionSupport;

import bean.Amministratore;
import bean.Navigazione;
import dao.AdminDao;

public class AdminAction extends ActionSupport 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Amministratore amministratore;
	private Navigazione navigazione;
	
	public String login()
	{
		try
		{
			amministratore = getAmministratore();
			AdminDao adminDao = new AdminDao();
			if(adminDao.validateLogin(amministratore) == false)
			{
				amministratore.setErroreLogin("Hai inserito dati errati. Riprova.");
				return "erroreLogin";
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
		
	}
	
	public String getElencoAmministratori()
	{
		try
		{
			navigazione = new Navigazione();
			navigazione.setListaAmministratori(new AdminDao().getElencoAmministratori());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String insertAmministratore()
	{
		try
		{
			amministratore = getAmministratore();
			AdminDao adminDao = new AdminDao();
			adminDao.insertAmministratore(amministratore);
			getElencoAmministratori();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String modificaAmministratore()
	{
		amministratore = getAmministratore();
		return SUCCESS;
	}
	
	public String updateAmministratore()
	{
		try
		{
			amministratore = getAmministratore();
			AdminDao adminDao = new AdminDao();
			adminDao.updateAmministratore(amministratore);
			getElencoAmministratori();
		}
		catch(Exception e)
		{
			return ERROR;
		}
		return SUCCESS;
	}
	
	public String cancellaAmministratore()
	{
		try
		{
			amministratore = getAmministratore();
			AdminDao adminDao = new AdminDao();
			adminDao.deleteAmministratore(amministratore);
			getElencoAmministratori();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	
	
	public Amministratore getAmministratore()
	{
		return this.amministratore;
	}
	
	public void setAmministratore(Amministratore amministratore)
	{
		this.amministratore = amministratore;
	}
	
	public Navigazione getNavigazione()
	{
		return this.navigazione;
	}
	
	public void setNavigazione(Navigazione navigazione)
	{
		this.navigazione = navigazione;
	}
}
