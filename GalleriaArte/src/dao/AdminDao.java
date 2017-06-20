package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Amministratore;
import utility.ConnectionUtility;

public class AdminDao 
{
	public boolean validateLogin(Amministratore admin) throws Exception
	{
		boolean loginValidator = false;
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT USERNAME, PASSWORD FROM AMMINISTRATORE WHERE USERNAME = ? AND PASSWORD = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, admin.getUsername());
			statement.setString(2, admin.getPassword());
			result = statement.executeQuery();
			
			while(result.next())
			{
				loginValidator = true;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				result.close();
				statement.close();
				conn.close();
			}
			catch(Exception e)
			{
				
			}
		}
		return loginValidator;
	}
	
	public List<Amministratore> getElencoAmministratori() throws Exception
	{
		List<Amministratore>listaAmministratori = new ArrayList<Amministratore>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT NOME, COGNOME, MATRICOLA, USERNAME FROM AMMINISTRATORE";
			statement = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Amministratore admin = new Amministratore();
				admin.setNome(result.getString("NOME"));
				admin.setCognome(result.getString("COGNOME"));
				admin.setMatricola(result.getString("MATRICOLA"));
				admin.setUsername(result.getString("USERNAME"));
				listaAmministratori.add(admin);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				result.close();
				statement.close();
				conn.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		return listaAmministratori;
	}
	
	public void insertAmministratore(Amministratore amministratore) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "INSERT INTO AMMINISTRATORE VALUES(?,?,?,?,?)";
			statement = conn.prepareStatement(sql);
			statement.setString(1, amministratore.getNome());
			statement.setString(2, amministratore.getCognome());
			statement.setString(3, amministratore.getMatricola());
			statement.setString(4, amministratore.getUsername());
			statement.setString(5, amministratore.getPassword());
			statement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				statement.close();
				conn.close();
			}
			catch(Exception e)
			{}
		}
	}
	
	public void updateAmministratore(Amministratore amministratore) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "UPDATE AMMINISTRATORE SET NOME = ?, COGNOME = ?, MATRICOLA = ?, USERNAME = ? WHERE USERNAME = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, amministratore.getNome());
			statement.setString(2, amministratore.getCognome());
			statement.setString(3, amministratore.getMatricola());
			statement.setString(4, amministratore.getUsername());
			statement.setString(5, amministratore.getUsernameRiferimento());
			statement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				statement.close();
				conn.close();
			}
			catch(Exception e)
			{}
		}
	}
	
	public void deleteAmministratore(Amministratore amministratore) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "DELETE FROM AMMINISTRATORE WHERE USERNAME = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, amministratore.getUsername());
			statement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				statement.close();
				conn.close();
			}
			catch(Exception e)
			{}
		}
	}
}
