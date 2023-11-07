package classesDAO;


import java.sql.*;

public class EtudiantDAO {
    // JDBC URL, username, and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/Projet";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "Ff1932512210*";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Connected to the database.");

            // Retrieving data from Etudiant table
            System.out.println("Etudiant Table:");
            try (Statement statement = connection.createStatement()) {
                ResultSet etudiantResultSet = statement.executeQuery("SELECT * FROM Etudiant");

                while (etudiantResultSet.next()) {
                    int idEtudiant = etudiantResultSet.getInt("idEtudiant");
                    String nom = etudiantResultSet.getString("nom");
                    String prenom = etudiantResultSet.getString("prenom");
                    int idFormation = etudiantResultSet.getInt("idFormation");

                    System.out.println(
                            "ID: " + idEtudiant + ", Nom: " + nom + ", Prenom: " + prenom + ", ID Formation: " + idFormation);
                }
            }

            // Retrieving data from Formation table
            System.out.println("\nFormation Table:");
            try (Statement statement = connection.createStatement()) {
                ResultSet formationResultSet = statement.executeQuery("SELECT * FROM Formation");

                while (formationResultSet.next()) {
                    int id = formationResultSet.getInt("idFormation");
                    String nom = formationResultSet.getString("nomFormation");
                    String promotion = formationResultSet.getString("promotion");

                    System.out.println("ID: " + id + ", Nom: " + nom + ", Promotion: " + promotion);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}