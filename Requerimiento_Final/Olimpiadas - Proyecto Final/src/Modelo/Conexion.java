package Modelo;

import java.sql.*;

public class Conexion 
{
    String url = "jdbc:postgresql://localhost:5432/Olimpiadas_ProyectoFinal";
    String usuario = "postgres";
    String password = "cris10013321462506";
    Connection con;
    
    public Connection obtenerConexion()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, usuario, password);
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return con;
    }
}
