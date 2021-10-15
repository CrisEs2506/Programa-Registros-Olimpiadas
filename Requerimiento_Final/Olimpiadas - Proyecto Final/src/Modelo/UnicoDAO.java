package Modelo;

import static Vista.UnicoGUI.idComplejoUnico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UnicoDAO 
{
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List mostrarSedeUnico()
    {
        List<Unico>datosSedeUnico = new ArrayList<>();
        String sql= "SELECT S.idcomplejo, S.nomcomplejo, S.presupuesto, S.direccion FROM sede S, unico U WHERE ((S.idcomplejo = U.idcomplejo))";
        try
        {
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs =  ps.executeQuery();
            
            while(rs.next())
            {
                Unico unico = new Unico();
                unico.setIdcomplejounico(rs.getString(1));
                unico.setNomcomplejounico(rs.getString(2));
                unico.setPresupuestounico(rs.getInt(3));
                unico.setDireccionunico(rs.getString(4));
                datosSedeUnico.add(unico);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return datosSedeUnico;
    }
    
    public int registrarUnico(Unico unico)
    {
        int registrar = 0;
        
        //Registro Tabla Deporte
        try
        {
            String sql = "INSERT INTO deporte(iddeporte, nomdeporte, nmaxintegrantes) VALUES (?,?,?)";
            
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, unico.getIddeporte());
            ps.setString(2, unico.getNomdeporteunico());
            ps.setInt(3, unico.getNmaxintegrantesunico());
            
            registrar = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        //Registro Tabla Unico
        try
        {
            String sql = "INSERT INTO unico(idunico, iddeporte, idcomplejo, areaunico) VALUES (?,?,?,?)";
            
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, unico.getIdunico());
            ps.setString(2, unico.getIddeporte());
            ps.setString(3, idComplejoUnico);
            ps.setDouble(4, unico.getAreaunico());
            
            registrar = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return registrar;
    }
}
