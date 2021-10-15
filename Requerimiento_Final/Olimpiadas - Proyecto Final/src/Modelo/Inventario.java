package Modelo;

import static Vista.InventarioGUI.idComplejo;
import static Vista.InventarioGUI.idDeporte;
import static Vista.InventarioGUI.idEquipo;
import static Vista.InventarioGUI.idEstado;

public class Inventario 
{
    //Atributos Tabla Sede
    private String idcomplejo = idComplejo;
    private String nomcomplejo;
    private int presupuest;
    private String direccion;
    
    //Atributos Tabla Deporte
    private String iddeporte = idDeporte;
    private String nomdeporte;
    private int nmaxintegrantes;
    
    //Atributos Tabla Equipo
    private String idequipo = idEquipo;
    private String nomequipo;
    private int npares;
    
    //Atributos Tabla Estado
    private String idestado = idEstado;
    private String descestado;
    
    //Atributos Tabla Inventario
    private int consecinve;
    private int npiezas;
    
    //Setters and Getters de Tabla Sede
    public String getIdcomplejo() 
    {
        return idcomplejo;
    }

    public void setIdcomplejo(String idcomplejo) 
    {
        this.idcomplejo = idcomplejo;
    }

    public String getNomcomplejo() 
    {
        return nomcomplejo;
    }

    public void setNomcomplejo(String nomcomplejo) 
    {
        this.nomcomplejo = nomcomplejo;
    }

    public int getPresupuest() 
    {
        return presupuest;
    }

    public void setPresupuest(int presupuest) 
    {
        this.presupuest = presupuest;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
    
    //Setters and Getters de Tabla Deporte
    public String getIddeporte() 
    {
        return iddeporte;
    }

    public void setIddeporte(String iddeporte) 
    {
        this.iddeporte = iddeporte;
    }

    public String getNomdeporte() 
    {
        return nomdeporte;
    }

    public void setNomdeporte(String nomdeporte) 
    {
        this.nomdeporte = nomdeporte;
    }

    public int getNmaxintegrantes() 
    {
        return nmaxintegrantes;
    }

    public void setNmaxintegrantes(int nmaxintegrantes) 
    {
        this.nmaxintegrantes = nmaxintegrantes;
    }
    
    //Setters and Getters de Tabla Equipo
    public String getIdequipo() 
    {
        return idequipo;
    }

    public void setIdequipo(String idequipo) 
    {
        this.idequipo = idequipo;
    }

    public String getNomequipo() 
    {
        return nomequipo;
    }

    public void setNomequipo(String nomequipo) 
    {
        this.nomequipo = nomequipo;
    }

    public int getNpares() 
    {
        return npares;
    }

    public void setNpares(int npares) 
    {
        this.npares = npares;
    }
    
    //Setters and Getters de Tabla Estado
    public String getIdestado() 
    {
        return idestado;
    }

    public void setIdestado(String idestado) 
    {
        this.idestado = idestado;
    }

    public String getDescestado() 
    {
        return descestado;
    }

    public void setDescestado(String descestado) 
    {
        this.descestado = descestado;
    }
    
    //Setters and Getters de Tabla Inventario
    public int getConsecinve() {
        return consecinve;
    }

    public void setConsecinve(int consecinve) {
        this.consecinve = consecinve;
    }
    

    public int getNpiezas() 
    {
        return npiezas;
    }

    public void setNpiezas(int npiezas) 
    {
        this.npiezas = npiezas;
    }
    
    

    

    
    
    
}
