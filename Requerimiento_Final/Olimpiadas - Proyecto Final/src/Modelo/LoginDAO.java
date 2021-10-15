package Modelo;

import java.sql.*;

public class LoginDAO 
{
    Conexion conexion = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean comparar(Login login)
    {
        boolean bool = false;
        
        String sql = "SELECT userper, pasword FROM persona WHERE userper = '"+login.getUsuario()+"'";
        
        try
        {
            con = conexion.obtenerConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            //Si obtenemos una fila en la consulta, quiere decir que encontró un usuario con los datos que se suministrarion en la interfaz
            if(rs.next())
            {
                //Si Existe el Usuario
                String userper = rs.getString("userper");
                String pasword = rs.getString("pasword");
                
                if(login.getPassword().equals(pasword))
                {
                    //Contraseña Correcta
                    bool = true;
                }
                else
                {
                    //Contraseña Incorrecta
                    bool = false;
                }
            }
            else
            {
                //No Existe el Usuario
                bool = false;
            }
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
        return bool;
    }
}
