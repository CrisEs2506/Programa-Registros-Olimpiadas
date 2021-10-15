package Modelo;

import static Vista.UnicoGUI.idComplejoUnico;

public class Unico 
{
    //Atributos Tabla Sede Unico
    private String idcomplejounico = idComplejoUnico;
    private String nomcomplejounico;
    private int presupuestounico;
    private String direccionunico;

    //Atributos Tabla Deporte
    private String idedeporteunico;
    private String nomdeporteunico;
    private int nmaxintegrantesunico;
    
    //Atributos Tabla Unico
    private String idunico;
    private String iddeporte;
    private String idcomplejo = idComplejoUnico;
    private double areaunico;
    
    //Getters and Setters de Tabla Sede
    public String getIdcomplejounico() 
    {
        return idcomplejounico;
    }

    public void setIdcomplejounico(String idcomplejounico) 
    {
        this.idcomplejounico = idcomplejounico;
    }

    public String getNomcomplejounico() 
    {
        return nomcomplejounico;
    }

    public void setNomcomplejounico(String nomcomplejounico) 
    {
        this.nomcomplejounico = nomcomplejounico;
    }

    public int getPresupuestounico() 
    {
        return presupuestounico;
    }

    public void setPresupuestounico(int presupuestounico) 
    {
        this.presupuestounico = presupuestounico;
    }

    public String getDireccionunico() 
    {
        return direccionunico;
    }

    public void setDireccionunico(String direccionunico) 
    {
        this.direccionunico = direccionunico;
    }
    
    //Getters and Setters de la Tabla Deporte
    public String getIdedeporteunico() 
    {
        return idedeporteunico;
    }

    public void setIdedeporteunico(String idedeporteunico) 
    {
        this.idedeporteunico = idedeporteunico;
    }

    public String getNomdeporteunico() 
    {
        return nomdeporteunico;
    }

    public void setNomdeporteunico(String nomequipounico) 
    {
        this.nomdeporteunico = nomequipounico;
    }

    public int getNmaxintegrantesunico() 
    {
        return nmaxintegrantesunico;
    }

    public void setNmaxintegrantesunico(int nmaxintegrantesunico) 
    {
        this.nmaxintegrantesunico = nmaxintegrantesunico;
    }
    
    //Setters and Getters de la Tabla Unico
    public String getIdunico() 
    {
        return idunico;
    }

    public void setIdunico(String idunico) 
    {
        this.idunico = idunico;
    }

    public String getIddeporte() 
    {
        return iddeporte;
    }

    public void setIddeporte(String iddeporte) 
    {
        this.iddeporte = iddeporte;
    }

    public String getIdcomplejo() 
    {
        return idcomplejo;
    }

    public void setIdcomplejo(String idcomplejo) 
    {
        this.idcomplejo = idcomplejo;
    }

    public double getAreaunico() 
    {
        return areaunico;
    }

    public void setAreaunico(double areaunico) 
    {
        this.areaunico = areaunico;
    }
}
