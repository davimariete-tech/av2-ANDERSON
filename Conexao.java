package br.com.example.conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL="jdbc: mysql://localhost:3306/empresa_db";
    private static final String USER="root";
private static final String PASSWORD="1234";

    
}
public static Connection getConection() {

    try{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (SQLException e) {
        System.out.println("erro ao conectar no banco de dados: " + e.getMessage());
        return null;

    }
}



