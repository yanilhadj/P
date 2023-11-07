package classesDAO;
import java.sql.*;

import classes.Etudiant;

public class EtudiantDAO {
    // JDBC URL, username, and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/Projet";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "Ff1932512210*";
    Etudiant etudiant;
    
    
    public static void rechercheEtudiantId(int id) {
    	try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Retrieving data from Etudiant table
            try (Statement statement = connection.createStatement()) {
            	
                ResultSet etudiantResultSet = statement.executeQuery("SELECT * FROM Etudiant");    
                int idEtudiant=0;
                String nom="";
                String prenom="";
                
                while(etudiantResultSet.next() ){
                    idEtudiant = etudiantResultSet.getInt("idEtudiant");
                    nom = etudiantResultSet.getString("nom");
                    prenom = etudiantResultSet.getString("prenom");
                    if(idEtudiant == id) {
                    	break; 
                    }
                }
                if(idEtudiant ==0) {
                	System.out.println("Pas d'étudiant avec le numéro étudiant : "+id);
                }else {
                	System.out.println(nom+" "+prenom+" "+idEtudiant);
                }
            }
                
            
    	} catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
    	}
    }
    
    public static void main(String[] args) {
    	EtudiantDAO.rechercheEtudiantId(1);
    }
}