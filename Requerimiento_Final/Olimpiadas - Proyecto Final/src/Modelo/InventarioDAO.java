package Modelo;

import static Vista.InventarioGUI.idComplejo;
import static Vista.InventarioGUI.idEquipo;
import static Vista.InventarioGUI.idEstado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InventarioDAO 
{
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public List mostrarSede()
    {
        List<Inventario>datosSede = new ArrayList<>();
        String sql= "SELECT * FROM sede";
        try
        {
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs =  ps.executeQuery();
            
            while(rs.next())
            {
                Inventario inventario = new Inventario();
                inventario.setIdcomplejo(rs.getString(1));
                inventario.setNomcomplejo(rs.getString(2));
                inventario.setPresupuest(rs.getInt(3));
                inventario.setDireccion(rs.getString(4));
                datosSede.add(inventario);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return datosSede;
    }
    
    public List mostrarDeporte()
    {
        List<Inventario>datosDeporte = new ArrayList<>();
        
        try
        {
            String sql;
        
            Inventario inven = new Inventario();

            if((inven.getIdcomplejo().equals("10001")) || (inven.getIdcomplejo().equals("10002")) || (inven.getIdcomplejo().equals("10003")) || (inven.getIdcomplejo().equals("10004")) || (inven.getIdcomplejo().equals("10005")))  
            {
                sql = "SELECT D.iddeporte, D.nomdeporte, D.nmaxintegrantes FROM deporte D, unico U, sede S WHERE ((D.iddeporte = U.iddeporte) AND (S.idcomplejo = U.idcomplejo) AND (S.idcomplejo = '" + inven.getIdcomplejo() + "'))";
            }
            else
            {
                sql = "SELECT D.iddeporte, D.nomdeporte, D.nmaxintegrantes FROM deporte D, polideportivo P, area A, sede S WHERE ((D.iddeporte = P.iddeporte) AND (P.idarea = A.idarea) AND (A.idcomplejo = S.idcomplejo) AND (S.idcomplejo = '" + inven.getIdcomplejo() + "'))"; 
            }
            
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs =  ps.executeQuery();
            
            while(rs.next())
            {
                Inventario inventario = new Inventario();
                inventario.setIddeporte(rs.getString(1));
                inventario.setNomdeporte(rs.getString(2));
                inventario.setNmaxintegrantes(rs.getInt(3));
                datosDeporte.add(inventario);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return datosDeporte;
    }
    
    public List mostrarEquipo()
    {
        Inventario inven = new Inventario();
        List<Inventario>datosEquipo = new ArrayList<>();
        String sql= "SELECT E.idequipo, E.nomequipo, E.npares FROM equipo E, equipodeporte ED, deporte D WHERE ((ED.idequipo = E.idequipo) AND (ED.iddeporte = D.iddeporte) AND (ED.iddeporte = '" + inven.getIddeporte() + "'))";
        
        try
        {
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs =  ps.executeQuery();
            
            while(rs.next())
            {
                Inventario inventario = new Inventario();
                inventario.setIdequipo(rs.getString(1));
                inventario.setNomequipo(rs.getString(2));
                inventario.setNpares(rs.getInt(3));
                datosEquipo.add(inventario);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return datosEquipo;
    }
    
    public List mostrarEstado()
    {
        List<Inventario>datosEstado = new ArrayList<>();
        String sql= "SELECT * FROM estado";
        try
        {
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs =  ps.executeQuery();
            
            while(rs.next())
            {
                Inventario inventario = new Inventario();
                inventario.setIdestado(rs.getString(1));
                inventario.setDescestado(rs.getString(2));
                datosEstado.add(inventario);
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        
        return datosEstado;
    }
    
    public int registrarInventario(Inventario inventario)
    {
        int registrar = 0;
        
        String sql = "INSERT INTO inventario(idequipo, idcomplejo, consecinve, idestado, npiezas) VALUES (?,?,?,?,?)";
        
        try
        {
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            
            ps.setString(1, idEquipo);
            ps.setString(2, idComplejo);
            ps.setInt(3, inventario.getConsecinve());
            ps.setString(4, idEstado);
            ps.setInt(5, inventario.getNpiezas());
            
            registrar = ps.executeUpdate();
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        System.out.println("DAO: " + registrar);
        return registrar;
    }
}
