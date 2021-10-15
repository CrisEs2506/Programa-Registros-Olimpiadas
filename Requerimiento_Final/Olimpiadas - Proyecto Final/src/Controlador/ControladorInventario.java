package Controlador;

import Modelo.Inventario;
import Modelo.InventarioDAO;
import Vista.InventarioGUI;
import Vista.LoginGUI;
import Vista.MenuGUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorInventario implements ActionListener
{
    InventarioGUI inventarioGUI = new InventarioGUI();
    Inventario inventario = new Inventario();
    LoginGUI loginGUI = new LoginGUI();
    MenuGUI menuGUI = new MenuGUI();
    InventarioDAO inventarioDAO = new InventarioDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ControladorInventario(InventarioGUI inventarioGUI)
    {
        this.inventarioGUI = inventarioGUI;
        this.inventarioGUI.jButtonRegistrarInventario.addActionListener(this);
        this.inventarioGUI.jButtonRegresar.addActionListener(this);
        this.inventarioGUI.jButtonCerrar.addActionListener(this);
        sede(inventarioGUI.jTableSede);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==inventarioGUI.jButtonRegistrarInventario)
        {
            botonRegistrarInventario();
        }
        
        if(e.getSource()==inventarioGUI.jButtonRegresar)
        {
            botonRegresarInventario();
        }
        
        if(e.getSource()==inventarioGUI.jButtonCerrar)
        {
            botonCerrarInventario();
        }
    }
    
    //Borrar todos los elementos de la Tabla para Mostrar una Nueva Consulta
    public void limpiarTabla(JTable tabla)
    {
        modelo = (DefaultTableModel) tabla.getModel();
        
        for(int i=0; i<tabla.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i = i-1;
        }
    }
    
    //Metodo para mostrar la tabla Sede cada vez que se abra la interfaz Inventario
    public void sede(JTable tabla)
    {  
        if(inventarioGUI.isVisible() == false)
        {
            modelo = (DefaultTableModel) tabla.getModel();
            List<Inventario> listaSede = inventarioDAO.mostrarSede();
            Object[] object = new Object[4];

            for(int i=0; i<listaSede.size(); i++)
            {
                object[0] = listaSede.get(i).getIdcomplejo();
                object[1] = listaSede.get(i).getNomcomplejo();
                object[2] = listaSede.get(i).getPresupuest();
                object[3] = listaSede.get(i).getDireccion();
                modelo.addRow(object);
            }
            
            inventarioGUI.jTableSede.setModel(modelo);
        }
    }
    
    //Metodo para mostrar la tabla Deporte cuando se haya seleccionado una Sede
    public void deporte(JTable tabla)
    {
        if(inventario.getIdcomplejo() != null)
        {
            limpiarTabla(inventarioGUI.jTableDeporte);
            
            modelo = (DefaultTableModel) tabla.getModel();
            List<Inventario> listaDeporte = inventarioDAO.mostrarDeporte();
            Object[] object = new Object[3];

            for(int i=0; i<listaDeporte.size(); i++)
            {
                object[0] = listaDeporte.get(i).getIddeporte();
                object[1] = listaDeporte.get(i).getNomdeporte();
                object[2] = listaDeporte.get(i).getNmaxintegrantes();
                modelo.addRow(object);
            }
            
            inventarioGUI.jTableDeporte.setModel(modelo);
        }
    }
    
    //Metodo para mostrar la tabla Equipamiento cuando se haya seleccionado un Deporte
    public void equipo(JTable tabla)
    {
        if(inventario.getIddeporte() != null)
        {
            limpiarTabla(inventarioGUI.jTableEquipamiento);
            
            modelo = (DefaultTableModel) tabla.getModel();
            List<Inventario> listaEquipo = inventarioDAO.mostrarEquipo();
            Object[] object = new Object[3];

            for(int i=0; i<listaEquipo.size(); i++)
            {
                object[0] = listaEquipo.get(i).getIdequipo();
                object[1] = listaEquipo.get(i).getNomequipo();
                object[2] = listaEquipo.get(i).getNpares();
                modelo.addRow(object);
            }
            
            inventarioGUI.jTableEquipamiento.setModel(modelo);
        }
    }
    
    //Metodo para mostrar la tabla Equipamiento cuando se haya seleccionado un Deporte
    public void estado(JTable tabla)
    {
        if(inventario.getIdequipo() != null)
        {
            limpiarTabla(inventarioGUI.jTableEstado);
            
            modelo = (DefaultTableModel) tabla.getModel();
            List<Inventario> listaEstado = inventarioDAO.mostrarEstado();
            Object[] object = new Object[3];

            for(int i=0; i<listaEstado.size(); i++)
            {
                object[0] = listaEstado.get(i).getIdestado();
                object[1] = listaEstado.get(i).getDescestado();
                modelo.addRow(object);
            }
            
            inventarioGUI.jTableEstado.setModel(modelo);
        }
    }
    
    //Metodo para crear el Registro con los datos ya suministrados
    public void botonRegistrarInventario()
    {
        String idInventario = inventarioGUI.jTextPieza.getText();
        String piezas = inventarioGUI.jTextCantidad.getText();
        
        inventario.setConsecinve(Integer.parseInt(idInventario));
        inventario.setNpiezas(Integer.parseInt(piezas));
        
        int respuesta = inventarioDAO.registrarInventario(inventario);
        
        if(respuesta == 1)
        {
            JOptionPane.showMessageDialog(inventarioGUI, "Registro de Inventario Agregado con Éxito");
        }
        else
        {
            JOptionPane.showMessageDialog(inventarioGUI, "Algo se Ingreso Erroneamente, por favor Vuelve a Intentarlo");
        }
    }
    
    public void botonRegresarInventario()
    {
        menuGUI.setVisible(true);
        inventarioGUI.setVisible(false);
    }
    
    public void botonCerrarInventario()
    {
        loginGUI.setVisible(true);
        inventarioGUI.setVisible(false);
    }
}
