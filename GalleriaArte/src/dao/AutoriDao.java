package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Autore;
import utility.ConnectionUtility;

public class AutoriDao
{
	public List<Autore> getElencoAutori() throws Exception
	{
		List<Autore> listaAutori = new ArrayList<Autore>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT ID, NOME, COGNOME, DATA_DI_NASCITA, DATA_DI_MORTE, NAZIONALITA FROM AUTORE";
			statement  = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Autore autore = new Autore();
				autore.setId(result.getInt("ID"));
				autore.setNome(result.getString("NOME"));
				autore.setCognome(result.getString("COGNOME"));
				autore.setDataNascita(result.getDate("DATA_DI_NASCITA"));
				autore.setDataMorte(result.getDate("DATA_DI_MORTE"));
				autore.setNazionalita(result.getString("NAZIONALITA"));
				listaAutori.add(autore);
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
		return listaAutori;
	}
	
	public List<Autore> getElencoAutoriOrdineAlfabetico() throws Exception
	{
		List<Autore> listaAutori = new ArrayList<Autore>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT ID, NOME, COGNOME, DATA_DI_NASCITA, DATA_DI_MORTE, NAZIONALITA FROM AUTORE ORDER BY COGNOME";
			statement  = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Autore autore = new Autore();
				autore.setId(result.getInt("ID"));
				autore.setNome(result.getString("NOME"));
				autore.setCognome(result.getString("COGNOME"));
				autore.setDataNascita(result.getDate("DATA_DI_NASCITA"));
				autore.setDataMorte(result.getDate("DATA_DI_MORTE"));
				autore.setNazionalita(result.getString("NAZIONALITA"));
				listaAutori.add(autore);
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
		return listaAutori;
	}
	
	public List<Autore> getElencoAutoriOrdineDataNascita() throws Exception
	{
		List<Autore> listaAutori = new ArrayList<Autore>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT ID, NOME, COGNOME, DATA_DI_NASCITA, DATA_DI_MORTE, NAZIONALITA FROM AUTORE ORDER BY DATA_DI_NASCITA";
			statement  = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Autore autore = new Autore();
				autore.setId(result.getInt("ID"));
				autore.setNome(result.getString("NOME"));
				autore.setCognome(result.getString("COGNOME"));
				autore.setDataNascita(result.getDate("DATA_DI_NASCITA"));
				autore.setDataMorte(result.getDate("DATA_DI_MORTE"));
				autore.setNazionalita(result.getString("NAZIONALITA"));
				listaAutori.add(autore);
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
		return listaAutori;
	}
	
	public int maxId() throws Exception
	{
		int max = 0;
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT MAX(ID) FROM AUTORE";
			statement = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				max = result.getInt(1);
				max++;
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
			{}
		}
		return max;
	}
	
	public void insertAutore(Autore autore) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "INSERT INTO AUTORE VALUES (?,?,?,?,?,?)";
			statement = conn.prepareStatement(sql);
			statement.setString(1, autore.getNome());
			statement.setString(2, autore.getCognome());
			statement.setDate(3, autore.getDataNascita());
			statement.setDate(4, autore.getDataMorte());
			statement.setString(5,  autore.getNazionalita());
			statement.setInt(6, autore.getId());
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
	
	public void updateAutore(Autore autore) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "UPDATE AUTORE SET NOME = ?, COGNOME = ?, DATA_DI_NASCITA = ?, DATA_DI_MORTE = ?, NAZIONALITA = ? WHERE ID = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, autore.getNome());
			statement.setString(2, autore.getCognome());
			statement.setDate(3, autore.getDataNascita());
			statement.setDate(4, autore.getDataMorte());
			statement.setString(5, autore.getNazionalita());
			statement.setInt(6, autore.getId());
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
	
	public void deleteAutore(Autore autore) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "DELETE FROM AUTORE WHERE ID = ?";
			statement = conn.prepareStatement(sql);
			statement.setInt(1, autore.getId());
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
