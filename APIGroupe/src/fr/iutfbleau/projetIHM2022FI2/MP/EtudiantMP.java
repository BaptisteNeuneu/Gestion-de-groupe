package fr.iutfbleau.projetIHM2022FI2.MP;
import fr.iutfbleau.projetIHM2022FI2.API.*;

import java.util.*;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EtudiantMP implements Etudiant{


    private String nom, prenom;
    public int id;
    Connection con;
    /**
     * Constructeur.
     */
    public EtudiantMP(String nom, String prenom){
        Objects.requireNonNull(nom,"On ne peut pas créer un étudiant avec un nom null");
        Objects.requireNonNull(prenom,"On ne peut pas créer un étudiant avec un nom null");
        // auto incrément de l'id
        this.nom=nom;
        this.prenom=prenom;

        try{
	    	Class.forName("org.mariadb.jdbc.Driver");		
	    	try{
                Connection con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/fouche","fouche", "fouche");
				try{
                    PreparedStatement reqid = con.prepareStatement("select MAX(id) from IHM_Etudiant");
                    ResultSet rs = reqid.executeQuery();
                    rs.next();
                    this.id=rs.getInt(1);
                    System.err.println(id);

		    		PreparedStatement req = con.prepareStatement("INSERT INTO IHM_Etudiant (id,nom,prenom) VALUES(?,?,?);");
					req.setInt(1,this.id+1);
					req.setNString(2,this.nom);
					req.setNString(3,this.prenom);
					//System.err.println(req);
		    		req.executeUpdate();
		    		
		    		con.close();
				}catch(SQLException e1){
				    System.out.println("Erreur dans la requete INSERT");
				    con.close();
				}
			}catch(SQLException e2){
				System.out.println("Erreur de connexion le serveur refuse + "+e2);
	    	}
		}catch(ClassNotFoundException e3){
	    	System.out.println("Erreur de connexion le pilote n'est pas disponible +"+e3);
		}
    }
    
    public int getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }


}
