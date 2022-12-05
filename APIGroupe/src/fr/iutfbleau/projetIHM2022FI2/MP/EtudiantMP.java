package fr.iutfbleau.projetIHM2022FI2.MP;
import fr.iutfbleau.projetIHM2022FI2.API.*;
import java.util.*;
import java.sql.*;
/**
 * Un étudiant
 */

public class EtudiantMP implements Etudiant{

    private int id;
    private String nom, prenom;

    /**
     * Constructeur + insert dans la base de donnée.
     */
    public EtudiantMP(String nom, String prenom){
        Objects.requireNonNull(nom,"On ne peut pas créer un étudiant avec un nom null");
        Objects.requireNonNull(prenom,"On ne peut pas créer un étudiant avec un prenom null");
        this.nom=nom;
        this.prenom=prenom;
        //increment de l'id
        try{
	    	Class.forName("org.mariadb.jdbc.Driver");		
	    	try{
                Connection con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/fouche","fouche", "fouche");
				try{
                    PreparedStatement reqid = con.prepareStatement("select MAX(id) from IHM_Etudiant");
                    ResultSet rs = reqid.executeQuery();
                    rs.next();
                    this.id=rs.getInt(1)+1;
                    System.err.println("crea etu id:"+id);

                    PreparedStatement req = con.prepareStatement("INSERT INTO IHM_Etudiant (id,nom,prenom) VALUES(?,?,?);");
					req.setInt(1,this.id);
					req.setNString(2,this.nom);
					req.setNString(3,this.prenom);
					//System.err.println(req);
		    		req.executeUpdate();

		    		con.close();
				}catch(SQLException e1){
				    System.out.println("Erreur dans la requete");
				    con.close();
				}
			}catch(SQLException e2){
				System.out.println("Erreur de connexion le serveur refuse + "+e2);
	    	}
		}catch(ClassNotFoundException e3){
	    	System.out.println("Erreur de connexion le pilote n'est pas disponible +"+e3);
		}
    }

    /**
     * Constructeur via base de données.
     */
    public EtudiantMP(int id){
        Objects.requireNonNull(id,"On ne peut pas créer un étudiant avec un id null");
        Objects.requireNonNull(nom,"On ne peut pas créer un étudiant avec un nom null");
        Objects.requireNonNull(prenom,"On ne peut pas créer un étudiant avec un prenom null");
        // auto incrément de l'id
        try{
	    	Class.forName("org.mariadb.jdbc.Driver");		
	    	try{
                Connection con = DriverManager.getConnection("jdbc:mariadb://dwarves.iut-fbleau.fr/fouche","fouche", "fouche");
				try{
                    PreparedStatement req = con.prepareStatement("SELECT * FROM IHM_Etudiant where id=? ;");
					req.setInt(1,this.id);
					//System.err.println(req);
                    ResultSet rs = req.executeQuery();
                    this.id = rs.getInt("id");
                    this.nom = rs.getString("nom");
                    this.prenom = rs.getString("prenom");

		    		con.close();
				}catch(SQLException e1){
				    System.out.println("Erreur dans la requete");
				    con.close();
				}
			}catch(SQLException e2){
				System.out.println("Erreur de connexion le serveur refuse + "+e2);
	    	}
		}catch(ClassNotFoundException e3){
	    	System.out.println("Erreur de connexion le pilote n'est pas disponible +"+e3);
		}
    }
    
    /**
     * permet de récupérer l'identifiant de l'étudiant.
     * @return l'identifiant.
     */
    public int getId(){
        return this.id;
    }

    /**
     * permet de récupérer 
     * @return le nom de l'étudiant.
     */
    public String getNom(){
        return this.nom;
    }

    /**
     * permet de récupérer
     * @return le prénom de l'étudiant
     */
    public String getPrenom(){
        return this.prenom;
    }


}
