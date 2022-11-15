import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class  Requete{
public static Connection getCon() throws SQLException{
	final Connection con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/fouche","fouche", "fouche");
	return con;
}
    
    public static void insertEtudiant(){
		try{
	    	Class.forName("org.mariadb.jdbc.Driver");		
	    	try{
				Connection con = Requete.getCon();
				try{
		    		PreparedStatement req = con.prepareStatement("INSERT INTO Etudiant (id,nom,prenom) VALUES(?,?,?);");
					req.setInt(1,2);
					req.setNString(2,"nom2");
					req.setNString(3,"prenom2");
					System.out.println(req);
		    		req.executeUpdate();
		    		
		    		con.close();
				}catch(SQLException e1){
				    System.out.println("Erreur dans la requete INSERT");
				    con.close();
				}
			}catch(SQLException e2){
				System.out.println("Erreur de connexion le serveur refuse");
	    	}
		}catch(ClassNotFoundException e3){
	    	System.out.println("Erreur de connexion le pilote n'est pas disponible");
		}
    }

	public static void selectEtudiant(){
		try{
	    	Class.forName("org.mariadb.jdbc.Driver");		
	    	try{
				Connection con = Requete.getCon();
				try{
		    		PreparedStatement req = con.prepareStatement("SELECT * FROM Etudiant WHERE id=?;");
					req.setNString(1,"1");
		    		ResultSet res = req.executeQuery();
		    		while(res.next()) {
						System.out.println(res.getInt(1));
						System.out.println(res.getNString(2));
						System.out.println(res.getNString(3));
					     //res.getInt(2);
					     //res.getNString(1);
					}
		    		con.close();
				}catch(SQLException e1){
				    System.out.println("Erreur dans la requete SELECT");
				    con.close();
				}
			}catch(SQLException e2){
				System.out.println("Erreur de connexion le serveur refuse");
	    	}
		}catch(ClassNotFoundException e3){
	    	System.out.println("Erreur de connexion le pilote n'est pas disponible");
		}
    }
}
