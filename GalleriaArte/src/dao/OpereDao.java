package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.Autore;
import bean.Quadro;
import utility.ConnectionUtility;

public class OpereDao 
{
	public List<Quadro> getElencoQuadri() throws Exception
	{
		List<Quadro> listaQuadri = new ArrayList<Quadro>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT O.ID, O.TITOLO, O.DESCRIZIONE, A.ID, A.COGNOME, O.PATH, O.TECNICA, O.DIMENSIONI, O.ANNO_REALIZZAZIONE FROM QUADRO O, AUTORE A WHERE O.AUTORE = A.ID ORDER BY O.ID";
			statement  = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Quadro quadro = new Quadro();
				Autore autore = new Autore();
				quadro.setId(result.getInt(1));
				quadro.setTitolo(result.getString("TITOLO"));
				quadro.setDescrizione(result.getString("DESCRIZIONE").replaceAll("\"", "'"));
				autore.setId(result.getInt(4));
				autore.setCognome(result.getString("COGNOME"));
				quadro.setAutore(autore);
				quadro.setPath(result.getString("PATH"));
				quadro.setTecnica(result.getString("TECNICA"));
				quadro.setDimensioni(result.getString("DIMENSIONI"));
				quadro.setAnnoRealizzazione(result.getString("ANNO_REALIZZAZIONE"));
				listaQuadri.add(quadro);
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
		return listaQuadri;
	}
	
	public List<Quadro> getElencoQuadriOrdineAlfabetico() throws Exception
	{
		List<Quadro> listaQuadri = new ArrayList<Quadro>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT O.ID, O.TITOLO, O.DESCRIZIONE, A.ID, A.COGNOME, O.PATH, O.TECNICA, O.DIMENSIONI, O.ANNO_REALIZZAZIONE FROM QUADRO O, AUTORE A WHERE O.AUTORE = A.ID ORDER BY O.TITOLO";
			statement  = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Quadro quadro = new Quadro();
				Autore autore = new Autore();
				quadro.setId(result.getInt(1));
				quadro.setTitolo(result.getString("TITOLO"));
				quadro.setDescrizione(result.getString("DESCRIZIONE").replaceAll("\"", "'"));
				autore.setId(result.getInt(4));
				autore.setCognome(result.getString("COGNOME"));
				quadro.setAutore(autore);
				quadro.setPath(result.getString("PATH"));
				quadro.setTecnica(result.getString("TECNICA"));
				quadro.setDimensioni(result.getString("DIMENSIONI"));
				quadro.setAnnoRealizzazione(result.getString("ANNO_REALIZZAZIONE"));
				listaQuadri.add(quadro);
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
		return listaQuadri;
	}
	
	public List<Quadro> getElencoQuadriOrdineAnnoRealizzazione() throws Exception
	{
		List<Quadro> listaQuadri = new ArrayList<Quadro>();
		Connection conn = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "SELECT O.ID, O.TITOLO, O.DESCRIZIONE, A.ID, A.COGNOME, O.PATH, O.TECNICA, O.DIMENSIONI, O.ANNO_REALIZZAZIONE FROM QUADRO O, AUTORE A WHERE O.AUTORE = A.ID ORDER BY O.ANNO_REALIZZAZIONE";
			statement  = conn.createStatement();
			result = statement.executeQuery(sql);
			
			while(result.next())
			{
				Quadro quadro = new Quadro();
				Autore autore = new Autore();
				quadro.setId(result.getInt(1));
				quadro.setTitolo(result.getString("TITOLO"));
				quadro.setDescrizione(result.getString("DESCRIZIONE").replaceAll("\"", "'"));
				autore.setId(result.getInt(4));
				autore.setCognome(result.getString("COGNOME"));
				quadro.setAutore(autore);
				quadro.setPath(result.getString("PATH"));
				quadro.setTecnica(result.getString("TECNICA"));
				quadro.setDimensioni(result.getString("DIMENSIONI"));
				quadro.setAnnoRealizzazione(result.getString("ANNO_REALIZZAZIONE"));
				listaQuadri.add(quadro);
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
		return listaQuadri;
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
			String sql = "SELECT MAX(ID) FROM QUADRO";
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
	
	public void insertQuadro(Quadro quadro) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "INSERT INTO QUADRO VALUES(?,?,?,?,?,?,?,?)";
			statement = conn.prepareStatement(sql);
			statement.setString(1, quadro.getTitolo());
			statement.setString(2, quadro.getDescrizione());
			statement.setString(3, quadro.getPath());
			statement.setString(4, quadro.getTecnica());
			statement.setString(5, quadro.getDimensioni());
			statement.setString(6, quadro.getAnnoRealizzazione());
			statement.setInt(7, quadro.getId());
			statement.setInt(8, quadro.getAutore().getId());
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
	
	public void updateQuadro(Quadro quadro) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "UPDATE QUADRO SET TITOLO = ?, DESCRIZIONE = ?, TECNICA = ?, DIMENSIONI = ?, ANNO_REALIZZAZIONE = ?,  AUTORE = ? WHERE ID = ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, quadro.getTitolo());
			statement.setString(2, quadro.getDescrizione());
			statement.setString(3, quadro.getTecnica());
			statement.setString(4, quadro.getDimensioni());
			statement.setString(5, quadro.getAnnoRealizzazione());
			statement.setInt(6, quadro.getAutore().getId());
			statement.setInt(7, quadro.getId());
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
	
	public void deleteQuadro(Quadro quadro) throws Exception
	{
		Connection conn = null;
		PreparedStatement statement = null;
		try
		{
			conn = new ConnectionUtility().getConnection();
			String sql = "DELETE FROM QUADRO WHERE ID = ?";
			statement = conn.prepareStatement(sql);
			statement.setInt(1, quadro.getId());
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
